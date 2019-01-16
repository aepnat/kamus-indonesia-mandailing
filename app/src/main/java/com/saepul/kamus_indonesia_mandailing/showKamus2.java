package com.saepul.kamus_indonesia_mandailing;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Saepul on 10/11/2018.
 */

public class showKamus2 extends Activity{
    private SQLiteDatabase db = null;
    private Cursor kamusCursor = null;
    private EditText txtMandailing;
    private EditText txtIndonesia;
    private DataKamus2 datakamus = null;
    public static final String MANDAILING = "mandailing";
    public static final String INDONESIA = "indonesia";

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        datakamus =  new DataKamus2(this);
        db = datakamus.getWritableDatabase();
        datakamus.createTable(db);
        datakamus.generatedData(db);

        setContentView(R.layout.main2);
        txtMandailing = findViewById(R.id.txtMandailing);
        txtIndonesia = findViewById(R.id.txtIndonesia);
       }
    public void getTerjemahan(View v){
        String result = "";

        String mandailingword = txtMandailing.getText().toString();
        kamusCursor=db.rawQuery("SELECT id, mandailing, indonesia, inggris " +
                "FROM kamus where mandailing='" + mandailingword + "' ORDER BY mandailing", null);

        if (kamusCursor.moveToFirst()){
            result =  kamusCursor.getString(2);
            for (;!kamusCursor.isAfterLast();kamusCursor.moveToNext()){
                result =  kamusCursor.getString(2);
            }
        }
        if (result.equals("")){
            result = "Terjemahan not found";
        }
        txtIndonesia.setText(result);
        }

    @Override
    public void onDestroy(){
        super.onDestroy();
        db.close();
    }
}
