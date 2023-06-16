package com.baderlouay.monmedecinv3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {
    public Database(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String qry1 = "create table users(username text, email text, password text)";
        sqLiteDatabase.execSQL(qry1);

        String qry2 = "create table doctors(doctor text, spec text, address text, fee text)";
        sqLiteDatabase.execSQL(qry2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    public void register(String username, String email, String password) {
        ContentValues cv = new ContentValues();
        cv.put("username", username);
        cv.put("email", email);
        cv.put("password", password);
        SQLiteDatabase db = getWritableDatabase();
        db.insert("users", null, cv);
        db.close();
    }

    public int login(String username, String password) {
        int result=0;
        String str[] = new String[2];
        str[0] = username;
        str[1] = password;
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery("select * from users where username=? and password=?", str);
        if (c.moveToFirst()) {
            result = 1;
        }
        return result;
    }

    public void addDoctor(String doctor, String spec, String address, String fee) {
        ContentValues cv = new ContentValues();
        cv.put("doctor", doctor);
        cv.put("spec", spec);
        cv.put("address", address);
        cv.put("fee", fee);
        SQLiteDatabase db = getWritableDatabase();
        db.insert("doctors", null, cv);
        db.close();
    }

    public int checkDoctor(String doctor, String spec) {
        int result=0;
        String str[] = new String[2];
        str[0] = doctor;
        str[1] = spec;
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery("select * from doctors where doctor = ? and spec = ?", str);
        if(c.moveToFirst()){
            result=1;
        }
        db.close();
        return result;
    }

    public void removeDoctor(String doctor,String spec){
        String str[] = new String[2];
        str[0] = doctor;
        str[1] = spec;
        SQLiteDatabase db = getWritableDatabase();
        db.delete("doctors","doctor=? and spec=?",str);
        db.close();
    }
}
