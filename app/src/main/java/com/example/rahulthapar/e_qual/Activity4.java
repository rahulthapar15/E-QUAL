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

public class Activity4 extends Activity {

    Button save_next_act4;
    RadioGroup rg;
    RadioButton ba, bsc, btech, ma, msc, me, others;
    String data, choice;
    EditText major;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        data = getIntent().getStringExtra("data");
        setContentView(R.layout.activity_4);

        rg = (RadioGroup) findViewById(R.id.radioGroup4);
        ba = (RadioButton) findViewById(R.id.ba);
        bsc = (RadioButton) findViewById(R.id.bsc);
        btech = (RadioButton) findViewById(R.id.btech);
        ma = (RadioButton) findViewById(R.id.ma);
        msc = (RadioButton) findViewById(R.id.msc);
        me = (RadioButton) findViewById(R.id.me);
        others = (RadioButton) findViewById(R.id.other);
        major = (EditText) findViewById(R.id.edit_major_subject);

        save_next_act4= (Button)findViewById(R.id.save_next_act4);
        save_next_act4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveChoice();

                data = data + "#" + choice  + "#" + major.getText().toString();
                Intent i = new Intent(Activity4.this,Activity5.class);
                //Toast.makeText(Activity4.this, data, Toast.LENGTH_SHORT).show();
                Log.d("data", data);

                i.putExtra("data", data);
                startActivity(i);
            }
        });
    }
    public void saveChoice(){

        int id = rg.getCheckedRadioButtonId();

        switch(id) {
            case R.id.ba:
                choice = "1";
                break;

            case R.id.bsc:
                choice = "2";
                break;

            case R.id.btech:
                choice = "3";
                break;

            case R.id.ma:
                choice = "4";
                break;
            case R.id.msc:
                choice = "5";

                break;
            case R.id.me:

                choice = "6";
                break;
            case R.id.other:

                choice = "7";
                break;

        }

    }


}
