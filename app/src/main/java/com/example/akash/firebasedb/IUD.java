package com.example.akash.firebasedb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class IUD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_list);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.add) {
            Toast.makeText(getApplicationContext(),"ryt",Toast.LENGTH_SHORT).show();
            Intent i=new Intent(getApplicationContext(),AddNotice1.class);
            startActivity(i);

        }
        else if(id == R.id.add2) {
            Toast.makeText(getApplicationContext(), "ryt", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getApplicationContext(), Notice.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

}

