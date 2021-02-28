package com.example.ulangansql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_activity);

        Thread splash = new Thread(){
            public void run(){
                try {
                    sleep(2000);
                }
                catch (InterruptedException a){
                    a.printStackTrace();
                }
                finally {
                    startActivity(new Intent(SplashScreen.this,MainActivity.class));
                    finish();
                }
            }
        };
        splash.start();
    }
}