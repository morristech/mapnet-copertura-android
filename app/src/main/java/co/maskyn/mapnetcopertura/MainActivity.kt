package co.maskyn.mapnetcopertura

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        webview.settings.javaScriptEnabled = true
        webview.loadUrl("http://52.28.60.44/speed_test_senza_limiti");

        /*FinestWebView.Builder(this)
                .titleDefaultRes(R.string.app_name)
                .updateTitleFromHtml(false)
                .showUrl(false)
                .webViewLoadWithOverviewMode(true)
                .webViewUseWideViewPort(true)
                //.webViewOffscreenPreRaster(true)
                .show("http://52.28.60.44/speed_test_mirco")*/
    }
}
