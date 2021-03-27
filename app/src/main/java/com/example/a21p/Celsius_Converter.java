package com.example.a21p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Celsius_Converter extends AppCompatActivity {


    EditText Celsiusinput;
    Button BackforC;
    ImageButton button1inT;
    ImageButton button2inT;
    ImageButton button3inT;

    TextView textresult_CelsiustoFahrenheit;
    TextView textresult_CelsiustoKevin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celsius__converter);

        Celsiusinput = findViewById(R.id.Celsiusinput);

        textresult_CelsiustoFahrenheit = findViewById(R.id.textresult_CelsiustoFahrenheit);
        textresult_CelsiustoKevin = findViewById(R.id.textresult_CelciustoKevin);
        button1inT = findViewById(R.id.button1inT);
        button2inT = findViewById(R.id.button2inT);
        button3inT = findViewById(R.id.button3inT);
        BackforC = findViewById(R.id.BackforCelsius);

        BackforC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Celsius_Converter.this,MainActivity.class);
                startActivity(intent);
            }
        });



        button1inT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createerromessage();
            }
        });

        button2inT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createerromessage();
            }
        });

        button3inT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConverterforCelsius();
            }
        });
    }

    private void ConverterforCelsius(){
        String valueEntered3 = Celsiusinput.getText().toString();
        double TheCelsius = Double.parseDouble(valueEntered3);
        double TheFahrenheit = TheCelsius * 1.8 + 32;
        double TheKevin = TheCelsius + 273.15;
        textresult_CelsiustoFahrenheit.setText("" +TheCelsius + " degrees would be "+ String.format("%.2f", TheFahrenheit)+ " in Fahrenheit");
        textresult_CelsiustoKevin.setText("" +TheCelsius + " degrees would be "+ String.format("%.2f", TheKevin)+ " in Kevin");
    }

    private void createerromessage() {
        Toast.makeText(Celsius_Converter.this," Please select the right converting operation", Toast.LENGTH_LONG).show();
    }

}