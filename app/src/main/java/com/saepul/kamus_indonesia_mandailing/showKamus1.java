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

public class showKamus1 extends Activity{
    private SQLiteDatabase db = null;
    private Cursor kamusCursor = null;
    private EditText txtIndonesia;
    private EditText txtMandailing;
    private DataKamus1 datakamus = null;
    public static final String INDONESIA = "indonesia";
    public static final String MANDAILING = "mandailing";

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        datakamus =  new DataKamus1(this);
        db = datakamus.getWritableDatabase();
        datakamus.createTable(db);
        datakamus.generatedData(db);

        setContentView(R.layout.main1);
        txtIndonesia = findViewById(R.id.txtIndonesia);
        txtMandailing = findViewById(R.id.txtMandailing);
    }
    public void getTerjemahan(View v){
        String result2 = "";

        String englishword = txtIndonesia.getText().toString();
        kamusCursor=db.rawQuery("SELECT id, indonesia, inggris, mandailing " +
                        "FROM kamus where indonesia='" + englishword + "' ORDER BY indonesia", null);

        if (kamusCursor.moveToFirst()){
            result2 =  kamusCursor.getString(3);
            for (;!kamusCursor.isAfterLast();kamusCursor.moveToNext()){
                result2 = kamusCursor.getString(3);
            }
        }
        if (result2.equals("")){
            result2 = "Terjemahan not found";
        }
        txtIndonesia.setText(result2);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        db.close();
    }
}
