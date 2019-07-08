package com.myapplicationdev.android.pd3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dumbbellsqueezepress extends AppCompatActivity {

    TextView tvChest;
    TextView tvTarget;
    TextView tvEquipments;
    TextView tvOnline;
    Button buttonStart, buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dumbbellsqueezepress);

        tvTarget = findViewById(R.id.textViewTarget3);
        tvChest = findViewById(R.id.textViewChest);
        tvEquipments = findViewById(R.id.textViewEquipments3);
        buttonStart = findViewById(R.id.buttonStart);
        buttonBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();

        setTitle("Dumbbell Squeeze Press");

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),chestexercises.class);
                startActivity(intent);
            }
        });

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),startsqueezepress.class);
                startActivity(intent);
            }
        });


    }

}
