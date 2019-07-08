package com.myapplicationdev.android.pd3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class widerow extends AppCompatActivity {

    TextView tvBack;
    TextView tvTarget;
    TextView tvEquipments;
    Button buttonStart, buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.widerow);

        tvTarget = findViewById(R.id.textViewTarget3);
        tvBack = findViewById(R.id.textViewBack);
        tvEquipments = findViewById(R.id.textViewEquipments3);
        buttonStart = findViewById(R.id.buttonEnd);
        buttonBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();

        setTitle("Wide Row");

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),backexercises.class);
                startActivity(intent);
            }
        });

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),startwiderow.class);
                startActivity(intent);
            }
        });
    }


}
