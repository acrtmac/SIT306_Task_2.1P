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

public class Meter_Converetr extends AppCompatActivity {

    EditText Minput;
    Button BackforMeter;
    ImageButton button1inM;
    ImageButton button2inM;
    ImageButton button3inM;
    TextView textresult_MtoInch;
    TextView textresult_MtoCM;
    TextView textresult_MtoFoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter__converetr);

        Minput = findViewById(R.id.Minput);
        textresult_MtoInch = findViewById(R.id.textresult_MtoInch);
        textresult_MtoCM = findViewById(R.id.textresult_MtoCM);
        textresult_MtoFoot = findViewById(R.id.textresult_MtoFoot);
        button1inM= findViewById(R.id.button1inM);
        button2inM = findViewById(R.id.button2inM);
        button3inM = findViewById(R.id.button3inM);
        BackforMeter = findViewById(R.id.BackforMeter);

        BackforMeter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Meter_Converetr.this,MainActivity.class);
                startActivity(intent);
            }
        });

        button1inM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConverterforMeter();
            }
        });

        button2inM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            createerromessage();
        }
        });

        button3inM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            createerromessage();
        }
        });

}

    private void createerromessage() {
        Toast.makeText(Meter_Converetr.this," Please select the right converting operation", Toast.LENGTH_LONG).show();
    }

    private void ConverterforMeter() {
        String valueEntered1 = Minput.getText().toString();
        double TheM = Double.parseDouble(valueEntered1);
        double TheCM = TheM / 100;
        double TheInch = TheCM / 2.54;
        double TheFoot = TheInch * 12;
        textresult_MtoCM.setText("" +TheM + " m would be "+ String.format("%.2f", TheCM)+ " in cm");
        textresult_MtoInch.setText("" +TheM + " m would be "+ String.format("%.2f", TheInch)+ " in inches");
        textresult_MtoFoot.setText("" +TheM + " m would be "+ String.format("%.2f", TheFoot)+ " in feet");
    }

}