package com.example.vadim;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity7 extends AppCompatActivity {

    ImageButton imgButton7;
    ImageButton imgButton9;

    ImageButton imgButton10;
    ImageButton imgButton36;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        imgButton7 = (ImageButton) findViewById(R.id.imageButton7);

        imgButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity7.this, MainActivity15.class);
                startActivities(new Intent[]{intent});

            }
        });

        imgButton9 = (ImageButton) findViewById(R.id.imageButton9);

        imgButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity7.this, MainActivity14.class);
                startActivities(new Intent[]{intent});

            }
        });

        imgButton10 = (ImageButton) findViewById(R.id.imageButton10);

        imgButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity7.this, MainActivity8.class);
                startActivities(new Intent[]{intent});

            }
        });

        imgButton36 = (ImageButton) findViewById(R.id.imageButton36);

        imgButton36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity7.this, MainActivity18.class);
                startActivities(new Intent[]{intent});

            }
        });

    }
}