package com.myapplicationdev.android.pd3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class singlearmdumbbellrow extends AppCompatActivity {

    TextView tvBack;
    TextView tvTarget;
    TextView tvEquipments;
    TextView tvOnline;
    Button buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singlearmdumbbellrow);



        tvTarget = findViewById(R.id.textViewTarget);
        tvBack = findViewById(R.id.textViewBack);
        tvEquipments = findViewById(R.id.textViewEquipments);
        tvOnline = findViewById(R.id.textViewOnline);
        buttonStart = findViewById(R.id.buttonStart);

        Intent intentReceived = getIntent();



        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),startdumbbellrow.class);
                startActivity(intent);
            }
        });


    }

}
