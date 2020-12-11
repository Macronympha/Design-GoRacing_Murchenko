package com.example.practica_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Typeface font = Typeface.createFromAsset(getAssets(), "arial.ttf");
        TextView v = (TextView) findViewById(R.id.textView2);
        v.setTypeface(font);
        TextView f1 = (TextView) findViewById(R.id.textView3);
        f1.setTypeface(font);
        Button s = (Button) findViewById(R.id.button);
        s.setTypeface(font);
        Button s1 = (Button) findViewById(R.id.button2);
        s1.setTypeface(font);
    }
}