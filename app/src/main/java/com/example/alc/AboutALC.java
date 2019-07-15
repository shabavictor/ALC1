package com.example.alc;

import android.net.http.SslError;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toolbar;

public class AboutALC extends AppCompatActivity {

            @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_about_alc);
                setContentView(R.layout.activity_about_alc);
                this.setTitle("About ALC");
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            WebView myWebView = new WebView(this);
            myWebView = findViewById(R.id.webview1);
            myWebView.setWebViewClient(new WebViewClient(){
                @Override
                public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
                    handler.proceed();
                }
            });
            myWebView.loadUrl("http://www.andela.com/alc/");
            WebSettings webSettings = myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            if (Build.VERSION.SDK_INT >=19) {
                myWebView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
            }




        }

    }





