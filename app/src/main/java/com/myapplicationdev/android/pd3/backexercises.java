package com.myapplicationdev.android.pd3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class backexercises extends AppCompatActivity {

    Button btnBack;
    RadioGroup rdg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.backexercises);

        rdg = findViewById(R.id.radioGroupBack);
        btnBack = findViewById(R.id.buttonBack);


        setTitle("Back Exercises");

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),exercises.class);
                startActivity(intent);
            }
        });

        rdg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId==R.id.radioButtonRow){
                    Intent intent = new Intent(getBaseContext(),singlearmdumbbellrow.class);
                    startActivity(intent);
                }
                else if (checkedId == R.id.radioButtonWideRow){
                    Intent intent = new Intent(getBaseContext(),widerow
                            .class);
                    startActivity(intent);
                }
            }
        });


    }

}
