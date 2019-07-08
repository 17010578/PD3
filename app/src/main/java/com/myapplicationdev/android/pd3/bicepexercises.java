package com.myapplicationdev.android.pd3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.net.Inet4Address;

public class bicepexercises extends AppCompatActivity {

    Button btnBack;
    RadioGroup rdg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bicepexercises);

        rdg = findViewById(R.id.radioGroupBicep);
        btnBack = findViewById(R.id.buttonBack);

        setTitle("Bicep Excercises");

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
                if (checkedId==R.id.radioButtonBicepCurls){
                    Intent intent = new Intent(getBaseContext(),dumbbellbicepcurls.class);
                    startActivity(intent);
                }
                else if (checkedId == R.id.radioButtonHammerCurls){
                    Intent intent = new Intent(getBaseContext(),hammercurls.class);
                    startActivity(intent);
                }
            }
        });


    }

}
