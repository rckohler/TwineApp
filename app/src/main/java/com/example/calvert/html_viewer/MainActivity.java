package com.example.calvert.html_viewer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView w = new WebView(this);
        w.setWebViewClient(new myWebClient());
        w.getSettings().setJavaScriptEnabled(true);
        w.loadUrl("file:///android_asset/a.html");
        System.out.println("Finished");
        setContentView(w);

            }
}


