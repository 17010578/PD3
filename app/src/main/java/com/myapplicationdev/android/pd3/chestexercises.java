package com.myapplicationdev.android.pd3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RadioGroup;

public class chestexercises extends AppCompatActivity {

    Button btnOk;
    RadioGroup rdg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chestexercises);

        rdg = findViewById(R.id.radioGroupChest);

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
