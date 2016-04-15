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

public class Activity_54_3 extends Activity {
    RadioButton fifty4_3_1,fifty4_3_2,fifty4_3_3,fifty4_3_4,fifty4_3_5;
    Button cont;
    private RadioGroup radiogrp;
    String choice = "";
    String data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = getIntent().getStringExtra("data");
        setContentView(R.layout.activity_activity_54_3);
        fifty4_3_1 = (RadioButton)findViewById(R.id.radiobutton1_54_3);
        fifty4_3_2 = (RadioButton)findViewById(R.id.radiobutton2_54_3);
        fifty4_3_3 = (RadioButton)findViewById(R.id.radiobutton3_54_3);
        fifty4_3_4 = (RadioButton)findViewById(R.id.radiobutton4_54_3);
        fifty4_3_5 = (RadioButton)findViewById(R.id.radiobutton5_54_3);
        cont = (Button)findViewById(R.id.save_next_act54_3);
        radiogrp  = (RadioGroup)findViewById(R.id.radiogroup54_3);
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveChoice();
                data = data + "#" + choice;
                Toast.makeText(Activity_54_3.this, data, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Activity_54_3.this, Activity_55.class);
                i.putExtra("data", data);
                startActivity(i);
            }
        });
    }

    public void saveChoice(){
        int id = radiogrp.getCheckedRadioButtonId();
        switch(id) {
            case R.id.radiobutton1_54_3:
                choice = "1";
                break;
            case R.id.radiobutton2_54_3:
                choice = "2";
                break;
            case R.id.radiobutton3_54_3:
                choice = "3";
                break;
            case R.id.radiobutton4_54_3:
                choice = "4";
                break;
            case R.id.radiobutton5_54_3:
                choice = "5";
                break;

        }

    }
}
