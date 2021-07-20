package com.decibelinc.OFT;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;


public class SplashScreen extends AppCompatActivity {



    private static int SPLASH_SCREEN_TIME=1000;
    private static final String RUN = "run";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Boolean isFirstRun = getSharedPreferences("run", MODE_PRIVATE)
                .getBoolean("isFirstRun", true);

        if (isFirstRun) {
            //show start activity

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    setContentView(R.layout.activity_main);
                    Bundle bundle = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),
                            android.R.anim.fade_in, android.R.anim.fade_out).toBundle();
                    startActivity(new Intent(SplashScreen.this, HomeActivity.class), bundle);
                    finish();
                }
            }, SPLASH_SCREEN_TIME);

        }else{

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    setContentView(R.layout.activity_main);
                    Bundle bundle = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),
                            android.R.anim.fade_in, android.R.anim.fade_out).toBundle();
                    startActivity(new Intent(SplashScreen.this, HomeActivity.class),bundle);
                    finish();
                }
            },SPLASH_SCREEN_TIME);}
    }
}