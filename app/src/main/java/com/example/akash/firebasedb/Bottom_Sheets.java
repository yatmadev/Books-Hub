package com.example.akash.firebasedb;

import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.akash.firebasedb.R;

public class Bottom_Sheets extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(Bottom_Sheets.this);
                View parentView=getLayoutInflater().inflate(R.layout.dialog,null);
                bottomSheetDialog.setContentView(parentView);
                BottomSheetBehavior bottomSheetBehavior=BottomSheetBehavior.from((View) parentView.getParent());
                bottomSheetBehavior.setPeekHeight((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,100,getResources().getDisplayMetrics()));
                bottomSheetDialog.show();
                Button b1=(Button)parentView.findViewById(R.id.button1);
                Button b2=(Button)parentView.findViewById(R.id.button2);
                Button b3=(Button)parentView.findViewById(R.id.button3);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(Bottom_Sheets.this,"B1",Toast.LENGTH_SHORT).show();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(Bottom_Sheets.this,"B2",Toast.LENGTH_SHORT).show();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(Bottom_Sheets.this,"B2",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
