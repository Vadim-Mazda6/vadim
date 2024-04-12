package com.example.vadim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {


    ImageButton imgButton;
    ImageButton imgButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imgButton = (ImageButton) findViewById(R.id.imageButton);

        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivities(new Intent[]{intent});

            }
        });

        imgButton2 = (ImageButton) findViewById(R.id.imageButton2);

        imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                startActivities(new Intent[]{intent});
            }
        });


    }






}
