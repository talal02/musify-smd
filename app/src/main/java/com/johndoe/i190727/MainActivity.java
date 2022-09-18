package com.johndoe.i190727;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn7, btn9, btn10, btn11, btn15, btn16, btn18, btn19, btn20,btn21,btn22,btn23;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.screen1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Screen1.class);
                startActivity(i);
            }
        });

        btn2 = findViewById(R.id.screen2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, com.johndoe.i190727.Screen2.class);
                startActivity(i);
            }
        });

        btn3 = findViewById(R.id.screen3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Screen3.class);
                startActivity(i);
            }
        });

        btn4 = findViewById(R.id.screen4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, com.johndoe.i190727.Screen4.class);
                startActivity(i);
            }
        });

        btn5 = findViewById(R.id.screen5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Screen568.class);
                startActivity(i);
            }
        });

        btn7 = findViewById(R.id.screen7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, com.johndoe.i190727.Screen7.class);
                startActivity(i);
            }
        });

        btn9 = findViewById(R.id.screen9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, com.johndoe.i190727.Screen9.class);
                startActivity(i);
            }
        });

        btn10 = findViewById(R.id.screen10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, com.johndoe.i190727.Screen10.class);
                startActivity(i);
            }
        });


        btn11 = findViewById(R.id.screen11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, com.johndoe.i190727.Screen11to14.class);
                startActivity(i);
            }
        });

        btn15 = findViewById(R.id.screen15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Screen15.class);
                startActivity(i);
            }
        });

        btn16 = findViewById(R.id.screen16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Screen16to17.class);
                startActivity(i);
            }
        });

        btn18 = findViewById(R.id.screen18);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Screen18.class);
                startActivity(i);
            }
        });

        btn19 = findViewById(R.id.screen19);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Screen19.class);
                startActivity(i);
            }
        });

        btn21 = findViewById(R.id.screen21);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, com.johndoe.i190727.Screen21.class);
                startActivity(i);
            }
        });

        btn20 = findViewById(R.id.screen20);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, com.johndoe.i190727.Screen20.class);
                startActivity(i);
            }
        });
        btn22 = findViewById(R.id.screen22);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, com.johndoe.i190727.Screen22.class);
                startActivity(i);
            }
        });
        btn23 = findViewById(R.id.screen23);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, com.johndoe.i190727.Screen23.class);
                startActivity(i);
            }
        });


    }

}