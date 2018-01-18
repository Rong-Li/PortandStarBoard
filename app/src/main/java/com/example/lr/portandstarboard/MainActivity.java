package com.example.lr.portandstarboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Game guessGame = new Game();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updateUI();
        // ..get the Button  test
        Button btn1 = (Button) findViewById(R.id.leftBtnID);
        Button btn2 = (Button) findViewById(R.id.rightBtnID);
        // ..set what happens after clicked

        Button btn3 = (Button) findViewById(R.id.meansLeft);
        Button btn4 = (Button) findViewById(R.id.meansRight);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Port (left) is red", Toast.LENGTH_SHORT).show();
                Log.i("MyApp","Port (left) is red");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Starboard (right) is green", Toast.LENGTH_SHORT).show();
                Log.i("MyApp","Starboard (right) is green");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String endMessage;
                Game.Side userGuess = Game.Side.PORT;
                if (guessGame.checkIfCorrect(userGuess)) {
                    endMessage = "Correct!";
                    Log.i("MyApp", "“User guess of Port was Correct!");
                } else {
                    endMessage = "Incorrect!";
                    Log.i("MyApp", "“User guess of Port was Incorrect!");

                }
                Toast.makeText(getApplicationContext(), endMessage, Toast.LENGTH_SHORT).show();
                updateUI();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String endMessage;
                Game.Side userGuess = Game.Side.STARBOARD;
                if (guessGame.checkIfCorrect(userGuess)) {
                    endMessage = "Correct!";
                    Log.i("MyApp", "“User guess of Port was Correct!");
                } else {
                    endMessage = "Incorrect!";
                    Log.i("MyApp", "“User guess of Port was Incorrect!");
                }
                Toast.makeText(getApplicationContext(), endMessage, Toast.LENGTH_SHORT).show();
                updateUI();
            }
        });

    }
    private void updateUI(){
        guessGame = new Game();
        TextView textview = (TextView) findViewById(R.id.sideID);
        String side = guessGame.getChosenSideName();
        textview.setText(side);
    }
    //
    //
}
