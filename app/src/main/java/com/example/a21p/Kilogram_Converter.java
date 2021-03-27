package com.example.a21p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Kilogram_Converter extends AppCompatActivity {



    EditText Kilograminput;
    Button BackforKilogram;
    ImageButton button1inW;
    ImageButton button2inW;
    ImageButton button3inW;
    TextView textresult_KilogramtoOunces;
    TextView textresult_KilogramtoGram;
    TextView textresult_KilogramtoPounds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilogram__converter);

        Kilograminput = findViewById(R.id.Kilograminput);

        BackforKilogram = findViewById(R.id.BackforKilogram);
        button1inW = findViewById(R.id.button1inW);
        button2inW = findViewById(R.id.button2inW);
        button3inW = findViewById(R.id.button3inW);
        textresult_KilogramtoOunces = findViewById(R.id.textresult_KilogramtoOunces);
        textresult_KilogramtoPounds = findViewById(R.id.textresult_KilogramtoPounds);
        textresult_KilogramtoGram = findViewById(R.id.textresult_KilogramtoGram);

        BackforKilogram.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kilogram_Converter.this,MainActivity.class);
                startActivity(intent);
            }
        });

        button1inW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createerromessage();
            }
        });


        button2inW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConverterforKilogram();
            }
        });

        button3inW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createerromessage();
            }
        });
    };

    private void ConverterforKilogram(){
        String valueEntered2 = Kilograminput.getText().toString();
        double TheKG = Double.parseDouble(valueEntered2);
        double TheOunce = TheKG * 35.274;
        double ThePound = TheKG * 2.20462;
        double TheGram = TheKG * 1000;
        textresult_KilogramtoOunces.setText("" +TheKG + " kg would be "+ String.format("%.2f", TheOunce)+ " in Ounce");
        textresult_KilogramtoPounds.setText("" +TheKG + " kg would be "+ String.format("%.2f", ThePound)+ " in Pound");
        textresult_KilogramtoGram.setText("" +TheKG + " kg would be "+ String.format("%.2f", TheGram)+ " in gram");
    }

    private void createerromessage() {
        Toast.makeText(Kilogram_Converter.this,"Please select the right converting operation", Toast.LENGTH_LONG).show();
    }
}