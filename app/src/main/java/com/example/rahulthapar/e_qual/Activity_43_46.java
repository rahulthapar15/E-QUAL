package com.example.rahulthapar.e_qual;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity_43_46 extends Activity {

    RadioButton fourty3_1,fourty3_2,fourty3_3,fourty3_4,fourty3_5,fourty3_6,fourty3_7,fourty4_1,fourty4_2,fourty6_1,fourty6_2, fourty5_1, fourty5_2;
    Button cont;
    private RadioGroup radiogrp,radiogrp1,radiogrp2, radiogrp3;
    String choice = "";
    String choice1 = "";
    String choice2 = "";
    String choice3 = "";
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        data = getIntent().getStringExtra("data");
        setContentView(R.layout.activity_activity_43_46);

        fourty3_1 = (RadioButton)findViewById(R.id.radiobutton1_43);
        fourty3_2 = (RadioButton)findViewById(R.id.radiobutton2_43);
        fourty3_3 = (RadioButton)findViewById(R.id.radiobutton3_43);
        fourty3_4 = (RadioButton)findViewById(R.id.radiobutton4_43);
        fourty3_4 = (RadioButton)findViewById(R.id.radiobutton4_43);
        fourty3_5 = (RadioButton)findViewById(R.id.radiobutton5_43);
        fourty3_6 = (RadioButton)findViewById(R.id.radiobutton6_43);
        fourty3_7 = (RadioButton)findViewById(R.id.radiobutton7_43);

        fourty4_1 = (RadioButton)findViewById(R.id.yes44);
        fourty4_2 = (RadioButton)findViewById(R.id.no44);
        fourty5_1 = (RadioButton)findViewById(R.id.yes45);
        fourty5_2 = (RadioButton)findViewById(R.id.no45);

        fourty6_1 = (RadioButton)findViewById(R.id.yes46);
        fourty6_2 = (RadioButton)findViewById(R.id.yes46);

        cont = (Button)findViewById(R.id.save_next_act47);
        radiogrp  = (RadioGroup)findViewById(R.id.radiogroup43);
        radiogrp1  = (RadioGroup)findViewById(R.id.radiogroup44);
        radiogrp2  = (RadioGroup)findViewById(R.id.radiogroup45);
        radiogrp3 = (RadioGroup) findViewById(R.id.radiogroup46);
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                saveChoice();
                data = data + "#" + choice + "#" + choice1+"#" +choice2+"#"+ choice3;
                Log.d("data", data);
                //Toast.makeText(Activity_43_46.this, data, Toast.LENGTH_SHORT).show();
                Log.d("data", data);

                Intent i = new Intent(Activity_43_46.this, Activity_47_50.class);
                i.putExtra("data", data);
                startActivity(i);
            }
        });
    }

    public void saveChoice(){
        int id = radiogrp.getCheckedRadioButtonId();
        int id1 = radiogrp1.getCheckedRadioButtonId();
        int id2 = radiogrp2.getCheckedRadioButtonId();
        int id3 = radiogrp3.getCheckedRadioButtonId();

        switch(id) {
            case R.id.radiobutton1_43:
                choice = "1";
                break;
            case R.id.radiobutton2_43:
                choice = "2";
                break;
            case R.id.radiobutton3_43:
                choice = "3";
                break;
            case R.id.radiobutton4_43:
                choice = "4";
                break;
            case R.id.radiobutton5_43:
                choice = "5";
                break;
            case R.id.radiobutton6_43:
                choice = "6";
                break;
            case R.id.radiobutton7_43:
                choice = "7";
                break;
        }
        switch(id1) {
            case R.id.yes44:
                choice1 = "1";
                break;
            case R.id.no44:
                choice1 = "2";
                break;

        }

        switch(id2) {
            case R.id.yes45:
                choice2 = "1";
                break;
            case R.id.no45:
                choice2 = "2";
                break;

        }

        switch(id3) {
            case R.id.yes46:
                choice3 = "1";
                break;
            case R.id.no46:
                choice3 = "2";
                break;
        }

    }
}
