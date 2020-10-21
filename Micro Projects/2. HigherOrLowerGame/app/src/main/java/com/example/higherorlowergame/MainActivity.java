package com.example.higherorlowergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void guess(View view){

        //Uncomment the below line for testing purpose - to see if guess button is linked to this function or now.
        //Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();

        //The Random Number is being generated below in the onCreate because if the number is generated everytime the "Guess" is clicked, then the user can never 'guess'. So the number is generated at startup.

        EditText guessNumber = (EditText) findViewById(R.id.guessNumber);

        //Getting the user input and checking.
        //THe below line will help to get input, convert to string. Since int cannot be converted to string we use Integer.parseInt();
        int guessInt = Integer.parseInt(guessNumber.getText().toString());

        //Uncomment the below line to see the number in the logcat/run. ~Used for testing purpose.
        //Log.i("Number", "" + guessNumber.getText().toString());


        //Checking by specifying conditions
        if(guessInt > randomNumber){
            Toast.makeText(MainActivity.this, "The Input Number Is Greater Than Random Number", Toast.LENGTH_SHORT).show();
        }
        else if(randomNumber > guessInt) {
            Toast.makeText(MainActivity.this, "The Input Number is Smaller Than the Random Number", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this, "You Guessed It Right!", Toast.LENGTH_SHORT).show();
        }

    } //End of guess

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Generating Random Number
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1; //This will help to generate random number


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}