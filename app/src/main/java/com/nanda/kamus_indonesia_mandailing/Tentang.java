package com.nanda.kamus_indonesia_mandailing;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by Saepul on 10/14/2018.
 */

public class Tentang extends AppCompatActivity {

    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.tentang);

        TextView content_article = findViewById(R.id.content_article);
        String htmlAsString = getString(R.string.tentang_artikel);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            content_article.setText(Html.fromHtml(htmlAsString, Html.FROM_HTML_MODE_COMPACT));
        } else {
            content_article.setText(Html.fromHtml(htmlAsString));
        }
    }
}
