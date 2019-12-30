package com.example.paintart.views;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.example.paintart.R;


public class WebViewClass extends AppCompatActivity {

    private WebView webView2;
    private String value;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view_layout);

        value = getIntent().getExtras().getString("url");
        System.out.println(value);

        webView2 = findViewById(R.id.webView2);
        WebSettings webSettings = webView2.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView2.setWebViewClient(new WebViewClient());

        webView2.loadUrl(value);

    }
}