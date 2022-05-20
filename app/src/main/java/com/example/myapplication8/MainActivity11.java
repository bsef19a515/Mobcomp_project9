package com.example.myapplication8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
    }

    public void prev(View view) {
        Intent intent =  new Intent(MainActivity11.this, MainActivity10.class);
        startActivity(intent);
    }

    public void nxt(View view) {
        Intent intent =  new Intent(MainActivity11.this, MainActivity12.class);
        startActivity(intent);
    }
}