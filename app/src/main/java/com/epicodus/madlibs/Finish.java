package com.epicodus.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Finish extends AppCompatActivity {
    private TextView story;
    private TextView title;
    private TextView listen;
    private Button recreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        story = (TextView) findViewById(R.id.tvStory);
        title = (TextView) findViewById(R.id.tvTitle);
        listen = (TextView) findViewById(R.id.tvListen);
        recreate = (Button) findViewById(R.id.btnRecreate);

        Intent intent = getIntent();
        String adjective1 = intent.getStringExtra("adjective1");
        String adjective2 = intent.getStringExtra("adjective2");
        String bird = intent.getStringExtra("bird");
        String room = intent.getStringExtra("room");
        String ran = intent.getStringExtra("ran");
        String cook = intent.getStringExtra("cook");
        String name = intent.getStringExtra("name");
        String juice = intent.getStringExtra("juice");
        String bodyPart = intent.getStringExtra("bodyPart");
        String random1 = intent.getStringExtra("random1");
        String random2 = intent.getStringExtra("random2");

        story.setText("It was a " + adjective1 + ",cold June day. I woke up to the " + adjective2 +
                "smell of " + bird + "roasting in the "+ room + ". I " + ran + " down the stairs " +
                "to see if I could help " + cook +" the dinner. My mom said,'See if"+ name +
                " needs a fresh glass of " + juice + ". So I checked. " +
                "When I got there, I couldn't believe my "+ bodyPart + "! There were " + random1 + " " + random2 + " on the floor!");

        recreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Finish.this, Madlibs.class);
                startActivity(intent);
            }
        });
    }
}
