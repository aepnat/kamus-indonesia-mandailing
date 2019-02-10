package com.nanda.kamus_indonesia_mandailing;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.ArrayAdapter;

public class CustomAutoCompleteTextChangedListener implements TextWatcher {

    public static final String TAG = "CustomAutoCompleteTextChangedListener.java";
    Context context;
    String type;

    public CustomAutoCompleteTextChangedListener(Context context, String type){
        this.context = context;
        this.type = type;
    }

    @Override
    public void afterTextChanged(Editable s) {
        // TODO Auto-generated method stub

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count,
                                  int after) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTextChanged(CharSequence userInput, int start, int before, int count) {

        if (type == "kamus1") {
            showKamus1 showKamus1 = ((showKamus1) context);

            // query the database based on the user input
            showKamus1.item = showKamus1.getItemsFromDb(userInput.toString());

            // update the adapater
            showKamus1.myAdapter.notifyDataSetChanged();
            showKamus1.myAdapter = new ArrayAdapter<String>(showKamus1, android.R.layout.simple_dropdown_item_1line, showKamus1.item);
            showKamus1.translateText.setAdapter(showKamus1.myAdapter);
        } else if (type == "kamus2") {
            showKamus2 showKamus2 = ((showKamus2) context);

            // query the database based on the user input
            showKamus2.item = showKamus2.getItemsFromDb(userInput.toString());

            // update the adapater
            showKamus2.myAdapter.notifyDataSetChanged();
            showKamus2.myAdapter = new ArrayAdapter<String>(showKamus2, android.R.layout.simple_dropdown_item_1line, showKamus2.item);
            showKamus2.translateText.setAdapter(showKamus2.myAdapter);
        }

    }

}
