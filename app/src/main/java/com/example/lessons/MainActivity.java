package com.example.lessons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button lesson_6, lesson_8_9, lesson_10, lesson_11, lesson_12, lesson_13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        setTitle("Lessons");
    }


    public void addListenerOnButton(){
        lesson_6 = (Button)findViewById(R.id.lesson_6);
        lesson_8_9 = (Button)findViewById(R.id.lesson_8_9);
        lesson_10 = (Button)findViewById(R.id.lesson_10);
        lesson_11 = (Button)findViewById(R.id.lesson_11);
        lesson_12 = (Button)findViewById(R.id.lesson_12);
        lesson_13 = (Button)findViewById(R.id.lesson_13);

        lesson_6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".Lesson6");
                        startActivity(intent);
                    }
                }
        );

        lesson_8_9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".Lesson8");
                        startActivity(intent);
                    }
                }
        );

        lesson_10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".Lesson10");
                        startActivity(intent);
                    }
                }
        );

        lesson_11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".Lesson11");
                        startActivity(intent);
                    }
                }
        );

        lesson_12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".Lesson12");
                        startActivity(intent);
                    }
                }
        );

        lesson_13.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".Lesson13");
                        startActivity(intent);
                    }
                }
        );
    }
}
