package com.example.hp.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class trackers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trackers);
        ImageButton  img1=(ImageButton)findViewById(R.id.img1);
        ImageButton img2=(ImageButton)findViewById(R.id.img2);
        ImageButton img3=(ImageButton)findViewById(R.id.img3);
        ImageButton img4=(ImageButton)findViewById(R.id.img4);


        img1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent it0 = new Intent(trackers.this, Bloodglucose.class);
                startActivity(it0);
            }


        });

        img2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent it0 = new Intent(trackers.this, Contacts.class);
                startActivity(it0);
            }


        });

        img4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent it0 = new Intent(trackers.this, weight.class);
                startActivity(it0);
            }


        });

        img3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent it0 = new Intent(trackers.this, height.class);
                startActivity(it0);
            }


        });

    }
}
