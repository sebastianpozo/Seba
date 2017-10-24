package com.example.seba.prueba2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Geminis extends AppCompatActivity {

    Button button222;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geminis);
        button222 = (Button)findViewById(R.id.button444);
        button222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Geminis.this, SecondActivity.class);
                startActivity(intent);

            }
        });
    }
}