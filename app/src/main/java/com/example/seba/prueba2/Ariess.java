package com.example.seba.prueba2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ariess extends AppCompatActivity {

    Button button3_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ariess);
        button3_5 = (Button)findViewById(R.id.button444);
        button3_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Ariess.this, SecondActivity.class);
                startActivity(intent);

            }
        });
    }
}