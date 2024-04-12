package com.example.vadim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;

public class MainActivity9 extends AppCompatActivity {


    public void Right(View v){
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
}