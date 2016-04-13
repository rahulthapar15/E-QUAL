package com.example.rahulthapar.e_qual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    RadioButton home,hostel,rented;
    Button pincode;
    EditText pinn;
    private RadioGroup radiogrp;
    String choice = "";
    String data;
    String pin = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        data = getIntent().getStringExtra("data");
        setContentView(R.layout.activity_3);

        home = (RadioButton)findViewById(R.id.home);
        hostel = (RadioButton)findViewById(R.id.hostel);
        rented = (RadioButton)findViewById(R.id.rented);
        pincode = (Button)findViewById(R.id.save_next_act3);
        radiogrp  = (RadioGroup)findViewById(R.id.radioGroup);
        pinn = (EditText)findViewById(R.id.pin);

        pincode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                saveChoice();
                pin = pinn.getText().toString();
                data = data + "#" + choice + "#"+pin;
                Toast.makeText(Activity3.this, data, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Activity3.this, Activity4.class);
                i.putExtra("data", data);
                startActivity(i);
            }
        });

    }

    public void saveChoice(){

        int id = radiogrp.getCheckedRadioButtonId();

        switch(id) {
            case R.id.home:
                choice = "1";
                break;
            case R.id.hostel:
                choice = "2";

                break;
            case R.id.rented:

                choice = "3";
                break;

        }

    }
}