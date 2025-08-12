package com.scoreap.most.score.app.web

import android.app.Activity
import android.net.Uri
import androidx.browser.customtabs.CustomTabColorSchemeParams
import androidx.browser.trusted.TrustedWebActivityIntentBuilder
import com.google.androidbrowserhelper.trusted.TwaLauncher

import androidx.core.net.toUri
import com.scoreap.most.score.app.R

class TwaLauncherUtils(private val context: Activity) {
    private val launchers0: MutableList<TwaLauncher?> = ArrayList()
    private val toolbarColor: Int = context.resources.getColor(R.color.colorPrimaryDark)


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
        this.launchers0.add(twaLauncher)
    }
}
