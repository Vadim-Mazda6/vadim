package com.example.vadim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        ImageView anim = findViewById(R.id.animca);

        anim.setBackgroundResource(R.drawable.animation);

        AnimationDrawable frameAnimation = (AnimationDrawable) anim.getBackground();

        new CountDownTimer(2650, 1000) {

            public void onTick(long millisUntilFinished) {
                frameAnimation.start();
            }

            public void onFinish() {
                frameAnimation.stop();
                anim.setBackground(getDrawable(R.drawable.goodtick));
                TextView suc = findViewById(R.id.textView37);
                suc.setText("Transaction Successful");
            }

        }.start();
    }
    public void track(View v){
        Intent intent = new Intent(this, MainActivity14.class);
        startActivity(intent);
    }

    public void home(View v){
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
}