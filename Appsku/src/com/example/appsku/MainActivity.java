package com.example.appsku;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	private Button btnSignin;
	private Button btnSignup;
	private Button btnbackSignin;
	private Button btnbackSignup;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnSimpansign =(Button) findViewById(R.id.btnsimpansigin);
		btnSignin = (Button) findViewById(R.id.btnSignins);
		btnSignup = (Button) findViewById(R.id.btnSignup);
		
		btnbackSignin = (Button) findViewById(R.id.btnBackSignIn);
		btnbackSignup = (Button) findViewById(R.id.btnBackSignUp);
		
		btnSignin.setOnClickListener(this);
		btnSignup.setOnClickListener(this);
		
	}


	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnSignins:
			
			break;
		case R.id.btnSignup:
			
			break;
			
		default:
			break;
		}
		
	}
}
