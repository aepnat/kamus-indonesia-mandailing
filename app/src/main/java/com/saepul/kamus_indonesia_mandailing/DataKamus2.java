package com.saepul.kamus_indonesia_mandailing;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataKamus2 extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "dbkamus";

    private static final String INGGRIS = "inggris";
    private static final String INDONESIA = "indonesia";
    private static final String MANDAILING = "mandailing";

    DataKamus2(Context context){
        super(context, DATABASE_NAME, null,1);
    }

    public void createTable(SQLiteDatabase db){
        db.execSQL("DROP TABLE IF EXISTS kamus");
        db.execSQL("CREATE TABLE if not exists kamus (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "inggris TEXT, indonesia TEXT, mandailing TEXT);");
    }

    //Method generateData untuk mengisi data ke kamus
    public void generatedData(SQLiteDatabase db){
        ContentValues cv = new ContentValues();
        cv.put(INGGRIS,"me");
        cv.put(INDONESIA,"saya");
        cv.put(MANDAILING,"au");

        db.insert("kamus", INGGRIS, cv);

        cv.put(INGGRIS,"we");
        cv.put(INDONESIA,"kami");
        cv.put(MANDAILING,"ami");

        db.insert("kamus", INGGRIS, cv);

        cv.put(INGGRIS,"me");
        cv.put(INDONESIA,"saya");
        cv.put(MANDAILING,"au");

        db.insert("kamus", INGGRIS, cv);

        cv.put(INGGRIS,"we");
        cv.put(INDONESIA,"kami");
        cv.put(MANDAILING,"ami");

        db.insert("kamus", INGGRIS, cv);
        cv.put(INGGRIS,"me");
        cv.put(INDONESIA,"saya");
        cv.put(MANDAILING,"au");

        db.insert("kamus", INGGRIS, cv);

        cv.put(INGGRIS,"we");
        cv.put(INDONESIA,"kami");
        cv.put(MANDAILING,"ami");

        db.insert("kamus", INGGRIS, cv);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
    @Override
    public void onCreate(SQLiteDatabase db){
    }
}
