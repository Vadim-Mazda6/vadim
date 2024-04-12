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

public class MainActivity15 extends AppCompatActivity {

    ImageButton imgButton32;
    ImageButton imgButton31;

    ImageButton imgButton29;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        imgButton32 = (ImageButton) findViewById(R.id.imageButton32);

        imgButton32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity15.this, MainActivity8.class);
                startActivities(new Intent[]{intent});

            }
        });

        imgButton31 = (ImageButton) findViewById(R.id.imageButton31);

        imgButton31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity15.this, MainActivity14.class);
                startActivities(new Intent[]{intent});

            }
        });

        imgButton29 = (ImageButton) findViewById(R.id.imageButton29);

        imgButton29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity15.this, MainActivity7.class);
                startActivities(new Intent[]{intent});

            }
        });

    }
}