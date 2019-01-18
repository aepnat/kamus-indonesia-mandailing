package com.saepul.kamus_indonesia_mandailing;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.graphics.Typeface;

/**
 * Created by Saepul on 10/11/2018.
 */

public class showKamus1 extends AppCompatActivity {
    private SQLiteDatabase db = null;
    private Button changeButton;
    private EditText translateText;
    private EditText resultText;
    private DataKamus datakamus = null;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        datakamus =  new DataKamus(this);
        db = datakamus.getWritableDatabase();
        datakamus.createTable(db);
        datakamus.generatedData(db);

        Typeface font = Typeface.createFromAsset( getAssets(), "fontawesome-webfont.ttf" );

        setContentView(R.layout.main1);

        changeButton = findViewById(R.id.buttonChange);
        changeButton.setOnClickListener(new changeKamus());
        changeButton.setTypeface(font);

        translateText = findViewById(R.id.translateText);

        resultText = findViewById(R.id.resultText);
        resultText.setEnabled(false);
        resultText.setKeyListener(null);
        translateText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    getTerjemahan();
                    return true;
                }
                return false;
            }
        });
    }

    class changeKamus implements Button.OnClickListener {
        public void onClick(View view) {
            Intent i = new Intent(showKamus1.this, showKamus2.class);
            startActivity(i);
        }
    }

    public void getTerjemahan()
    {
        String resultData = "";
        String toTranslate = translateText.getText().toString();
        Cursor kamusCursor = db.rawQuery("SELECT mandailing FROM kamus where indonesia='"+ toTranslate +"'", null);
        if (kamusCursor.moveToFirst()) {
            resultData = kamusCursor.getString(0);
            for (;!kamusCursor.isAfterLast();kamusCursor.moveToNext()) {
                resultData = kamusCursor.getString(0);
            }
        }

        if (resultData.equals("")) {
            Toast.makeText(getApplicationContext(), "Terjemahan tidak ditemukan", Toast.LENGTH_LONG).show();
            resultText.setText("");
        } else {
            resultText.setText(resultData);
        }

        kamusCursor.close();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        db.close();
    }
}
