package com.example.akash.firebasedb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddNotice1 extends Activity implements View.OnClickListener{
    private Button addTodoBtn,updateBtn,deleteBtn;
    private EditText subjectEditText;
    private EditText descEditText;
    private long _id;

    private DBManager dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_notice1);
        subjectEditText = (EditText)findViewById(R.id.edit_notice);
        descEditText = (EditText)findViewById(R.id.edit_descr);

        addTodoBtn = (Button)findViewById(R.id.addrecord);


        dbManager = new DBManager(this);
        dbManager.open();
        addTodoBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.addrecord:

                final String name = subjectEditText.getText().toString();
                final String desc = descEditText.getText().toString();

                dbManager.insert(name, desc);

                Intent main = new Intent(AddNotice1.this, IUD.class)
                        .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                startActivity(main);
                break;

        }
    }


}
