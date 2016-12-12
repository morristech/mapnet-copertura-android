package co.maskyn.mapnetcopertura

import android.app.Activity
import android.os.Bundle

import com.thefinestartist.finestwebview.FinestWebView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        FinestWebView.Builder(this)
                .titleDefaultRes(R.string.app_name)
                .updateTitleFromHtml(false)
                .showUrl(false)
                .show("http://52.28.60.44/mapnetcopertura/")
    }
}
