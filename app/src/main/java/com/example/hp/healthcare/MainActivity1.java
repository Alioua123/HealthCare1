package com.example.hp.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        final TextView Welcome = (TextView) findViewById(R.id.welcome);

        Button start = (Button) findViewById(R.id.Start);



        start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent it0 = new Intent(MainActivity1.this, MainActivity2.class);
                startActivity(it0);
            }


        });











    }
}

