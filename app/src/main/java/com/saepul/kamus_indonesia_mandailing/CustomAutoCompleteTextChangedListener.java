package com.saepul.kamus_indonesia_mandailing;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.ArrayAdapter;

public class CustomAutoCompleteTextChangedListener implements TextWatcher {

    public static final String TAG = "CustomAutoCompleteTextChangedListener.java";
    Context context;

    public CustomAutoCompleteTextChangedListener(Context context){
        this.context = context;
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

        // if you want to see in the logcat what the user types
        Log.d("aepnat", "User input: " + userInput);

        showKamus1 showKamus1 = ((showKamus1) context);

        // query the database based on the user input
        showKamus1.item = showKamus1.getItemsFromDb(userInput.toString());

        // update the adapater
        showKamus1.myAdapter.notifyDataSetChanged();
        showKamus1.myAdapter = new ArrayAdapter<String>(showKamus1, android.R.layout.simple_dropdown_item_1line, showKamus1.item);
        showKamus1.translateText.setAdapter(showKamus1.myAdapter);

    }

}
