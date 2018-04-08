package com.example.hp.healthcare;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by HP on 29/03/2018.
 */

public class baseRegister extends SQLiteOpenHelper {
    public baseRegister(Context context)
    {
        super(context, "login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table user(email text primary key,password text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
      db.execSQL("drop table if exists user");
    }
 //inserting in database
    public boolean insert(String email, String password) {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("email",email);
        contentValues.put("password",password);
        long ins=db.insert("user",null,contentValues);
        if(ins==-1) return false;
        else return true;
    }

    //checking if email exist;
    public boolean chkemail(String email){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery("Select * from user where email= ?", new String[]{email});
        if(cursor.getCount()>0)
        {return false;}
        else  { return true; }
    }

    //Checking email and password(verification)
    public boolean emailpassword(String email,String password){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery("select * from user where email=? and password=?",new String[]{email,password});// meme nom ds insert email and password
        if(cursor.getCount()>0)
           { return true;}
        else {return false;}




    }





}




















