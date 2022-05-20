package com.example.myapplication8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
    }

    public void prev(View view) {
        Intent intent =  new Intent(MainActivity9.this, MainActivity8.class);
        startActivity(intent);
    }

    public void nxt(View view) {
        Intent intent =  new Intent(MainActivity9.this, MainActivity10.class);
        startActivity(intent);
    }
}