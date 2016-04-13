package com.example.rahulthapar.e_qual;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity9 extends AppCompatActivity {

    Button save_next_act9;
    RadioGroup radio1, radio2, radio3;
    RadioButton a1, b1,c1,d1,a2,b2,c2,d2, a3,b3,c3,d3;
    String data, choice1, choice2, choice3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = getIntent().getStringExtra("data");
        setContentView(R.layout.activity_9);
        radio1 = (RadioGroup) findViewById(R.id.answer1);
        radio2 = (RadioGroup) findViewById(R.id.answer2);
        radio3 = (RadioGroup) findViewById(R.id.answer3);

        a1 = (RadioButton) findViewById(R.id.answer1A_act9);
        b1 = (RadioButton) findViewById(R.id.answer1B_act9);
        c1 = (RadioButton) findViewById(R.id.answer1C_act9);
        d1 = (RadioButton) findViewById(R.id.answer1D_act9);

        a2 = (RadioButton) findViewById(R.id.answer2A_act9);
        b2 = (RadioButton) findViewById(R.id.answer2B_act9);
        c2 = (RadioButton) findViewById(R.id.answer2C_act9);
        d2 = (RadioButton) findViewById(R.id.answer2D_act9);

        a3 = (RadioButton) findViewById(R.id.answer3A_act9);
        b3 = (RadioButton) findViewById(R.id.answer3B_act9);
        c3 = (RadioButton) findViewById(R.id.answer3C_act9);
        d3 = (RadioButton) findViewById(R.id.answer3D_act9);
        

        save_next_act9 = (Button)findViewById(R.id.save_next_act9);
        save_next_act9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                saveChoice();
                saveChoice2();
                saveChoice3();

                data = data + "#"+ choice1 + "#" + choice2  + "#" + choice3;
                Toast.makeText(Activity9.this, data, Toast.LENGTH_SHORT).show();

                Intent i = new Intent(Activity9.this,Activity10.class);
                i.putExtra("data", data);
                startActivity(i);
            }
        });
    }

    public void saveChoice(){

        int id = radio1.getCheckedRadioButtonId();

        switch(id) {
            case R.id.answer1A_act9:
                choice1 = "1";
                break;
            case R.id.answer1B_act9:
                choice1 = "2";

                break;
            case R.id.answer1C_act9:

                choice1 = "3";
                break;

            case R.id.answer1D_act9:

                choice1 = "4";
                break;
        }

    }
    public void saveChoice2(){

        int id = radio2.getCheckedRadioButtonId();

        switch(id) {
            case R.id.answer2A_act9:
                choice2 = "1";
                break;
            case R.id.answer2B_act9:
                choice2 = "2";

                break;
            case R.id.answer2C_act9:

                choice2 = "3";
                break;

            case R.id.answer2D_act9:

                choice2 = "4";
                break;
        }

    }
    public void saveChoice3(){

        int id = radio3.getCheckedRadioButtonId();

        switch(id) {
            case R.id.answer3A_act9:
                choice3 = "1";
                break;
            case R.id.answer3B_act9:
                choice3 = "2";

                break;
            case R.id.answer3C_act9:

                choice3 = "3";
                break;

            case R.id.answer3D_act9:

                choice3 = "4";
                break;
        }

    }
}
