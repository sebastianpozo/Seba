package com.example.seba.prueba2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    Button btn;
    EditText usr, psd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList listado2 = new ArrayList();
        listado2.add("Juan Perez");
        listado2.add("Roberto Gonzalez");
        listado2.add("Camila Barrera");
        listado2.add("Isaac Riveros");
        listado2.add("Mijal Providel");



        usr = (EditText) findViewById(R.id.usr);
        psd = (EditText) findViewById(R.id.psd);
        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usr.getText().toString().equals("Admin") && psd.getText().toString().equals("password")) {
                    Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_LONG);
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}


