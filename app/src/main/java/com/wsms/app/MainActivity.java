//package com.wsms.app;
//
//import android.os.Bundle;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.wsms.app.web.TwaLauncherUtils;
//
////
////com.google.androidbrowserhelper.trusted.LauncherActivity
//
//public class MainActivity extends AppCompatActivity {
//
//    private static final String TAG = "@@@";
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
////        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
////            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
////            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
////            return insets;
////        });
//
//
////        DemoUtils.makeDemoToolbar(this, findViewById(
////                android.R.id.content
////        ));
//
//        new TwaLauncherUtils(this).launchUrl(getString(R.string.trustedUrl)+"/app");
//        finish();
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
////        TextView k = findViewById(R.id.text);
////        String bb = mm.getProviderPackage();
////        k.setText(bb);
////
////        try {
////            Uri url = Uri.parse(getString(R.string.trustedUrl));
//////            mm.launch(new TrustedWebActivityIntentBuilder(url), new QualityEnforcer(), null, null,
//////                    new TwaLauncher.FallbackStrategy() {
//////                        @Override
//////                        public void launch(Context context, TrustedWebActivityIntentBuilder trustedWebActivityIntentBuilder, @Nullable String s, @Nullable Runnable runnable) {
//////
//////                            //launch: com.android.chrome
//////                            Log.d(TAG0, "launch: " + s);
//////                        }
//////                    });
////            mm.launch(
////                    Uri.parse(getString(R.string.trustedUrl)
//////                        + "/"
//////                        + getPackageName()
////                    )
////            );
////
////        } catch (Exception e) {
////            k.setText(e.getLocalizedMessage());
////            Log.d("@@@", "onResume: " + e.getLocalizedMessage());
////        }
//    }
//}