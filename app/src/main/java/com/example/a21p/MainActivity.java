package com.example.a21p;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    EditText Edittextwithreturn;
    ImageButton button1inhome;
    ImageButton button2inhome;
    ImageButton  button3inhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);  //defining spinner in main page

        Edittextwithreturn = findViewById(R.id.Edittextwithreturn);  //defining edittext in main page
        button1inhome = findViewById(R.id.button1inhome);       //defining button1 ~ 3
        button2inhome = findViewById(R.id.button2inhome);
        button3inhome = findViewById(R.id.button3inhome);

        List<String> UnitConvertOptions = new ArrayList<>();         //creating new List for spinner to show
        UnitConvertOptions.add(0,"Choose Category");        // populating the lit with indexes of  0,1,2,3
        UnitConvertOptions.add("Meter to Centimeter, Inch and Foot");
        UnitConvertOptions.add("Kilogram  to Gram, Ounce and Pound");
        UnitConvertOptions.add("Celsius to Fahrenheit and Kevin");

        ArrayAdapter<String> OptionofConverterofadapter;  //Making adapter & styling em baby!
        OptionofConverterofadapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, UnitConvertOptions);

        OptionofConverterofadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // same with the dropdown layout.
        
        spinner.setAdapter(OptionofConverterofadapter); // attaching the adapter to the spinner.


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {   // if the spinner is selected : behaves as following.

                if (parent.getItemAtPosition(position).equals("Choose Category"))
                {
                    //do NOTHING! DON'T MOVE!
                }

                else
                {
                    String item = parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected: " + item, Toast.LENGTH_SHORT).show();

                    if (parent.getItemAtPosition(position).equals("Choose Category"))      //if they choose the option with the name of "Meter to Centimeter, Inch and Foot" behave as following.
                    {
                        Toast.makeText(MainActivity.this," Please make a selection in the spinner", Toast.LENGTH_LONG).show();
                    }

                    if (parent.getItemAtPosition(position).equals("Meter to Centimeter, Inch and Foot"))      //if they choose the option with the name of "Meter to Centimeter, Inch and Foot" behave as following.
                    {
                        Intent intent= new Intent(MainActivity.this,Meter_Converetr.class);
                        startActivity(intent);
                    }

                    if (parent.getItemAtPosition(position).equals("Kilogram  to Gram, Ounce and Pound"))      //if they choose the option with the name of "Kilogram  to Gram, Ounce and Pound" behave as following.
                    {
                        Intent intent= new Intent(MainActivity.this,Kilogram_Converter.class);
                        startActivity(intent);
                    }
                    if (parent.getItemAtPosition(position).equals("Celsius to Fahrenheit and Kevin"))      //if they choose the option with the name of "Celsius to Fahrenheit and Kevin" behave as following.
                    {
                        Intent intent = new Intent(MainActivity.this,Celsius_Converter.class);
                        startActivity(intent);
                    }
                }
            }

            public void onNothingSelected(AdapterView<?> parent){
                    // again, do nothing if not selected. Straight forward. this is a function created corresponding to the onItemSelected.
            }
        });

        button1inhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createerromessage();
            }
        });

        button2inhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createerromessage();
            }
        });

        button3inhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createerromessage();
            }
        });

        }

    private void createerromessage() {
        Toast.makeText(MainActivity.this," Please make a selection in the spinner", Toast.LENGTH_LONG).show();
    }

}
