package com.example.myapplication8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void nxt(View view) {
        Intent intent =  new Intent(MainActivity4.this, MainActivity5.class);
        startActivity(intent);

    }

    public void prev(View view) {
        Intent intent =  new Intent(MainActivity4.this, MainActivity3.class);
        startActivity(intent);
    }
}