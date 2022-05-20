package com.example.myapplication8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
    }

    public void prev(View view) {
        Intent intent =  new Intent(MainActivity12.this, MainActivity11.class);
        startActivity(intent);
    }

    public void submit(View view) {
        Intent intent =  new Intent(MainActivity12.this, MainActivity13.class);
        startActivity(intent);
    }
}