package com.example.rahulthapar.e_qual;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Interviewer_Respondant_Details extends Activity {

    EditText interviewerID, respondantName, respondantID, contactNO, age;
    Button save_next_interviewer_respondant_details;


    //storing the value
    String interviewerId = "";
    String respName = "";
    String respId = "";
    String contactNo = "";
    String ages = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interviewer__respondant__details);

        interviewerID = (EditText)findViewById(R.id.interviewerID);
        respondantName = (EditText)findViewById(R.id.respondantName);
        respondantID = (EditText)findViewById(R.id.respondantID);
        contactNO = (EditText)findViewById(R.id.phone);
        age = (EditText)findViewById(R.id.age);




        save_next_interviewer_respondant_details = (Button)findViewById(R.id.save_next_interviewer_respondant_details);

        save_next_interviewer_respondant_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //getting data from edittexts
                interviewerId = interviewerID.getText().toString();
                respName = respondantName.getText().toString();
                respId = respondantID.getText().toString();
                contactNo = contactNO.getText().toString();
                ages = age.getText().toString();

                String data = interviewerId + "#" + respName + "#" + respId + "#" +contactNo + "#"+ ages;



                Intent i = new Intent(Interviewer_Respondant_Details.this,Activity3.class);
                //Toast.makeText(Interviewer_Respondant_Details.this, data, Toast.LENGTH_SHORT).show();

                i.putExtra("data", data);
                startActivity(i);
            }
        });

    }
}
