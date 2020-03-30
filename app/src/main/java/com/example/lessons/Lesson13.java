package com.example.lessons;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;

public class Lesson13 extends AppCompatActivity {

    private ImageView cat, dog;
    private MediaPlayer meow, woof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson13);

        cat = (ImageView) findViewById(R.id.cat);
        dog = (ImageView) findViewById(R.id.dog);

        woof = MediaPlayer.create(this, R.raw.woof);
        meow = MediaPlayer.create(this, R.raw.meow);

        imageClick();
    }

    public void imageClick() {
        cat.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        meow.start();
                    }
                }
        );

        dog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        woof.start();
                    }
                }
        );
    }
}
