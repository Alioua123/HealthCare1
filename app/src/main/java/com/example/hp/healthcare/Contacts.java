package com.example.hp.healthcare;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;

public class Contacts extends AppCompatActivity {

    String arrayName[]={"Doctors","Pharmacy","Clinics","Emergency"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        CircleMenu circleMenu=(CircleMenu)findViewById(R.id.circle_menu);

        circleMenu.setMainMenu(Color.parseColor("#bebebe"), R.mipmap.add1,R.mipmap.remove)

        //circleMenu.setMainMenu(Color.parseColor("#258CFF"), R.mipmap.icon_home)
                .addSubMenu(Color.parseColor("#7fa87f"), R.drawable.medd)
                .addSubMenu(Color.parseColor("#ffffbb33"), R.drawable.pp)
                .addSubMenu(Color.parseColor("#FFFF4081"), R.drawable.ambulance)
                .addSubMenu(Color.parseColor("#FF6A00"), R.drawable.hospital)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {


                    public void onMenuSelected(int index) {

                        Toast.makeText(Contacts.this,"Import contacts of"+arrayName[index],Toast.LENGTH_SHORT);

                        if(arrayName[index]=="Doctors"){
                            Intent it0 = new Intent(Contacts.this, medecin.class);
                            startActivity(it0);
                        }

                        if(arrayName[index]=="Emergency"){
                            Intent it0 = new Intent(Contacts.this, emergency.class);
                            startActivity(it0);
                        }


                    }




        });
    }
}
