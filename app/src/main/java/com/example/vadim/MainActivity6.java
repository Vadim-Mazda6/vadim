package com.example.vadim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity6 extends AppCompatActivity {

    ImageButton imgButton8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        imgButton8 = (ImageButton) findViewById(R.id.imageButton8);

        imgButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity6.this, MainActivity7.class);
                startActivities(new Intent[]{intent});

            }
        });


    }

    public void Sign_Up1(View v) {
        Intent intent = new Intent(MainActivity6.this, MainActivity5.class);
        startActivity(intent);
    }

}