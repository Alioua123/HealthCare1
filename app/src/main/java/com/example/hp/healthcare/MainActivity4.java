package com.example.hp.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button add =(Button) findViewById(R.id.add);




        add.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent it0=new Intent(MainActivity4.this,DrawerActivity.class);
                startActivity(it0);}
        });




    }
}
