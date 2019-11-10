package com.example.akash.firebasedb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Example_list extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_list);
        pdfView=(PDFView)findViewById(R.id.pdfmad);
        pdfView.fromAsset("mad.pdf").load();
    }
}
