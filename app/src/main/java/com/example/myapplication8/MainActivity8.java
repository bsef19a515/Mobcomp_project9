package com.example.myapplication8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }

    public void prev(View view) {
        Intent intent =  new Intent(MainActivity8.this, MainActivity7.class);
        startActivity(intent);
    }

    public void nxt(View view) {
        Intent intent =  new Intent(MainActivity8.this, MainActivity9.class);
        startActivity(intent);
    }
}