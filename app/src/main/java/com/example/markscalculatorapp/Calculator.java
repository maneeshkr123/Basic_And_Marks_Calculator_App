package com.example.markscalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    public void calculate(View view){
        EditText maths = (EditText) findViewById(R.id.maths);
        EditText eng = (EditText) findViewById(R.id.eng);
        EditText phy = (EditText) findViewById(R.id.phy);
        EditText chem = (EditText) findViewById(R.id.chem);
        EditText web = (EditText) findViewById(R.id.web);
        EditText total = (EditText) findViewById(R.id.total);
        EditText avg= (EditText) findViewById(R.id.avg);
        EditText perc= (EditText) findViewById(R.id.perc);

        int sum = Integer.parseInt(maths.getText()+"") + Integer.parseInt(eng.getText()+"") + Integer.parseInt(phy.getText()+"") + Integer.parseInt(chem.getText()+"") + Integer.parseInt(web.getText()+"");
        total.setText(sum+"");

        float aveg = sum/5;
        avg.setText(aveg+"");

        perc.setText(aveg+"%");


    }
}