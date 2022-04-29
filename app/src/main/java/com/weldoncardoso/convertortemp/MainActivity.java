package com.weldoncardoso.convertortemp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText tempCe;
    Button btn_converter;
    TextView tp_resultado;
    TextView tk_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tempCe = findViewById(R.id.tempCe);
        btn_converter = findViewById(R.id.btn_converter);
        tp_resultado = findViewById(R.id.tp_resultado);
        tk_resultado = findViewById(R.id.tk_resultado);


        btn_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double tempCelsius = Double.parseDouble(tempCe.getText().toString());
                double tempF = tempCelsius * 1.8 + 32;
                double tempK = tempCelsius + 273.15;
                tp_resultado.setText(String.valueOf(tempF));
                tk_resultado.setText(String.valueOf(tempK));
        }
        });
    }
}