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

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Activity_55 extends Activity {
    RadioButton fifty5_1,fifty5_2,fifty6_1,fifty6_2,fifty7_1,fifty7_2, fifty8_1,fifty8_2,fifty8_3, fifty8_4;
    Button cont,cancel;
    private RadioGroup radiogrp,radiogrp1,radiogrp2,radiogrp3;
    String choice = "";
    String choice1 = "";
    String choice2="";
    String choice3="";
    String data;
    private FileWriter mFileWriter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = getIntent().getStringExtra("data");
        setContentView(R.layout.activity_activity_55);
        fifty5_1 = (RadioButton)findViewById(R.id.yes55);
        fifty5_2 = (RadioButton)findViewById(R.id.no55);

        fifty6_1 = (RadioButton)findViewById(R.id.yes56);
        fifty6_2 = (RadioButton)findViewById(R.id.no56);

        fifty7_1 = (RadioButton)findViewById(R.id.yes57);
        fifty7_2 = (RadioButton)findViewById(R.id.no57);

        fifty8_1 = (RadioButton)findViewById(R.id.radiobutton1_55);
        fifty8_2 = (RadioButton)findViewById(R.id.radiobutton2_55);
        fifty8_3 = (RadioButton)findViewById(R.id.radiobutton3_55);
        fifty8_4 = (RadioButton)findViewById(R.id.radiobutton4_55);

        cont = (Button)findViewById(R.id.save_next_act55);
        cancel = (Button)findViewById(R.id.cancel_55);

        radiogrp  = (RadioGroup)findViewById(R.id.radiogroup55);
        radiogrp1  = (RadioGroup)findViewById(R.id.radiogroup56);
        radiogrp2  = (RadioGroup)findViewById(R.id.radiogroup57);
        radiogrp3  = (RadioGroup)findViewById(R.id.radiogroup58);

        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveChoice();
                data = data + "#" + choice + "#" + choice1 + "#" + choice2 + "#" + choice3;
                Log.d("data", data);
                //Toast.makeText(Activity_55.this, data, Toast.LENGTH_SHORT).show();
                //Toast.makeText(Activity_55.this, data, Toast.LENGTH_SHORT).show();
                try {
                    saveFile();
                    Intent i = new Intent(Activity_55.this,ThankYou.class);
                    startActivity(i);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = null;
                //Toast.makeText(Activity_55.this, data, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Activity_55.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    private void saveFile() throws IOException {

        String[] row = data.split("#");

        for(int i = 0; i < row.length; i++)
            Log.d(""+i, row[i]);

        String[] ques={"1","2","3","4","5","6","7","8","9","10","11","12","13","13a","14","15","16","17","18","19","20","21","22",
                "23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40",
                "41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58"};

        String baseDir = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
        String fileName = "E-Qual.csv";
        String filePath = baseDir + File.separator + fileName;
        Log.d("FilePath",filePath);
        File f = new File(filePath );
        CSVWriter writer;
        if(f.exists() && !f.isDirectory()){
            mFileWriter = new FileWriter(filePath , true);
            writer = new CSVWriter(mFileWriter);

        }
        else {
            writer = new CSVWriter(new FileWriter(filePath));
            writer.writeNext(ques);
        }

        writer.writeNext(row);

        writer.close();
    }

    public void saveChoice(){
        int id = radiogrp.getCheckedRadioButtonId();
        int id1 = radiogrp1.getCheckedRadioButtonId();
        int id2 = radiogrp2.getCheckedRadioButtonId();
        int id3 = radiogrp3.getCheckedRadioButtonId();


        switch(id) {
            case R.id.yes55:
                choice = "1";
                break;
            case R.id.no55:
                choice = "2";
                break;
        }
        switch (id1) {
            case R.id.yes56:
                choice1 = "1";
                break;

            case R.id.no56:
                choice1 = "2";
                break;
        }
        switch (id2){
            case R.id.yes57:
                choice2 = "1";
                break;
            case R.id.no57:
                choice2 = "2";
                break;
        }
        switch(id3) {
            case R.id.radiobutton1_55:
                choice3 = "1";
                break;
            case R.id.radiobutton2_55:
                choice3 = "2";
                break;
            case R.id.radiobutton3_55:
                choice3 = "3";
                break;
            case R.id.radiobutton4_55:
                choice3 = "4";
                break;

        }
    }
}
