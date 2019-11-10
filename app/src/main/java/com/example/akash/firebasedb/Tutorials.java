package com.example.akash.firebasedb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tutorials extends AppCompatActivity {
    Button b1,b2,b3,b5,b6;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button1);
        b3=(Button)findViewById(R.id.button2);
        b5=(Button)findViewById(R.id.button4);
        b6=(Button)findViewById(R.id.button5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Introduction.class);
                startActivity(i);
            }
        });
         b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Activity.class);
                startActivity(i);
            }
        });

       b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),TitleLayout.class);
                startActivity(i);
            }
        });


       b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Int_Frag.class);
                startActivity(i);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Threads.class);
                startActivity(i);
            }
        });

    }
}
