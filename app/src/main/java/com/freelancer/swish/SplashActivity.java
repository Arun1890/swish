package com.freelancer.swish;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.freelancer.swish.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {

    private ActivitySplashBinding binding;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        handler = new Handler();

        handler.postDelayed(() -> {
            Intent selectIntent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(selectIntent);
            finish();
        }, 2000);

    }
}