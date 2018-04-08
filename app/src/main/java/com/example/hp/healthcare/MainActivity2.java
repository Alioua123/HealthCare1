package com.example.hp.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    baseRegister db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       db =new baseRegister(this);

        final  EditText e1=(EditText) findViewById(R.id.em1);
        final EditText e2=(EditText) findViewById(R.id.pass);

        Button account =(Button) findViewById(R.id.b2);
        Button login =(Button) findViewById(R.id.b3);

        account.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                Intent it1=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(it1);}
        });


        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                String email=e1.getText().toString();
                String password=e2.getText().toString();


                    boolean Chkemailpassword=db.emailpassword(email,password);

                    if(Chkemailpassword==true)
                    {
                        Toast.makeText(getApplicationContext(),"Successfully login",Toast.LENGTH_SHORT).show();
                        Intent it2 = new Intent(MainActivity2.this, DrawerActivity.class);
                        startActivity(it2);
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"Wrong email or password",Toast.LENGTH_SHORT).show();
                    }



            }
        });



    }
}
