package com.example.hassan.task2_udacity;

import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button Team1_inc6;
    Button Team1_inc12;
    Button Team1_dinc4;
    Button Team2_inc6;
    Button Team2_inc12;
    Button Team2_dinc4;
    Button restart;
    TextView txt_inc_team1;
    TextView txt_inc_team2;

    int increament_decreament_Team1 = 0;
    int increament_decreament_Team2 = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_inc_team1 = findViewById(R.id.txtvalue_team1);
        txt_inc_team2 = findViewById(R.id.txtvalue_team2);
        Team1_inc6 = findViewById(R.id.button_inc6_team1);
        Team1_inc12 = findViewById(R.id.button_inc12_team1);
        Team1_dinc4 = findViewById(R.id.button_dinc4_team1);
        Team2_inc6 = findViewById(R.id.button_inc6_team2);
        Team2_inc12 = findViewById(R.id.button_inc12_team2);
        Team2_dinc4 = findViewById(R.id.button_dinc4_team2);
        restart = findViewById(R.id.restart);
        Team1_inc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_inc_team1.setText(String.valueOf(increament_decreament_Team1 + 6));
                increament_decreament_Team1 = increament_decreament_Team1 + 6;
            }
        });
        Team1_inc12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_inc_team1.setText(String.valueOf(increament_decreament_Team1 + 12));
                increament_decreament_Team1 = increament_decreament_Team1 + 12;
            }
        });
        Team1_dinc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_inc_team1.setText(String.valueOf(increament_decreament_Team1 - 4));
                increament_decreament_Team1 = increament_decreament_Team1 - 4;
            }
        });
        Team2_inc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_inc_team2.setText(String.valueOf(increament_decreament_Team2 + 6));
                increament_decreament_Team2 = increament_decreament_Team2 + 6;
            }
        });
        Team2_inc12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_inc_team2.setText(String.valueOf(increament_decreament_Team2 + 12));
                increament_decreament_Team2 = increament_decreament_Team2 + 12;
            }
        });
        Team2_dinc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_inc_team2.setText(String.valueOf(increament_decreament_Team2 - 4));
                increament_decreament_Team2 = increament_decreament_Team2 - 4;
            }
        });
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_inc_team1.setText(String.valueOf(0));
                txt_inc_team2.setText(String.valueOf(0));
            }
        });
    }
}