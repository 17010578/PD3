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

public class exercises extends AppCompatActivity {

    TextView tvBicep;
    TextView tvBack;
    TextView tvChest;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercises);

        tvBack = findViewById(R.id.textViewBack);
        tvBicep = findViewById(R.id.textViewBicep);
        tvChest = findViewById(R.id.textViewChest);
        btnNext = findViewById(R.id.buttonNext);

        Intent intentReceived = getIntent();

        setTitle("Workouts");

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),ending.class);
                startActivity(intent);
            }
        });

        tvBicep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),bicepexercises.class);
                startActivity(intent);
            }
        });

        tvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),backexercises.class);
                startActivity(intent);
            }
        });

        tvChest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),chestexercises.class);
                startActivity(intent);
            }
        });


    }

//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v,
//                                    ContextMenu.ContextMenuInfo menuInfo) {
//        super.onCreateContextMenu(menu, v, menuInfo);
//
//        if(v.equals(tvBicep)){
//            menu.setHeaderTitle("Welcome To Bicep Workout!");
//            menu.add(0,0,0,"Dumbbell Bicep Curls");
//            menu.add(0,1,1,"Hammer Curls");
//        }
//        else if(v.equals(tvChest)){
//            menu.setHeaderTitle("Welcome To Chest Workout!");
//            menu.add(1,2,2," Dumbbell Squeeze Press ");
//            menu.add(1,3,3," Incline Bench Press");
//        }
//
//        else if(v.equals(tvBack)){
//            menu.setHeaderTitle("Welcome To Back Workout!");
//            menu.add(2,4,4,"Single-Arm Dumbbell Row");
//            menu.add(2,5,5,"Wide Row");
//        }
//    }

//    @Override
//    public boolean onContextItemSelected(MenuItem item) {
//        if(item.getItemId()==0) { //check whether the selected menu item ID is 0
//            //code for action
//            Intent intent = new Intent(getBaseContext(), dumbbellbicepcurls.class);
//            startActivity(intent);
//
//            return true; //menu item successfully handled
//
//        }else if (item.getItemId() == 1){
//
//            Intent intentCall = new Intent(getBaseContext(), hammercurls.class);
//            startActivity(intentCall);
//
//            return true;
//
//        } else if (item.getItemId() == 2){
//
//            Intent intent = new Intent(getBaseContext(),dumbbellsqueezepress.class);
//            startActivity(intent);
//
//            return true;
//
//        }else if (item.getItemId() == 3){
//
//            Intent intentCall = new Intent(getBaseContext(),inclinebenchpress.class);
//            startActivity(intentCall);
//
//            return true;
//        }else if (item.getItemId() == 4){
//
//            Intent intent = new Intent(getBaseContext(),singlearmdumbbellrow.class);
//            startActivity(intent);
//
//            return true;
//        } else if (item.getItemId() == 5){
//
//            Intent intentCall = new Intent(getBaseContext(),widerow.class);
//            startActivity(intentCall);
//
//            return true;
//        }
//        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
//    }


}
