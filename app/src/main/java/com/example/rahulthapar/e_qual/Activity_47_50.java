package com.example.rahulthapar.e_qual;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity_47_50 extends Activity {

    RadioButton fourty7_1,fourty7_2,fourty9_1,fourty9_2,fifty_1,fifty_2,fifty_3;
    Button cont;
    private RadioGroup radiogrp,radiogrp1,radiogrp2;
    String choice = "";
    String choice1 = "";
    String choice2 = "";
    String data;
    EditText pinn;
    String pin="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        data = getIntent().getStringExtra("data");
        setContentView(R.layout.activity_activity_47_50);
        fourty7_1 = (RadioButton)findViewById(R.id.yes47);
        fourty7_2 = (RadioButton)findViewById(R.id.no47);
        pinn = (EditText)findViewById(R.id.edit_48);
        fourty9_1 = (RadioButton)findViewById(R.id.yes49);
        fourty9_2 = (RadioButton)findViewById(R.id.no49);
        fifty_1= (RadioButton)findViewById(R.id.radiobutton1_50);
        fifty_2= (RadioButton)findViewById(R.id.radiobutton2_50);
        fifty_3 = (RadioButton)findViewById(R.id.radiobutton3_50);

        cont = (Button)findViewById(R.id.save_next_act47);
        radiogrp  = (RadioGroup)findViewById(R.id.radiogroup47);
        radiogrp1  = (RadioGroup)findViewById(R.id.radiogroup49);
        radiogrp2  = (RadioGroup)findViewById(R.id.radiogroup50);
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                saveChoice();
                pin = pinn.getText().toString();
                data = data + "#" + choice+"#" +pin + "#" + choice1+"#"+ choice2;
                Toast.makeText(Activity_47_50.this, data, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Activity_47_50.this, Activity_51_53.class);
                i.putExtra("data", data);
                startActivity(i);
            }
        });
    }

    public void saveChoice(){
        int id = radiogrp.getCheckedRadioButtonId();
        int id1=radiogrp1.getCheckedRadioButtonId();
        int id2=radiogrp2.getCheckedRadioButtonId();
        switch(id) {
            case R.id.yes47:
                choice = "1";
                break;
            case R.id.no47:
                choice = "2";
                break;
        }
        switch(id1) {
            case R.id.yes49:
                choice1 = "1";
                break;
            case R.id.no49:
                choice1 = "2";
                break;
        }

        switch(id2) {
            case R.id.radiobutton1_50:
                choice = "1";
                break;
            case R.id.radiobutton2_50:
                choice = "2";
                break;
            case R.id.radiobutton3_50:
                choice = "3";
                break;
        }

    }


}
