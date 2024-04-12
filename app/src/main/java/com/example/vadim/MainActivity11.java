package com.example.vadim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity11 extends AppCompatActivity {

    ImageButton imgButton22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        imgButton22 = (ImageButton) findViewById(R.id.imageButton22);

        imgButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity11.this, MainActivity12.class);
                startActivities(new Intent[]{intent});

            }
        });
    }
        public void Right (View v){
            Intent intent = new Intent(this, MainActivity8.class);
            startActivity(intent);
        }
    }
