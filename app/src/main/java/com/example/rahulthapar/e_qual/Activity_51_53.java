package com.example.rahulthapar.e_qual;

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

public class Activity_51_53 extends AppCompatActivity {
        RadioButton fifty1_1,fifty1_2,fifty2_1,fifty2_2;
        Button cont;
        private RadioGroup radiogrp,radiogrp1;
        String choice = "";
        String choice1 = "";
        String data;
        EditText pinn;
        String pin="";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            data = getIntent().getStringExtra("data");
            setContentView(R.layout.activity_activity_51_53);
            fifty1_1 = (RadioButton)findViewById(R.id.yes51);
            fifty1_2 = (RadioButton)findViewById(R.id.no51);
            fifty2_1 = (RadioButton)findViewById(R.id.yes52);
            fifty2_2 = (RadioButton)findViewById(R.id.no52);
            pinn = (EditText)findViewById(R.id.edit_53);

            cont = (Button)findViewById(R.id.save_next_act51);
            radiogrp  = (RadioGroup)findViewById(R.id.radiogroup51);
            radiogrp1  = (RadioGroup)findViewById(R.id.radiogroup52);
            cont.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    saveChoice();
                    pin = pinn.getText().toString();
                    data = data + "#" + choice+"#" + choice1+"#" +pin ;
                    Toast.makeText(Activity_51_53.this, data, Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Activity_51_53.this, Activity_54.class);
                    i.putExtra("data", data);
                    startActivity(i);
                }
            });
        }

    public void saveChoice(){
        int id = radiogrp.getCheckedRadioButtonId();
        int id1=radiogrp1.getCheckedRadioButtonId();
        switch(id) {
            case R.id.yes51:
                choice = "1";
                break;
            case R.id.no51:
                choice = "2";
                break;
        }
        switch(id1) {
            case R.id.yes52:
                choice1 = "1";
                break;
            case R.id.no52:
                choice1 = "2";
                break;
        }



    }
}

