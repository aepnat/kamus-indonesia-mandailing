package com.nanda.kamus_indonesia_mandailing;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button kamus, tentang, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kamus = findViewById(R.id.button1);
        kamus.setOnClickListener(new click01());

        tentang = findViewById(R.id.button2);
        tentang.setOnClickListener(new click02());

        exit = findViewById(R.id.button3);
        exit.setOnClickListener(this);
    }

    class click01 implements Button.OnClickListener {
        public void onClick(View view) {
            Intent i = new Intent(MainActivity.this, showKamus1.class);
            startActivity(i);
        }
    }

    class click02 implements Button.OnClickListener {
        public void onClick(View view) {
            Intent i = new Intent(MainActivity.this,Tentang.class);
            startActivity(i);
        }
    }

    public void onClick(View v) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle(R.string.notice_text);
        alert.setMessage(R.string.confirmation_text);
        alert.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        alert.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        alert.show();
    }
}

