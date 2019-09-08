package com.example.midterm07600498;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toast t = Toast.makeText(   profile.this,"Welcome",Toast.LENGTH_SHORT);
        t.show();

    }
}
