package com.saepul.kamus_indonesia_mandailing;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataKamus extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "dbkamus";

    private static final String INDONESIA = "indonesia";
    private static final String MANDAILING = "mandailing";

    public DataKamus(Context context){
        super(context, DATABASE_NAME, null,1);
    }

    //Method generateData untuk membuat table kamus
    public void createTable(SQLiteDatabase db){
        db.execSQL("DROP TABLE IF EXISTS kamus");
        db.execSQL("CREATE TABLE if not exists kamus (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "indonesia TEXT, mandailing TEXT);");
    }

    //Method generateData untuk mengisikan data ke kamus
    public void generatedData(SQLiteDatabase db){
        ContentValues cv = new ContentValues();

        cv.put(INDONESIA,"saya");
        cv.put(MANDAILING,"au");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kami");
        cv.put(MANDAILING,"ami");
        db.insert("kamus", null, cv);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
    @Override
    public void onCreate(SQLiteDatabase db){
    }
}
