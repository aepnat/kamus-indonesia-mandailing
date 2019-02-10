package com.nanda.kamus_indonesia_mandailing;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DataKamus extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "kamus";

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

    public List<MyObject> readIndonesia(String searchTerm) {
        List<MyObject> recordsList = new ArrayList<MyObject>();

        // select query
        String sql = "";
        sql += "SELECT * FROM " + DATABASE_NAME;
        sql += " WHERE " + INDONESIA + " LIKE '%" + searchTerm + "%'";
        sql += " ORDER BY " + INDONESIA + " DESC";
        sql += " LIMIT 0,5";

        SQLiteDatabase db = this.getWritableDatabase();

        // execute the query
        Cursor cursor = db.rawQuery(sql, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                String indonesia = cursor.getString(cursor.getColumnIndex(INDONESIA));
                String mandailing = cursor.getString(cursor.getColumnIndex(MANDAILING));
                MyObject myObject = new MyObject(indonesia, mandailing);

                // add to list
                recordsList.add(myObject);

            } while (cursor.moveToNext());
        }

        cursor.close();

        // return the list of records
        return recordsList;
    }

    public List<MyObject> readMandailing(String searchTerm) {
        List<MyObject> recordsList = new ArrayList<MyObject>();

        // select query
        String sql = "";
        sql += "SELECT * FROM " + DATABASE_NAME;
        sql += " WHERE " + MANDAILING + " LIKE '%" + searchTerm + "%'";
        sql += " ORDER BY " + MANDAILING + " DESC";
        sql += " LIMIT 0,5";

        SQLiteDatabase db = this.getWritableDatabase();

        // execute the query
        Cursor cursor = db.rawQuery(sql, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                String indonesia = cursor.getString(cursor.getColumnIndex(INDONESIA));
                String mandailing = cursor.getString(cursor.getColumnIndex(MANDAILING));
                MyObject myObject = new MyObject(mandailing, indonesia);

                // add to list
                recordsList.add(myObject);

            } while (cursor.moveToNext());
        }

        cursor.close();

        // return the list of records
        return recordsList;
    }
}
