package com.example.myapplication8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivityQuiz extends AppCompatActivity {
    ListView list;
    ArrayList<Quiz> quiz = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_quiz);

        list = findViewById(R.id.listviewquiz);
        quiz.add(new Quiz(R.drawable.bag, 2, 4, 5, 4));
        quiz.add(new Quiz(R.drawable.goats, 3, 1, 5, 3));
        quiz.add(new Quiz(R.drawable.jug, 5, 7, 3, 3));
        quiz.add(new Quiz(R.drawable.house, 1, 2, 8, 2));
        quiz.add(new Quiz(R.drawable.duck, 1, 7, 4, 7));
        quiz.add(new Quiz(R.drawable.circle, 9, 10, 3, 10));
        quiz.add(new Quiz(R.drawable.mango, 4, 2, 8, 4));
        quiz.add(new Quiz(R.drawable.dog, 2, 9, 6, 6));
        quiz.add(new Quiz(R.drawable.pen, 0, 2, 1, 1));
        quiz.add(new Quiz(R.drawable.stars7, 4, 7, 9, 7));

        MyQuizAdapter adapter = new MyQuizAdapter(MainActivityQuiz.this, quiz);
        list.setAdapter(adapter);


    }
}