package com.example.myapplication8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void nxt(View view) {
        Intent intent =  new Intent(MainActivity5.this, MainActivity6.class);
        startActivity(intent);

    }

    public void prev(View view) {
        Intent intent =  new Intent(MainActivity5.this, MainActivity4.class);
        startActivity(intent);
    }
}