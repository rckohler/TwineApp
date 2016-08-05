package com.example.calvert.html_viewer;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class myWebClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        // TODO Auto-generated method stub
        view.loadUrl(url);
        return true;
    }
}