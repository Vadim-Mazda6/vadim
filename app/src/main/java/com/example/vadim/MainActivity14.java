package com.example.vadim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity14 extends AppCompatActivity {

    ImageButton imgButton25;
    ImageButton imgButton26;

    ImageButton imgButton28;
    ImageButton imgButton23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        imgButton25 = (ImageButton) findViewById(R.id.imageButton25);

        imgButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity14.this, MainActivity7.class);
                startActivities(new Intent[]{intent});

            }
        });

        imgButton26 = (ImageButton) findViewById(R.id.imageButton26);

        imgButton26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity14.this, MainActivity15.class);
                startActivities(new Intent[]{intent});

            }
        });

        imgButton28 = (ImageButton) findViewById(R.id.imageButton28);

        imgButton28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity14.this, MainActivity8.class);
                startActivities(new Intent[]{intent});

            }
        });

        imgButton23 = (ImageButton) findViewById(R.id.imageButton23);

        imgButton23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity14.this, MainActivity16.class);
                startActivities(new Intent[]{intent});

            }
        });

    }
}