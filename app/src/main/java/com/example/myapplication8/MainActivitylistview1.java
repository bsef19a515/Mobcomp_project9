package com.example.myapplication8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivitylistview1 extends AppCompatActivity {

    ListView list;
    ArrayList<Learn> learn=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitylistview1);

        list=findViewById(R.id.listview);
        learn.add(new Learn("ONE",R.drawable.one));
        learn.add(new Learn("TWO",R.drawable.banana));
        learn.add(new Learn("THREE",R.drawable.apple));
        learn.add(new Learn("FOUR",R.drawable.lock));
        learn.add(new Learn("FIVE",R.drawable.car));
        learn.add(new Learn("SIX",R.drawable.pencil));
        learn.add(new Learn("SEVEN",R.drawable.cato));
        learn.add(new Learn("EIGTH",R.drawable.rats));
        learn.add(new Learn("NINE",R.drawable.cups));
        learn.add(new Learn("TEN",R.drawable.caps));

        MyAdapter adapter=new MyAdapter(this,learn);
        list.setAdapter(adapter);


    }
}