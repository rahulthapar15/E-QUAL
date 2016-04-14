package com.example.rahulthapar.e_qual;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {


    /*
            1. Button  START save the latitude,longitude,time and date in the CSV file
            2. Starts the survey
    */

    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button)findViewById(R.id.start);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Interviewer_Respondant_Details.class);
                startActivity(i);
            }
        });

    }
}
