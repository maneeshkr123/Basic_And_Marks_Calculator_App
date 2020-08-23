package com.example.markscalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openApp(View view){
        Intent intent = new Intent(this, Calculator.class);
        startActivity(intent);
    }

    public void opencal(View view){
        Intent intent = new Intent(this, BCalculator.class);
        startActivity(intent);
    }
}