package com.database;

import com.model.Users;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLHelper extends SQLiteOpenHelper {

	Context context;
	String dbname;
	
	public SQLHelper(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub\
		this.context = context;
		this.dbname =name;
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(new Users().CREATE_TABLE_USER);
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub, abaikan
	}

	public boolean insertContact (String name, String password, String email) {
	      SQLiteDatabase db = this.getWritableDatabase();
	      ContentValues contentValues = new ContentValues();

	      contentValues.put(new Users().COLUM_USERNAME_USER, name);
	      contentValues.put(new Users().COLUM_PASSWORD_USER, password);
	      contentValues.put(new Users().COLUM_TYPE_USER, email);
	      
	      db.insert(new Users().TABLE_NAME,  null, contentValues);
	      return true;
	   }
	   
	public Cursor checkAkun(String name){
		SQLiteDatabase db = this.getReadableDatabase();
		  Cursor res = db.rawQuery("select * from"+new Users().TABLE_NAME+" WHERE "
		          +new Users().COLUM_USERNAME_USER+"="+name,null);
		  return res;
		 }
	} 