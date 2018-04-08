package com.example.hp.healthcare;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    baseRegister db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        db=new baseRegister(this);

        final EditText email=(EditText) findViewById(R.id.em1);
        final EditText pwd=(EditText) findViewById(R.id.e2);
        final EditText cpwd=(EditText) findViewById(R.id.e3);
        Button log =(Button) findViewById(R.id.b3);



        log.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                String s1=email.getText().toString();
                String s2=pwd.getText().toString();
                String s3=cpwd.getText().toString();

               if(s1.equals("")||s2.equals("")||s3.equals(""))
               {
                   AlertDialog alertDialog = new AlertDialog.Builder(MainActivity3.this).create();
                   alertDialog.setTitle("oops!");
                   alertDialog.setMessage("fields are empty");
                   alertDialog.show();
               }
               else if(!cpwd.getText().toString().equals(pwd.getText().toString()) ){
                   AlertDialog alertDialog = new AlertDialog.Builder(MainActivity3.this).create();
                   alertDialog.setTitle("oops!");
                   alertDialog.setMessage("Passwords do not match");
                   alertDialog.show();
               }


               else {
                 if (s2.equals(s3)) {

                     Boolean chkemail = db.chkemail(s1);
                     if (chkemail == true) {
                       Boolean insert = db.insert(s1, s2);
                         if (insert == true) {
                             AlertDialog alertDialog = new AlertDialog.Builder(MainActivity3.this).create();
                             alertDialog.setTitle("Yes!");
                             alertDialog.setMessage(" Registered successfully!");
                             alertDialog.show();
                           //Toast.makeText(getApplicationContext(), "Registered successfully", Toast.LENGTH_SHORT).show();
                             Intent it0 = new Intent(MainActivity3.this, MainActivity4.class);
                             startActivity(it0);
                         }

                     }
                     else{
                         AlertDialog alertDialog = new AlertDialog.Builder(MainActivity3.this).create();
                         alertDialog.setTitle("oops!");
                         alertDialog.setMessage("Email already exist !");
                         alertDialog.show();
                       //Toast.makeText(getApplicationContext(), "Email already exist", Toast.LENGTH_SHORT).show();

                     }
                 }
                   //Toast.makeText(getApplicationContext(), "Passwords do not match !", Toast.LENGTH_SHORT).show();

               }


            }
});
    }
}