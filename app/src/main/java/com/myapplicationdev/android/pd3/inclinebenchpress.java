package com.myapplicationdev.android.pd3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class inclinebenchpress extends AppCompatActivity {

    TextView tvChest;
    TextView tvTarget;
    TextView tvEquipments;
    TextView tvOnline;
    Button buttonStart, buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inclinebenchpress);

        tvTarget = findViewById(R.id.textViewTarget);
        tvChest = findViewById(R.id.textViewBicep);
        tvEquipments = findViewById(R.id.textViewEquipments);
        buttonStart = findViewById(R.id.buttonStart);
        buttonBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();

        setTitle("Incline Bench Press");

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
                Intent intent = new Intent(getBaseContext(),startbenchpress.class);
                startActivity(intent);
            }
        });


    }

}
