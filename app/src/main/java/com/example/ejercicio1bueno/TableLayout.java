package com.example.ejercicio1bueno;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;

public class TableLayout extends AppCompatActivity {

    public EditText numeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        numeros = (EditText)findViewById(R.id.texto);

    }

    public void uno(View view) {
        String cadena = numeros.getText().toString();
        cadena += "1";
        numeros.setText(cadena);
    }

    public void dos(View view) {
        String cadena = numeros.getText().toString();
        cadena += "2";
        numeros.setText(cadena);
    }

    public void tres(View view) {
        String cadena = numeros.getText().toString();
        cadena += "3";
        numeros.setText(cadena);
    }

    public void cuatro(View view) {
        String cadena = numeros.getText().toString();
        cadena += "4";
        numeros.setText(cadena);
    }

    public void cinco(View view) {
        String cadena = numeros.getText().toString();
        cadena += "5";
        numeros.setText(cadena);
    }

    public void seis(View view) {
        String cadena = numeros.getText().toString();
        cadena += "6";
        numeros.setText(cadena);
    }

    public void siete(View view) {
        String cadena = numeros.getText().toString();
        cadena += "7";
        numeros.setText(cadena);
    }

    public void ocho(View view) {
        String cadena = numeros.getText().toString();
        cadena += "8";
        numeros.setText(cadena);
    }

    public void nueve(View view) {
        String cadena = numeros.getText().toString();
        cadena += "9";
        numeros.setText(cadena);
    }

    public void cero(View view) {
        String cadena = numeros.getText().toString();
        cadena += "0";
        numeros.setText(cadena);
    }

}
