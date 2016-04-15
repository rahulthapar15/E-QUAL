package com.example.rahulthapar.e_qual;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity6 extends Activity {

    Button save_next_act6;
    RadioGroup radio1, radio2;
    RadioButton english, hindi, regional, home, hostel;
    EditText locality, pin;
    String choice1, choice2, data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = getIntent().getStringExtra("data");
        setContentView(R.layout.activity_6);

        radio1 = (RadioGroup) findViewById(R.id.answer1);
        radio2 = (RadioGroup) findViewById(R.id.answer2);

        english = (RadioButton) findViewById(R.id.answer1A_act6);
        hindi = (RadioButton) findViewById(R.id.answer1B_act6);
        regional = (RadioButton) findViewById(R.id.answer1C_act6);
        home = (RadioButton) findViewById(R.id.answer2A_act6);
        hostel = (RadioButton) findViewById(R.id.answer2B_act6);

        locality = (EditText) findViewById(R.id.locality_of_school);
        pin = (EditText) findViewById(R.id.pin_of_school);

        save_next_act6 = (Button)findViewById(R.id.save_next_act6);
        save_next_act6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveChoice();
                saveChoice2();
                data = data + "#" + choice1 + "#" + pin.getText().toString() + "#" + locality.getText().toString() + "#" + choice2;
                Log.d("data", data);

                //Toast.makeText(Activity6.this, data, Toast.LENGTH_SHORT).show();

                Intent i = new Intent(Activity6.this,Activity7.class);
                i.putExtra("data", data);

                startActivity(i);
            }
        });
    }

    public void saveChoice(){

        int id = radio1.getCheckedRadioButtonId();

        switch(id) {
            case R.id.answer1A_act6:
                choice1 = "1";
                break;
            case R.id.answer1B_act6:
                choice1 = "2";

                break;
            case R.id.answer1C_act6:

                choice1 = "3";
                break;

        }

    }
    public void saveChoice2(){

        int id = radio2.getCheckedRadioButtonId();

        switch(id) {
            case R.id.answer2A_act6:
                choice2 = "1";
                break;

            case R.id.answer2B_act6:
                choice2 = "2";

                break;

        }

    }
}
