package com.example.mywebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {

    WebView webView ;
    WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView)findViewById(R.id.webView1);
        webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        untuk mengaktifkan bs yang belum muncul
        webSettings.setDomStorageEnabled(true);
        webView.setWebViewClient(new WebViewClient());
//        nnti dicopas aja linik dari web nya dibawah sini yaa :)
        webView.loadUrl("https://www.kai.id/");
        //        membuat tampilan full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}