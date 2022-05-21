package com.example.myapplication8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity8 extends AppCompatActivity implements  View.OnClickListener{

    CheckBox check1,check2,check3,check4,check5,check6;
   int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        check1=findViewById(R.id.checkBox);
        check1.setOnClickListener(this);

        check2=findViewById(R.id.checkBox2);
        check2.setOnClickListener(this);

        check3=findViewById(R.id.checkBox3);
        check3.setOnClickListener(this);

        check4=findViewById(R.id.checkBox7);
        check4.setOnClickListener(this);

        check5=findViewById(R.id.checkBox8);
        check5.setOnClickListener(this);

        check6=findViewById(R.id.checkBox9);
        check6.setOnClickListener(this);



    }
    @Override
    public void onClick(View v) {
        switch (v.getId( )) {
            case R.id.checkBox2:
                if (check2.isChecked())
                counter++;
                break;
            case R.id.checkBox9:
                if (check6.isChecked())
                    counter++;
                break;
        }

    }




    public void prev(View view) {
        Intent intent =  new Intent(MainActivity8.this, MainActivity7.class);
        startActivity(intent);
    }

    public void nxt(View view) {
        Intent intent =  new Intent(MainActivity8.this, MainActivity9.class);
        intent.putExtra("score", counter);
        startActivity(intent);
    }
}