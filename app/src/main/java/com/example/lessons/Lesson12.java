package com.example.lessons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class Lesson12 extends AppCompatActivity implements
        GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener{

    private TextView text;
    private GestureDetectorCompat gd;

    private AutoCompleteTextView actv;
    private String[] cars = new String[]{"BMW", "Ford", "Porsche", "Great Wall", "Ferrari", "Volvo", "Mazeratti", "Mazda", "McLaren"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson12);

        text = (TextView)findViewById(R.id.status);
        gd = new GestureDetectorCompat(this, this);
        gd.setOnDoubleTapListener(this);

        actv = (AutoCompleteTextView)findViewById(R.id.autoComp);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item, cars);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        gd.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        text.setText("Single tap: " + e.toString());
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        text.setText("Double tap: " + e.toString());
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        text.setText("Double tap event: " + e.toString());
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        text.setText("Down: " + e.toString());
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        text.setText("Show press: " + e.toString());
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        text.setText("Single tap up: " + e.toString());
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        text.setText("Scroll: " + e1.toString() + e2.toString() + distanceX + distanceY);
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        text.setText("Long press: " + e.toString());
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        text.setText("Flind: " + e1.toString() + e2.toString() + velocityX + velocityY);
        return false;
    }
}
