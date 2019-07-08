package com.myapplicationdev.android.pd3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class chestexercises extends AppCompatActivity {

    Button btnBack;
    RadioGroup rdg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chestexercises);

        rdg = findViewById(R.id.radioGroupChest);
        btnBack = findViewById(R.id.buttonBack);

        setTitle("Chest Exercises");

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

                if (checkedId==R.id.radioButtonSqueezePress){
                    Intent intent = new Intent(getBaseContext(),dumbbellsqueezepress.class);
                    startActivity(intent);
                }
                else if (checkedId == R.id.radioButtonBenchPress){
                    Intent intent = new Intent(getBaseContext(),inclinebenchpress
                            .class);
                    startActivity(intent);
                }
            }
        });


    }

}
