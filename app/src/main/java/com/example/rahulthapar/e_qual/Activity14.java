package com.example.rahulthapar.e_qual;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity14 extends AppCompatActivity {

    Button save_next_act14;
    RadioGroup radio1, radio2;
    RadioButton a1, b1,a2,b2;
    String data, choice1, choice2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = getIntent().getStringExtra("data");

        setContentView(R.layout.activity_14);
        radio1 = (RadioGroup) findViewById(R.id.answer1);
        radio2 = (RadioGroup) findViewById(R.id.answer2);

        a1 = (RadioButton) findViewById(R.id.answer1A_act14);
        b1 = (RadioButton) findViewById(R.id.answer1B_act14);


        a2 = (RadioButton) findViewById(R.id.answer2A_act14);
        b2 = (RadioButton) findViewById(R.id.answer2B_act14);


        save_next_act14 = (Button)findViewById(R.id.save_next_act14);
        save_next_act14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveChoice();
                saveChoice2();

                data = data + "#"+ choice1 + "#" + choice2 ;
                Toast.makeText(Activity14.this, data, Toast.LENGTH_SHORT).show();
                Intent i= new Intent(Activity14.this,Activity15.class);
                i.putExtra("data", data);

                startActivity(i);
            }
        });
    }
    public void saveChoice(){

        int id = radio1.getCheckedRadioButtonId();

        switch(id) {
            case R.id.answer1A_act14:
                choice1 = "1";
                break;
            case R.id.answer1B_act14:
                choice1 = "2";

                break;

        }

    }
    public void saveChoice2(){

        int id = radio2.getCheckedRadioButtonId();

        switch(id) {
            case R.id.answer2A_act14:
                choice2 = "1";
                break;
            case R.id.answer2B_act14:
                choice2 = "2";

                break;
            

        }

    }
}
