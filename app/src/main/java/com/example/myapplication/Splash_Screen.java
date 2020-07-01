package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import no.nordicsemi.android.blinky.R;

public class Splash_Screen extends AppCompatActivity {

    private static final int DURATION = 1000;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(() -> {
            final Intent intent = new Intent(this, ScannerActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivity(intent);
            finish();
        }, DURATION);
    }

    @Override
    public void onBackPressed() {
        // We don't want the splash screen to be interrupted
    }
}
