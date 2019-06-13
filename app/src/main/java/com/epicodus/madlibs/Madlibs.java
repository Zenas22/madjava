package com.epicodus.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Madlibs extends AppCompatActivity {
    private TextView createStory;
    private TextView enterText;
    private Button create;
    private TextView input1;
    private TextView input2;
    private TextView input3;
    private TextView input4;
    private TextView input5;
    private TextView input6;
    private TextView input7;
    private TextView input8;
    private TextView input9;
    private TextView input10;
    private TextView input11;

    private EditText adj1;
    private EditText adj2;
    private EditText noun1;
    private EditText noun2;
    private EditText noun3;
    private EditText noun4;
    private EditText noun5;
    private EditText noun6;

    private EditText verb1;
    private EditText verb2;
    private EditText verb3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madlibs);
        createStory = (TextView) findViewById(R.id.tvCreate);
        enterText = (TextView) findViewById(R.id.tvInput);
        create = (Button) findViewById(R.id.btnCreate);
        input1 = (TextView) findViewById(R.id.tvInput1);
        input2 = (TextView) findViewById(R.id.tvInput2);
        input3 = (TextView) findViewById(R.id.tvInput3);
        input4 = (TextView) findViewById(R.id.tvInput4);
        input5 = (TextView) findViewById(R.id.tvInput5);
        input6 = (TextView) findViewById(R.id.tvInput6);
        input7 = (TextView) findViewById(R.id.tvInput7);
        input8 = (TextView) findViewById(R.id.tvInput8);
        input9 = (TextView) findViewById(R.id.tvInput9);
        input10 = (TextView) findViewById(R.id.tvInput10);
        input11 = (TextView) findViewById(R.id.tvInput11);

        adj1 = (EditText) findViewById(R.id.etAdj1);
        adj2 = (EditText) findViewById(R.id.etAdj2);
        noun1 = (EditText) findViewById(R.id.etNoun1);
        noun2 = (EditText) findViewById(R.id.etNoun2);
        noun3 = (EditText) findViewById(R.id.etNoun3);
        noun4 = (EditText) findViewById(R.id.etNoun4);
        noun5 = (EditText) findViewById(R.id.etNoun5);
        noun6 = (EditText) findViewById(R.id.etNoun6);

        verb1 = (EditText) findViewById(R.id.etVerb1);
        verb2 = (EditText) findViewById(R.id.etVerb2);
        verb3 = (EditText) findViewById(R.id.etVerb3);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String adjective1 = adj1.getText().toString();
                String adjective2 = adj2.getText().toString();
                String bird = noun1.getText().toString();
                String room = noun2.getText().toString();
                String ran = verb1.getText().toString();
                String cook = verb2.getText().toString();
                String name = noun3.getText().toString();
                String juice = noun4.getText().toString();
                String bodyPart = noun5.getText().toString();
                String random1 = noun6.getText().toString();
                String random2 = verb3.getText().toString();

                Intent intent = new Intent(Madlibs.this, Finish.class);
                intent.putExtra("adjective1", adjective1);
                intent.putExtra("adjective2", adjective2);
                intent.putExtra("bird", bird);
                intent.putExtra("room", room);
                intent.putExtra("ran", ran);
                intent.putExtra("cook", cook);
                intent.putExtra("name", name);
                intent.putExtra("juice", juice);
                intent.putExtra("bodyPart", bodyPart);
                intent.putExtra("random1", random1);
                intent.putExtra("random2", random2);
                Toast.makeText(Madlibs.this, "say we a come in with a force", Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });

    }
}
