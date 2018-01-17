package com.example.lr.portandstarboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ..get the Button  test
        Button btn1 = (Button) findViewById(R.id.leftBtnID);
        Button btn2 = (Button) findViewById(R.id.rightBtnID);
        // ..set what happens after clicked
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
    }
}
