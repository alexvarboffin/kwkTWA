package com.scoreap.most.score.app

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.scoreap.most.score.app.web.TwaLauncherUtils


//
//com.google.androidbrowserhelper.trusted.LauncherActivity
class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.enableEdgeToEdge()//Android 15 или более поздней версии sdk 35
        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(
//            findViewById<View>(R.id.main),
//            OnApplyWindowInsetsListener { v: View?, insets: WindowInsetsCompat? ->
//                val systemBars = insets!!.getInsets(WindowInsetsCompat.Type.systemBars())
//                v!!.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//                insets
//            })


//        makeDemoToolbar(this, findViewById(
//                android.R.id.content
//        ));
    }

    override fun onResume() {
        super.onResume()
//        val k = findViewById<TextView>(R.id.text)
//        val mm = TwaLauncher(this)
//        k.text = mm.providerPackage//com.android.chrome
//
//        try {
//            val url = (getString(R.string.trustedUrl) + "1.txt").toUri()
//            mm.launch(
//                TrustedWebActivityIntentBuilder(url), QualityEnforcer(), null, null
//            ) { context, trustedWebActivityIntentBuilder, s, runnable -> //launch: com.android.chrome
//
//                Log.d(TAG0, "launch: $s")
//            }
//            //mm.launch((getString(R.string.trustedUrl) + "/" + packageName).toUri())
//            //finish();
//        } catch (e: Exception) {
//            k.text = e.localizedMessage
//            Log.d("@@@", "onResume: " + e.localizedMessage)
//        }

        runCatching {
            TwaLauncherUtils(this).launchUrl(getString(R.string.trustedUrl))
        }.onFailure{
            Log.d(TAG0, "onResume: " + it.localizedMessage)
        }
        finish()
    }

    companion object {
        private const val TAG0 = "@@@"
    }
}