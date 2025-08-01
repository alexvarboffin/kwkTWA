package com.telegramstickers.catalogue;

import static androidx.activity.result.ActivityResultLauncherKt.launch;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.trusted.TrustedWebActivityIntentBuilder;

import com.google.androidbrowserhelper.trusted.QualityEnforcer;
import com.google.androidbrowserhelper.trusted.TwaLauncher;
import com.telegramstickers.catalogue.web.TwaLauncherUtils;

//
//com.google.androidbrowserhelper.trusted.LauncherActivity

public class MainActivity extends AppCompatActivity {

    private static final String TAG0 = "@@@";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });


//        DemoUtils.makeDemoToolbar(this, findViewById(
//                android.R.id.content
//        ));
    }

    @Override
    protected void onResume() {
        super.onResume();
        TextView k = findViewById(R.id.text);

//        String bb = mm.getProviderPackage();
//        k.setText(bb);
//
//        try {
//            Uri url = Uri.parse(getString(R.string.trustedUrl)+"1.txt");
////            mm.launch(new TrustedWebActivityIntentBuilder(url), new QualityEnforcer(), null, null,
////                    new TwaLauncher.FallbackStrategy() {
////                        @Override
////                        public void launch(Context context, TrustedWebActivityIntentBuilder trustedWebActivityIntentBuilder, @Nullable String s, @Nullable Runnable runnable) {
////
////                            //launch: com.android.chrome
////                            Log.d(TAG0, "launch: " + s);
////                        }
////                    });
//            mm.launch(
//                    Uri.parse(getString(R.string.trustedUrl)
////                        + "/"
////                        + getPackageName()
//                    )
//            );
//            //finish();
//        } catch (Exception e) {
//            k.setText(e.getLocalizedMessage());
//            Log.d("@@@", "onResume: " + e.getLocalizedMessage());
//        }

        new TwaLauncherUtils(this).launchUrl(getString(R.string.trustedUrl));
        finish();
    }
}