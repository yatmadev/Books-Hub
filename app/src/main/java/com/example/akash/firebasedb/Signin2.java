package com.example.akash.firebasedb;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.akash.firebasedb.Model.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Signin2 extends AppCompatActivity {
    Button btnSignIn;
    EditText edtPhone,edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin2);
        edtPhone = (EditText) findViewById(R.id.editText3);
        edtPassword = (EditText) findViewById(R.id.editText4);
        btnSignIn = (Button) findViewById(R.id.button19);

        //Init Firebase

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference table_user = database.getReference("User");

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final ProgressDialog mDialog = new ProgressDialog(Signin2.this);
                mDialog.setMessage("Please waiting...");
                mDialog.show();

                table_user.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        //Check if user not exist in database
                        if (dataSnapshot.child(edtPhone.getText().toString()).exists()&& edtPhone.getText().toString().length()>=10) {
                            //get User information
                            mDialog.dismiss();
                            User user = dataSnapshot.child(edtPhone.getText().toString()).getValue(User.class);
                            user.setPhone(edtPhone.getText().toString()); //set Phone
                            if (user.getPassword().equals(edtPassword.getText().toString())) {
                                {
                                    Toast.makeText(Signin2.this, "Sign in successfully !!", Toast.LENGTH_SHORT).show();
                                    Intent booksHub = new Intent(Signin2.this,IUD.class);
                                    startActivity(booksHub);
                                    finish();
                                }

                            } else {
                                Toast.makeText(Signin2.this, "Wrong password !!!", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else {
                            mDialog.dismiss();
                            Toast.makeText(Signin2.this, "User not exist !", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });

    }
}


