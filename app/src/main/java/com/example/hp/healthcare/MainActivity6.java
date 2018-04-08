package com.example.hp.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);



        Button bout =(Button) findViewById(R.id.timepick);
        bout.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent it1=new Intent(MainActivity6.this,DrawerActivity.class);
                startActivity(it1);}
        });


        



    }
}
