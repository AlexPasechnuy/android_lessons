package com.example.lessons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.List;

public class Lesson10 extends AppCompatActivity {

    private ListView list;
    private SeekBar seek;
    private String [] names = new String[] {"John", "Bob", "George", "Alex"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson10);
        list();
    }

    public void list(){
        list = (ListView)findViewById(R.id.listView);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.names, names);
        list.setAdapter(adapter);
        seek = (SeekBar)findViewById(R.id.seekBar);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String val = (String)list.getItemAtPosition(position);
                Toast.makeText(
                        Lesson10.this,"Name: " + val + ", seek value: " + seek.getProgress(),
                        Toast.LENGTH_LONG
                ).show();

            }
        });
    }
}
