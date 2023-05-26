package com.example.collectionx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class FasActivity extends AppCompatActivity {
    TextView textView;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fas);

        textView = findViewById(R.id.lottieTextFas);
        lottieAnimationView = findViewById(R.id.lottieFas);

        lottieAnimationView.setRepeatCount(1);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(),FashionActivity.class);
                startActivity(i);
            }
        },5000);
    }
}