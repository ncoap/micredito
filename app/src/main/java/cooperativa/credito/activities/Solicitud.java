package cooperativa.credito.activities;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import cooperativa.credito.R;

public class Solicitud extends Activity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitud);

        webView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setBuiltInZoomControls(true);
        webView.setWebViewClient(new Callback());
        webView.setWebChromeClient(new WebChromeClient());
        webView.loadUrl("http://www.prevencionenlinea.com/");
        webView.requestFocus();
    }


    private class Callback extends WebViewClient{  //HERE IS THE MAIN CHANGE.

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return (false);
        }

    }
}
