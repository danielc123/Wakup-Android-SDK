package com.yellowpineapple.offers101.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;

/**
 * Created by agutierrez on 13/02/15.
 */
@EActivity
public class WebViewActivity extends ParentActivity {

    @Extra int titleId = 0;
    @Extra String url = null;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Setup view
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        // Get notification
        if (url != null) webView.loadUrl(url);
        if (titleId != 0) setTitle(titleId);
        setContentView(webView);
    }

}