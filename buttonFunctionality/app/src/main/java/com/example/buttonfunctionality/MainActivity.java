package com.example.buttonfunctionality;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {

        EditText username = (EditText) findViewById(R.id.editTextTextPersonName);
        Log.i("username", username.getText().toString());

        EditText password = (EditText) findViewById(R.id.editTextTextPassword2);
        Log.i("password", password.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}