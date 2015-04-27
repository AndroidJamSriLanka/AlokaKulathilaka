package com.example.aloka.disasterreport;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

//import com.parse.Parse;
//import com.parse.ParseObject;


public class Register extends ActionBarActivity {
   /* EditText editTextUsername;
    EditText editTextPassword;
    EditText editTextEmail;
    SharedPreferences sharedPreferences;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_register, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onRegisterButtonClick(View view) {
        Parse.initialize(this, "KF28QeW38hEu8k19WgREEpo7l0ZAde4gsw70eq5Z", "UenvBIVtMlarsDHE1aWCK9pKHgZXPerJCMtJ8XHh");

        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();
        String email = editTextEmail.getText().toString();

        ParseObject testObject = new ParseObject("User");
        testObject.put("Username", username);
        testObject.put("Password", password);
        testObject.put("Email", email);
        testObject.saveInBackground();

        Log.d("Register", "Username :" + username + " , Password :" + password+"Email: "+email);


    }*/
}
