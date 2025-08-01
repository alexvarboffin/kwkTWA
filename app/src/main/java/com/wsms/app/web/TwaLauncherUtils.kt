package com.wsms.app.web

import android.app.Activity
import android.net.Uri
import android.widget.Toast
import androidx.browser.customtabs.CustomTabColorSchemeParams
import androidx.browser.trusted.TrustedWebActivityIntentBuilder
import com.google.androidbrowserhelper.trusted.TwaLauncher
import com.wsms.app.BuildConfig
import com.wsms.app.R
import androidx.core.net.toUri

class TwaLauncherUtils(private val context: Activity) {
    private val launchers0: MutableList<TwaLauncher?> = ArrayList<TwaLauncher?>()
    private val toolbarColor: Int

    init {
        toolbarColor = context.resources.getColor(R.color.colorPrimaryDark)
    }


    fun launchUrl(url: String) {
        //Configure the color of the address bar

        val params = CustomTabColorSchemeParams.Builder()
            .setToolbarColor(toolbarColor) //.setNavigationBarColor(context.getResources().getColor(R.color.colorPrimaryDark))
            .build()
        val toolbarColor = TrustedWebActivityIntentBuilder(
            url.toUri()
        )
            .setDefaultColorSchemeParams(params)
        //.setNavigationBarColor(Color.WHITE) //deprecated
        //.setToolbarColor(Color.WHITE); //deprecated
        //TwaLauncher twaLauncher = new TwaLauncher(getApplicationContext());
        val twaLauncher = TwaLauncher(context)
        twaLauncher.launch(
            toolbarColor,
            null,
            null,
            object : Runnable {
                override fun run() {
                    //completetionCallback
                }
            }
        )
        if (BuildConfig.DEBUG) {
            Toast.makeText(context, "" + this.launchers0.size, Toast.LENGTH_SHORT).show()
        }
        this.launchers0.add(twaLauncher)
    }
}
