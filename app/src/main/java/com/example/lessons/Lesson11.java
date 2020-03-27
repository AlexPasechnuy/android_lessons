package com.example.lessons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class Lesson11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson11);
    }

    public void change(View view){
        Fragment fragment = null;
        switch(view.getId()) {
            case R.id.button:
                fragment = new FragmentOne();
                break;
            case R.id.button2:
                fragment = new FragmentTwo();
                break;
        }
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fr_place, fragment);
        ft.commit();
    }
}
