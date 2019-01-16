package com.saepul.kamus_indonesia_mandailing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kamus extends Activity implements View.OnClickListener{
    Button indonesia, mandailing;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kamus);

        indonesia= findViewById(R.id.button5);
        indonesia.setOnClickListener(new click02());

        mandailing= findViewById(R.id.button6);
        mandailing.setOnClickListener(new click03());
    }


    class click02 implements Button.OnClickListener{
        public void onClick(View v){
            Intent i = new Intent(Kamus.this,showKamus1.class);
            startActivity(i);
        }
    }
    class click03 implements Button.OnClickListener{
        public void onClick(View v){
            Intent i = new Intent(Kamus.this,showKamus2.class);
            startActivity(i);
        }
    }
    @Override
    public void onClick(View v){
    }
}
