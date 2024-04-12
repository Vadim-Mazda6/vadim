package com.example.vadim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity12 extends AppCompatActivity {


    ImageButton imgButton24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        imgButton24 = (ImageButton) findViewById(R.id.imageButton24);

        imgButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity12.this, MainActivity13.class);
                startActivities(new Intent[]{intent});

            }
        });

    }
        public void Right(View v){
            Intent intent = new Intent(this, MainActivity11.class);
            startActivity(intent);

    }
}