package com.example.akash.firebasedb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class OfficialSite extends AppCompatActivity {
    private WebView wbView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_official_site);
        wbView=(WebView)findViewById(R.id.webview);
        wbView.setWebViewClient(new WebViewClient());
        wbView.loadUrl("https://www.tutorialspoint.com");
        WebSettings webSettings=wbView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    public void onBackPressed(){
        if(wbView.canGoBack()){
            wbView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
