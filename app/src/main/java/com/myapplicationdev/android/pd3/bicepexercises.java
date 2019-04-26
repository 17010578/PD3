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

    Button btnOk;
    RadioGroup rdg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bicepexercises);

        rdg = findViewById(R.id.radioGroupBicep);

//        btnOk.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Get the RadioGroup object
//                RadioGroup rg = findViewById(R.id.radioGroupBicep);
//
//                //Get the Id of the selected radio button in the RadioGroup
//                int selectedButtonID = rg.getCheckedRadioButtonId();
//
//                //Get the radio button from the id we had gotton above
//                RadioButton rb = findViewById(selectedButtonID);
//
//                //Show a toast that displays the text on the selected radio buttons
//
;//            }
//        });

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
