package com.wsms.app

import android.app.Activity
import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import com.wsms.app.web.CustomTabs
import com.wsms.app.web.TwaLauncherUtils

fun makeDemoToolbar(context: Activity, parent: ViewGroup, defUrl :String) {
    // Create a LinearLayout with horizontal orientation for RadioButtons
    val radioLayout = LinearLayout(context)
    radioLayout.setLayoutParams(
        LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
    )
    radioLayout.setOrientation(LinearLayout.HORIZONTAL)
    radioLayout.setGravity(Gravity.CENTER)
    radioLayout.setBackgroundColor(Color.RED)


    //        Button button = new Button(context);
//        button.setText("1: GAME");
//        button.setGravity(Gravity.CENTER);
//        Button btnWebView = new Button(context);
//        btnWebView.setText("WebView");
//        btnWebView.setGravity(Gravity.CENTER);
    val buttonTWA = Button(context)
    buttonTWA.setText("TWA")
    buttonTWA.setGravity(Gravity.CENTER)

    val buttonCts = Button(context)
    buttonCts.setText("CustomTabs")
    buttonCts.setGravity(Gravity.CENTER)


    // Create a RadioGroup for switching WebView visibility
    val layout = LinearLayout(context)
    layout.setLayoutParams(
        LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
    )
    layout.setOrientation(LinearLayout.HORIZONTAL)
    layout.setGravity(Gravity.CENTER)
    //layout.addView(button);
    //layout.addView(btnWebView);
    layout.addView(buttonTWA)
    layout.addView(buttonCts)

    //        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
//
//        });
//        button.setOnClickListener(v -> {
//            context.makeScreen(new UIVisibleDataset(ScreenType.GAME_VIEW, null));
//        });
//        btnWebView.setOnClickListener(v -> {
//            //presenter.wrapContentRequest();
//            context.makeScreen(new UIVisibleDataset(ScreenType.WEB_VIEW, defUrl));
//        });
    buttonTWA.setOnClickListener(View.OnClickListener { v: View? ->
        TwaLauncherUtils(context).launchUrl(defUrl)
    })
    buttonCts.setOnClickListener(View.OnClickListener { v: View? ->
        CustomTabs(context).launchUrl(defUrl)
    })
    // Add RadioGroup to LinearLayout
    radioLayout.addView(layout)

    // Add LinearLayout to the main layout container
    parent.addView(radioLayout)
    val layoutParams = radioLayout.getLayoutParams() as FrameLayout.LayoutParams
    layoutParams.gravity = Gravity.BOTTOM
    radioLayout.setLayoutParams(layoutParams)
}