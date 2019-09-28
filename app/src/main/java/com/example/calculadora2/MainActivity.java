package com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText v1;
    EditText v2;
    TextView r;
    Button sumarbtn;
    Button restarbtn;
    Button dividirbtn;
    Button multiplicarbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora_main);

        v1 = findViewById(R.id.valor1_number);
        v2 = findViewById(R.id.valor2_number);
        r = findViewById(R.id.resultado_text);
        sumarbtn = findViewById(R.id.sumar_button);
        restarbtn = findViewById(R.id.restar_button);
        dividirbtn = findViewById(R.id.dividir_button);
        multiplicarbtn = findViewById(R.id.multiplicar_button);

        sumarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double resultado = Double.parseDouble(v1.getText().toString()) + Double.parseDouble(v2.getText().toString());
                r.setText(resultado.toString());
            }
        });

        restarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double resultado = Double.parseDouble(v1.getText().toString()) - Double.parseDouble(v2.getText().toString());
                r.setText(resultado.toString());
            }
        });

        dividirbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double resultado = Double.parseDouble(v1.getText().toString()) / Double.parseDouble(v2.getText().toString());
                r.setText(resultado.toString());
            }
        });

        multiplicarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double resultado = Double.parseDouble(v1.getText().toString()) * Double.parseDouble(v2.getText().toString());
                r.setText(resultado.toString());
            }
        });

    }
}
