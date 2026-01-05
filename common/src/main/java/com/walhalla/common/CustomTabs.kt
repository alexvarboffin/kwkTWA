package com.walhalla.common

import android.app.Activity
import android.content.Context
import android.net.Uri
import androidx.browser.customtabs.CustomTabsIntent
import androidx.core.net.toUri

class CustomTabs(private val context: Activity) {
    private val customTabsIntent: CustomTabsIntent = CustomTabUtils.customWeb(context)


    fun launchUrl(url: String) {
        try {
//        FirebaseAnalytics mFirebaseAnalytics = FirebaseAnalytics.getInstance(context);
//        Bundle bundle = new Bundle();
//        bundle.putString("goz_ad_click", "1");
//        mFirebaseAnalytics.logEvent("in_offer_open_click", bundle);
            customTabsIntent.launchUrl(context, url.toUri())
        } catch (e: Exception) {
            DLog.handleException(e)
        }
    }
}