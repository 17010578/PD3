package com.myapplicationdev.android.pd3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class startwiderow extends AppCompatActivity {

    TextView timertext;
    Button timer;
    TextView tvOnline;
    Button btnEnd;

    CountDownTimer countdown;
    long time = 60000;
    boolean timerunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.widerow);



        timertext = findViewById(R.id.countdown_text);
        timer = findViewById(R.id.timer);
        tvOnline = findViewById(R.id.textViewOnline);
        btnEnd = findViewById(R.id.buttonEnd);
        Intent intentReceived = getIntent();


        timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startStop();
            }
        });
        tvOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=LktGPg-AkvY"));
                startActivity(intent);
            }
        });

        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), exercises.class);
                startActivity(intent);
            }
        });

    }

    public void startStop(){
        if (timerunning){
            stopTimer();
        }
        else{
            startTimer();
        }
    }

    public void startTimer(){
        countdown = new CountDownTimer(time,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            time = millisUntilFinished;
            updateTimer();
            }

            @Override
            public void onFinish() {

            }
        }.start();
        timer.setText("Pause");
        timerunning = true;
    }

    public  void stopTimer(){
        countdown.cancel();
        timer.setText("Start");
        timerunning = false;
    }

    public void updateTimer(){
        int min = (int) time / 60000;
        int sec = (int) time % 60000 / 1000;

        String timeLeft;

        timeLeft = "" + min;
        timeLeft += ":";

        if (sec <10) timeLeft += "0";

        timeLeft += sec;

        timertext.setText(timeLeft);
    }

}
