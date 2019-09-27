package com.example.oneshot;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.content.Intent;

import static android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN;


public class Splashscreen extends Activity {

    private final int DURACION_SPLASH = 4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(FLAG_FULLSCREEN, FLAG_FULLSCREEN);


        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent intent = new Intent(Splashscreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            };
    },DURACION_SPLASH);
}

}