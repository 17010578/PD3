package com.myapplicationdev.android.pd3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class hammercurls extends AppCompatActivity {

    TextView tvBicep2;
    TextView tvTarget2;
    TextView tvEquipments2;
    TextView tvOnline2;
    Button buttonStart, buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hammercurls);

        tvTarget2= findViewById(R.id.textViewTarget2);
        tvEquipments2 = findViewById(R.id.textViewEquipments2);
        buttonStart = findViewById(R.id.buttonStart);
        buttonBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();

        setTitle("Hammer Curls");

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),bicepexercises.class);
                startActivity(intent);
            }
        });

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),starthammercurls.class);
                startActivity(intent);
            }
        });
    }


}
