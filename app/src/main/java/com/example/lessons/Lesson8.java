package com.example.lessons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Lesson8 extends AppCompatActivity {

    private ImageView img;
    private Button btn;
    private EditText email, passw;

    public static final String correct_email = "qwerty@gmail.com";
    public static final String correct_passw = "qwerty123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson8);
        setTitle("Lesson 8");
        login();
    }

    public void login (){
        img = (ImageView)findViewById(R.id.statusImg);
        btn = (Button)findViewById(R.id.login);
        email = (EditText) findViewById(R.id.email);
        passw = (EditText) findViewById(R.id.password);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().equals(correct_email) && passw.getText().toString().equals(correct_passw))
                    img.setImageResource(R.drawable.tick);
                else
                    img.setImageResource(R.drawable.cross);
            }
        });
    }
}
