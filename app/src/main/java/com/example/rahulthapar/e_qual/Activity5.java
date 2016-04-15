package com.example.rahulthapar.e_qual;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity5 extends Activity {

    Button save_next_act5;
    RadioGroup radio1;
    RadioGroup radio2;
    RadioButton first, second, third, fourth, science, commerce,arts;
    String data, choice1, choice2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = getIntent().getStringExtra("data");
        setContentView(R.layout.activity_5);

        radio1 = (RadioGroup) findViewById(R.id.answer1);
        radio2 = (RadioGroup) findViewById(R.id.answer2);

        first = (RadioButton)findViewById(R.id.answer1A_act5);
        second = (RadioButton)findViewById(R.id.answer1B_act5);
        third = (RadioButton)findViewById(R.id.answer1C_act5);
        fourth = (RadioButton)findViewById(R.id.answer1D_act5);
        science = (RadioButton)findViewById(R.id.answer2A_act5);
        commerce = (RadioButton)findViewById(R.id.answer2B_act5);
        arts = (RadioButton)findViewById(R.id.answer2C_act5);


        save_next_act5 = (Button)findViewById(R.id.save_next_act5);
        save_next_act5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveChoice();
                saveChoice2();
                data = data + "#" + choice1 + "#" + choice2;
                Log.d("data", data);

                Intent i = new Intent(Activity5.this,Activity6.class);
                i.putExtra("data", data);
                //Toast.makeText(Activity5.this,data, Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }


    public void saveChoice(){

        int id = radio1.getCheckedRadioButtonId();

        switch(id) {
            case R.id.answer1A_act5:
                choice1 = "1";
                break;
            case R.id.answer1B_act5:
                choice1 = "2";

                break;
            case R.id.answer1C_act5:

                choice1 = "3";
                break;
            case R.id.answer1D_act5:

                choice1 = "4";
                break;

        }

    }

    public void saveChoice2(){

        int id = radio2.getCheckedRadioButtonId();

        switch(id) {
            case R.id.answer2A_act5:
                choice2 = "1";
                break;
            case R.id.answer2B_act5:
                choice2 = "2";

                break;
            case R.id.answer2C_act5:

                choice2 = "3";
                break;

        }

    }


}
