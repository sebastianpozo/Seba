package com.example.seba.prueba2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {


    private Button Aries;
    private Button Sagitario;
    private Button Tauro;
    private Button Virgo;
    private Button Capricornio;
    private Button Geminis;
    private Button Libra;
    private Button Acuario;
    private Button Cancer;
    private Button Escorpio;
    private Button Piscis;


    Button btnSgte;
    Button button;
    Button button2;
    Button button3;
    Button btnSggte;
    Button btnSsgte;
    Button btnSgtte;
    Button btnSgtee;
    Button btnssgti;
    Button leo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnSgte = (Button)findViewById(R.id.btnPantalla2);
        btnSgte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SecondActivity.this, Piscis.class);
                startActivity(intent);
            }
        });

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SecondActivity.this, Virgo.class);
                startActivity(intent);

            }
        });

        button2 = (Button)findViewById(R.id.button444);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SecondActivity.this, Geminis.class);
                startActivity(intent);

            }
        });

        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SecondActivity.this, Ariess.class);
                startActivity(intent);

            }
        });

        btnSggte = (Button)findViewById(R.id.aaaa);

        btnSggte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, Libra.class);
                startActivity(intent);

            }
        });

        btnSsgte = (Button)findViewById(R.id.eeee);

        btnSsgte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SecondActivity.this, Acuario.class);
                startActivity(intent);

            }
        });

        btnSgtte = (Button)findViewById(R.id.iiii);
        btnSgtte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SecondActivity.this, Cancer.class);
                startActivity(intent);


            }
        });

        btnSgtee = (Button)findViewById(R.id.uuuu);
        btnSgtee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SecondActivity.this, Escorpio.class);
                startActivity(intent);

            }
        });

        btnssgti = (Button)findViewById(R.id.oooo);
        btnssgti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SecondActivity.this, Leo.class);
                startActivity(intent);

            }
        });

        leo = (Button)findViewById(R.id.eaea);
        leo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, Capricornio.class);
                startActivity(intent);

            }
        });

        Sagitario = (Button)findViewById(R.id.oeoe);
        Sagitario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, Sagitario.class);
                startActivity(intent);

            }
        });

        Tauro = (Button)findViewById(R.id.taaa);
        Tauro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, Tauro.class);
                startActivity(intent);

            }
        });








    }
}