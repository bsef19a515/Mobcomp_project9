package com.example.myapplication8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemClick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_click);

        Intent intent=getIntent();
        int image=intent.getIntExtra("Img",R.drawable.error);
        ImageView imgview=findViewById(R.id.imageView8);
        imgview.setImageResource(image);

        String count=intent.getStringExtra("Count");
        TextView textlist=findViewById(R.id.textView13);
        textlist.setText(count);


        Button btn=findViewById(R.id.button17);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ItemClick.this,MainActivitylistview1.class);
                startActivity(intent);
            }
        });

    }
}