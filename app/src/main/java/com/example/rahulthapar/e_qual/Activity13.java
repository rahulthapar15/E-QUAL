package com.example.rahulthapar.e_qual;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity13 extends Activity {

    Button save_next_act13;
    RadioGroup radio1, radio2;
    RadioButton a1, b1,c1,d1,a2,b2,c2,d2;
    String data, choice1, choice2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = getIntent().getStringExtra("data");

        setContentView(R.layout.activity_13);
        radio1 = (RadioGroup) findViewById(R.id.answer1);
        radio2 = (RadioGroup) findViewById(R.id.answer2);

        a1 = (RadioButton) findViewById(R.id.answer1A_act13);
        b1 = (RadioButton) findViewById(R.id.answer1B_act13);
        c1 = (RadioButton) findViewById(R.id.answer1C_act13);
        d1 = (RadioButton) findViewById(R.id.answer1D_act13);

        a2 = (RadioButton) findViewById(R.id.answer2A_act13);
        b2 = (RadioButton) findViewById(R.id.answer2B_act13);
        c2 = (RadioButton) findViewById(R.id.answer2C_act13);
        d2 = (RadioButton) findViewById(R.id.answer2D_act13);


        save_next_act13 = (Button)findViewById(R.id.save_next_act13);
        save_next_act13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveChoice();
                saveChoice2();
                data = data + "#"+ choice1 + "#" + choice2;
                Toast.makeText(Activity13.this, data, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Activity13.this,Activity14.class);
                i.putExtra("data", data);

                startActivity(i);
            }
        });
    }
    public void saveChoice(){

        int id = radio1.getCheckedRadioButtonId();

        switch(id) {
            case R.id.answer1A_act13:
                choice1 = "1";
                break;
            case R.id.answer1B_act13:
                choice1 = "2";

                break;
            case R.id.answer1C_act13:

                choice1 = "3";
                break;

            case R.id.answer1D_act13:

                choice1 = "4";
                break;
        }

    }
    public void saveChoice2(){

        int id = radio2.getCheckedRadioButtonId();

        switch(id) {
            case R.id.answer2A_act13:
                choice2 = "1";
                break;
            case R.id.answer2B_act13:
                choice2 = "2";

                break;
            case R.id.answer2C_act13:

                choice2 = "3";
                break;

            case R.id.answer2D_act13:

                choice2 = "4";
                break;
        }

    }
}
