package com.example.myapplication8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity13 extends AppCompatActivity {
   TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        text=findViewById(R.id.textView10);
        Intent intent = getIntent();
        String count=String.valueOf(intent.getIntExtra("score",0));
        text.setText(count);

    }

    public void home(View view) {
        Intent intent =  new Intent(MainActivity13.this, MainActivity.class);
        startActivity(intent);

    }


}