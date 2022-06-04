package com.example.myapplication8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void learning(View view) {
        Intent intent =  new Intent(MainActivity.this, MainActivitylistview1.class);
        startActivity(intent);

    }

    public void quiz(View view) {
        Intent intent =  new Intent(MainActivity.this, MainActivity7.class);
        startActivity(intent);
    }
}