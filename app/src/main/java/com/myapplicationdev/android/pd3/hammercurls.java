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
    Button buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hammercurls);



        tvTarget2= findViewById(R.id.textViewTarget2);
        tvBicep2 = findViewById(R.id.textViewBicep2);
        tvEquipments2 = findViewById(R.id.textViewEquipments2);
        buttonStart = findViewById(R.id.buttonStart);

        Intent intentReceived = getIntent();




        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),starthammercurls.class);
                startActivity(intent);
            }
        });
    }


}
