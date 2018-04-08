package com.example.hp.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class weight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        ImageButton img=(ImageButton)findViewById(R.id.img);


        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent it0 = new Intent(weight.this, trackers.class);
                startActivity(it0);
            }


        });

    }
}
