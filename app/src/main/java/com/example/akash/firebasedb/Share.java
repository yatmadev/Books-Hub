package com.example.akash.firebasedb;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Share extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
    }

    public void sendmail(View v){
        EditText txtEmailto=(EditText)findViewById(R.id.txtEmailTo);
        EditText txtSubject=(EditText)findViewById(R.id.txtSubject);
        EditText txtMessage=(EditText)findViewById(R.id.txtMessage);

        String[] TO={txtEmailto.getText().toString()};
        String[] CC={""};
        String subject=txtSubject.getText().toString();
        String msg=txtMessage.getText().toString();

        Intent i=new Intent(Intent.ACTION_SEND);
        i.setData(Uri.parse("mail to:"));
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_EMAIL,TO);
        i.putExtra(Intent.EXTRA_CC,CC);
        i.putExtra(Intent.EXTRA_SUBJECT,subject);
        i.putExtra(Intent.EXTRA_TEXT,msg);
        try {
            startActivity(Intent.createChooser(i, "Sending Mail..."));
            finish();
        }
        catch (ActivityNotFoundException ex)
        {
            Toast.makeText(Share.this,"App not found",Toast.LENGTH_LONG).show();


        }
    }
}
