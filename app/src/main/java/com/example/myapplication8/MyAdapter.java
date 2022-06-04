package com.example.myapplication8;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Learn> {
    public MyAdapter(@NonNull Context context, @NonNull ArrayList<Learn> objects)
    {
        super(context,0,objects);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView , @NonNull ViewGroup parent){
        Learn learn=getItem(position);
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.learninglistview,parent,false);

        TextView text=convertView.findViewById(R.id.textView11);
        text.setText(learn.getCounting());

        ImageView image=convertView.findViewById(R.id.imageView6);
        image.setImageResource(learn.getImage());
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(),ItemClick.class);
                intent.putExtra("Img",learn.getImage());
                intent.putExtra("Count",learn.getCounting());
                getContext().startActivity(intent);

            }
        });
        return convertView;
    }
}
