package com.saepul.kamus_indonesia_mandailing;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    Button kamus, bantuan, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kamus = findViewById(R.id.button1);
        kamus.setOnClickListener(new click01());

        bantuan = findViewById(R.id.button2);
        bantuan.setOnClickListener(new click02());

        exit = findViewById(R.id.button4);
        exit.setOnClickListener(this);
    }

    class click01 implements Button.OnClickListener {
        public void onClick(View view) {
            Intent i = new Intent(MainActivity.this, Kamus.class);
            startActivity(i);
        }
    }

    class click02 implements Button.OnClickListener {
        public void onClick(View view) {
            Intent i = new Intent(MainActivity.this,Bantuan.class);
            startActivity(i);
        }
    }

    public void onClick(View v) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Pemberitahuan");
        alert.setMessage("Yakin ingin keluar?");
        alert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        alert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        alert.show();
    }
}

