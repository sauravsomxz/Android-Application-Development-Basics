package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("DefaultLocale")
    public void convert(View view) {

        //This will help to get the input value from the user
        EditText amountToDollar = (EditText) findViewById(R.id.editTextNumberDecimal);

        //This will help to convert Text to Double
        Double amountDollar = Double.parseDouble(amountToDollar.getText().toString());

        //This will help to convert Dollar to INR
        Double amountInDollar = amountDollar * 73.47;

        //This is to show the converted amount back to user
        Toast.makeText(MainActivity.this, "Amount In Dollar: " + String.format("%.2f", amountInDollar) + " INR", Toast.LENGTH_LONG).show();

        //Uncomment the line below if you want to see the input in the logCat/Run. This can be helpful for testing purpose.
        //Log.i("Amount", "" + amountToDollar.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}