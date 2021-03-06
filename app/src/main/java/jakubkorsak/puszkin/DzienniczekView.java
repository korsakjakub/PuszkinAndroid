package jakubkorsak.puszkin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DzienniczekView extends AppCompatActivity {

    WebView webView;
    String path;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        webView = (WebView) findViewById(R.id.w);
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        //To włącza funkcjonalność zoomu pinch-to-zoom
        webSettings.setBuiltInZoomControls(true);
        //To wyłącza brzydkie przyciski sterujące zoomem
        webSettings.setDisplayZoomControls(false);
        path = "http://dziennik.1lo.gorzow.pl/";
        webView.loadUrl(path);
    }
}
