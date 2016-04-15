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

public class Activity_40 extends Activity {

    RadioButton fourty_1,fourty_2,fourty_3,fourty_4,fourty1_1,fourty1_2,fourty2_1,fourty2_2;
    Button cont;
    private RadioGroup radiogrp,radiogrp1,radiogrp2;
    String choice = "";
    String choice1 = "";
    String choice2 = "";
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        data = getIntent().getStringExtra("data");
        setContentView(R.layout.activity_activity_40);

        fourty_1 = (RadioButton)findViewById(R.id.radiobutton1_40);
        fourty_2 = (RadioButton)findViewById(R.id.radiobutton2_40);
        fourty_3 = (RadioButton)findViewById(R.id.radiobutton3_40);
        fourty_4 = (RadioButton)findViewById(R.id.radiobutton4_40);

        fourty1_1 = (RadioButton)findViewById(R.id.yes41);
        fourty1_2 = (RadioButton)findViewById(R.id.no41);

        fourty2_1 = (RadioButton)findViewById(R.id.yes42);
        fourty2_2 = (RadioButton)findViewById(R.id.yes42);

        cont = (Button)findViewById(R.id.save_next_act40);
        radiogrp  = (RadioGroup)findViewById(R.id.radiogroup40);
        radiogrp1  = (RadioGroup)findViewById(R.id.radiogroup41);
        radiogrp2  = (RadioGroup)findViewById(R.id.radiogroup42);
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                saveChoice();
                data = data + "#" + choice + "#" + choice1+"#" + choice2;
                Log.d("data", data);
                //Toast.makeText(Activity_40.this, data, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Activity_40.this, Activity_43_46.class);
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
            case R.id.radiobutton1_40:
                choice = "1";
                break;
            case R.id.radiobutton2_40:
                choice = "2";
                break;
            case R.id.radiobutton3_40:
                choice = "3";
                break;
            case R.id.radiobutton4_40:
                choice = "3";
                break;
        }
        switch(id1) {
            case R.id.yes41:
                choice1 = "1";
                break;
            case R.id.no41:
                choice1 = "2";
                break;
        }

        switch(id2) {
            case R.id.yes42:
                choice2 = "1";
                break;
            case R.id.no42:
                choice2 = "2";
                break;
        }

    }
}
