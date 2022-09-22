package com.example.calculadorasegunda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt_respuesta;
    private EditText num1;
    private EditText num2;
    private Button btn_suma;
    private Button btn_resta;
    private Button btn_division;
    private Button btn_multiplicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_respuesta = findViewById(R.id.respuesta);
        num1= findViewById(R.id.num1);
        num2= findViewById(R.id.num2);
        btn_suma = findViewById(R.id.button_suma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_respuesta.setText(suma(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()))+"");
            }
        });
        btn_resta = findViewById(R.id.button_resta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_respuesta.setText(resta(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()))+"");
            }
        });
        btn_division = findViewById(R.id.button_division);
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_respuesta.setText(division(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()))+"");
            }
        });
        btn_multiplicacion = findViewById(R.id.button_multiplicacion);
        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_respuesta.setText(multiplicacion(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()))+"");
            }
        });


    }
    public int suma(int a, int b){

        return a+b;
    }
    public int resta(int a, int b){

        return a-b;
    }
    public int division(int a, int b){
    int respuesta = 0;
    if(b!=0) {
        respuesta = a / b;
    }
        return respuesta;
    }
    public int multiplicacion(int a, int b){

        return a*b;
    }
}