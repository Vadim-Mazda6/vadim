package com.example.vadim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity8 extends AppCompatActivity {

    ImageButton imgButton18;
    ImageButton imgButton19;
    ImageButton imgButton20;
    ImageButton imgButton14;
    ImageButton imgButton13;
    ImageButton imgButton12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        imgButton18 = (ImageButton) findViewById(R.id.imageButton18);

        imgButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity8.this, MainActivity7.class);
                startActivities(new Intent[]{intent});

            }
        });



            imgButton14 = (ImageButton) findViewById(R.id.imageButton14);

            imgButton14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(MainActivity8.this, MainActivity9.class);
                    startActivities(new Intent[]{intent});

                }
            });

        imgButton13 = (ImageButton) findViewById(R.id.imageButton13);

        imgButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity8.this, MainActivity10.class);
                startActivities(new Intent[]{intent});

            }
        });
        imgButton12 = (ImageButton) findViewById(R.id.imageButton12);

        imgButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity8.this, MainActivity11.class);
                startActivities(new Intent[]{intent});

            }
        });

        imgButton19 = (ImageButton) findViewById(R.id.imageButton19);

        imgButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity8.this, MainActivity15.class);
                startActivities(new Intent[]{intent});

            }
        });

        imgButton20 = (ImageButton) findViewById(R.id.imageButton20);

        imgButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity8.this, MainActivity14.class);
                startActivities(new Intent[]{intent});

            }
        });

    }
}