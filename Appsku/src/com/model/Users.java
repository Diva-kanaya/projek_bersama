package com.model;

public class Users {

	public String Database = "appsku";
	
	public String TABLE_NAME = "USER";
	public String COLUM_ID_USER = "ID";
	public String COLUM_USERNAME_USER = "USERNAME";
	public String COLUM_PASSWORD_USER = "PASSWORD";
	public String COLUM_TYPE_USER = "TYPE";
	
	public String CREATE_TABLE_USER= "CREATE_TABLE"+TABLE_NAME+"("
			+COLUM_ID_USER+"INTEGER PRIMARY KEY_AUTOINCREMENT,"
			+COLUM_USERNAME_USER+" TEXT, "
			+COLUM_PASSWORD_USER+" TEXT, "
			+COLUM_TYPE_USER+"TEXT)";
	
	//
}
