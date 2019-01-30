package com.saepul.kamus_indonesia_mandailing;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.graphics.Typeface;

import java.util.List;

/**
 * Created by Saepul on 10/11/2018.
 */

public class showKamus1 extends AppCompatActivity {
    private SQLiteDatabase db = null;
    private Button changeButton;

    public CustomAutoCompleteView translateText;

    private EditText resultText;
    private DataKamus datakamus = null;

    String[] item = new String[] {"Please search..."};

    // adapter for auto-complete
    ArrayAdapter<String> myAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        datakamus =  new DataKamus(this);
        db = datakamus.getWritableDatabase();

        Typeface font = Typeface.createFromAsset( getAssets(), "fontawesome-webfont.ttf" );

        setContentView(R.layout.main1);

        changeButton = findViewById(R.id.buttonChange);
        changeButton.setOnClickListener(new changeKamus());
        changeButton.setTypeface(font);

        translateText = findViewById(R.id.translateText);

        translateText.addTextChangedListener(new CustomAutoCompleteTextChangedListener(this, "kamus1"));
        myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, item);
        translateText.setAdapter(myAdapter);

        Drawable clear;
        if (android.os.Build.VERSION.SDK_INT > Build.VERSION_CODES.M) {
            clear = getBaseContext().getResources().getDrawable(R.drawable.ic_clear_black_24dp, getBaseContext().getTheme());
        } else {
            clear = VectorDrawableCompat.create(getBaseContext().getResources(), R.drawable.ic_clear_black_24dp, getBaseContext().getTheme());
        }

        translateText.setCompoundDrawablesWithIntrinsicBounds(null, null, clear, null);

        resultText = findViewById(R.id.resultText);

        translateText.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if (motionEvent.getX()>(view.getWidth()-120)){
                        ((EditText)view).setText("");
                        resultText.setText("");
                    }
                }
                return false;
            }
        });

        Drawable enter;
        if (android.os.Build.VERSION.SDK_INT > Build.VERSION_CODES.M) {
            enter = getBaseContext().getResources().getDrawable(R.drawable.ic_play_circle_filled_black_24dp, getBaseContext().getTheme());
        } else {
            enter = VectorDrawableCompat.create(getBaseContext().getResources(), R.drawable.ic_play_circle_filled_black_24dp, getBaseContext().getTheme());
        }
        resultText.setCompoundDrawablesWithIntrinsicBounds(null, null, enter, null);
        resultText.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if (motionEvent.getX()>(view.getWidth()-120)){
                        getTerjemahan();
                    }
                }
                return false;
            }
        });

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
        resultText.setText("");
        String toTranslate = translateText.getText().toString();
        Cursor kamusCursor = db.rawQuery("SELECT mandailing FROM kamus WHERE indonesia='" + toTranslate + "'", null);
        if (kamusCursor.moveToFirst()) {
            resultData = kamusCursor.getString(0);
            for (;!kamusCursor.isAfterLast();kamusCursor.moveToNext()) {
                resultData = kamusCursor.getString(0);
            }
        }

        if (resultData.equals("")) {
            Toast toast = Toast.makeText(getApplicationContext(), "Terjemahan tidak ditemukan", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            resultText.setText("");
        } else {
            resultText.setText(resultData);
        }
        translateText.requestFocus();
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(translateText, InputMethodManager.SHOW_IMPLICIT);

        kamusCursor.close();
    }

    // this function is used in CustomAutoCompleteTextChangedListener.java
    public String[] getItemsFromDb(String searchTerm){

        // add items on the array dynamically
        List<MyObject> products = datakamus.readIndonesia(searchTerm);
        int rowCount = products.size();

        String[] item = new String[rowCount];
        int x = 0;

        for (MyObject record : products) {

            item[x] = record.objectName;
            x++;
        }

        return item;
    }


    @Override
    public void onDestroy(){
        super.onDestroy();
        db.close();
    }
}
