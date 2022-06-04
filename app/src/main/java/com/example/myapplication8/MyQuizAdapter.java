package com.example.myapplication8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyQuizAdapter extends ArrayAdapter<Quiz> {

    public MyQuizAdapter(@NonNull Context context, @NonNull ArrayList<Quiz> objects)
    {
        super(context,0,objects);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView , @NonNull ViewGroup parent){
        Quiz quiz=getItem(position);
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.quizlayoutlistview,parent,false);

        ImageView image=convertView.findViewById(R.id.imageView9);
        RadioButton radio1=convertView.findViewById(R.id.radioButton);
        RadioButton radio2=convertView.findViewById(R.id.radioButton2);
        RadioButton radio3=convertView.findViewById(R.id.radioButton3);

        String one=String.valueOf(quiz.getOpt1());
        String two=String.valueOf(quiz.getOpt2());
        String three=String.valueOf(quiz.getOpt3());


        image.setImageResource(quiz.getImage());
        radio1.setText(one);
        radio2.setText(two);
        radio3.setText(three);




        return convertView;
    }

}
