package com.example.vadim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity4 extends AppCompatActivity {

    ImageButton imgButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        imgButton5 = (ImageButton) findViewById(R.id.imageButton5);

        imgButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity4.this, MainActivity5.class);
                startActivities(new Intent[]{intent});
            }
        });
    }
}