package com.techweezy.modcomandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class SecondActivity extends AppCompatActivity {
    WebView kak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
         kak= findViewById(R.id.web23);
         kak.loadUrl("file:///android_asset/kak.html");

    }
}
