package com.example.task08;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btn; ToggleButton tB; Switch sw; View v1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btn);
        tB=findViewById(R.id.tB);
        sw=findViewById(R.id.sw);
        v1=findViewById(R.id.background);
    }

    public void go(View view){
        if(tB.isChecked() && sw.isChecked())
            v1.setBackgroundColor(Color.GREEN);
        else if(tB.isChecked() && !sw.isChecked())
            v1.setBackgroundColor(Color.BLUE);
        else if(!tB.isChecked() && sw.isChecked())
            v1.setBackgroundColor(Color.YELLOW);
        else
            v1.setBackgroundColor(Color.RED);
    }
}