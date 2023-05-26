package com.example.collectionx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class ResActivity extends AppCompatActivity {
    TextView textView;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);

        textView = findViewById(R.id.LOResFoodText);
        lottieAnimationView = findViewById(R.id.lottieRes);

        lottieAnimationView.setRepeatCount(2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(),RestuarantActivity.class);
                startActivity(i);
            }
        },5000);
    }
}