package com.example.lessons;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Lesson6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson6);
        addListenerOnButton();
        setTitle("Lesson 6");
    }

    private EditText pass;
    private Button show_hint, alert;
    private RatingBar rating;
    private TextView text_show;


    public void addListenerOnButton() {
        pass = (EditText) findViewById(R.id.editText);
        show_hint = (Button) findViewById(R.id.button);
        alert = (Button) findViewById(R.id.alert_btn);

        show_hint.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        show_hint.setText("Done");
                        Toast.makeText(
                                Lesson6.this, pass.getText(),
                                Toast.LENGTH_SHORT
                        ).show();
                    }
                }
        );

        rating = (RatingBar)findViewById(R.id.ratingBar);
        text_show = (TextView)findViewById(R.id.textView);

        rating.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        text_show.setText("Value: " + String.valueOf(rating));
                    }
                }
        );

        alert.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder a_builder = new AlertDialog.Builder(Lesson6.this);
                        a_builder.setMessage("Do you want to close app?")
                                .setCancelable(false)
                                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        finish();
                                    }
                                })
                                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alert = a_builder.create();
                        alert.setTitle("App closing");
                        alert.show();
                    }
                }
        );
    }
}
