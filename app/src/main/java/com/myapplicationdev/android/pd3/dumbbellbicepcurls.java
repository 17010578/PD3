package com.myapplicationdev.android.pd3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dumbbellbicepcurls extends AppCompatActivity {

    TextView tvBicep;
    TextView tvTarget;
    TextView tvEquipments;
    TextView tvOnline;
    Button buttonStart, buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dumbbellbicepcurls);

        tvTarget = findViewById(R.id.textViewTarget);
        tvBicep = findViewById(R.id.textViewBicep);
        tvEquipments = findViewById(R.id.textViewEquipments);
        buttonStart = findViewById(R.id.buttonStart);
        buttonBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();

        setTitle("Dumbbell Bicep Curls");

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
                Intent intent = new Intent(getBaseContext(),startbicepcurls.class);
                startActivity(intent);
            }
        });


    }

}
