package com.example.akash.firebasedb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSgnIn, btnSgnUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSgnIn = (Button)findViewById(R.id.button7);
        btnSgnUp = (Button)findViewById(R.id.button6);

        btnSgnIn.setOnClickListener(this);
        btnSgnUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button7:
                Intent signIn = new Intent(MainActivity.this,Select_user.class);
                startActivity(signIn);
                break;
            case R.id.button6:
                Intent signUp = new Intent(MainActivity.this,SignUp.class);
                startActivity(signUp);
                break;
            default:
                break;
        }

    }
}
