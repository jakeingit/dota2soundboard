package com.jakegosskuehn.axe;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Anny on 8/12/2015.
 */
public class Webview extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://play.google.com/store/apps/developer?id=Jake%20Goss-Kuehn&hl=en");
    }
}


