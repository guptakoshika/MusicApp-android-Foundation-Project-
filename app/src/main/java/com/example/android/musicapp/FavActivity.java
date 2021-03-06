package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FavActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav);

        TextView playnow = (TextView) findViewById(R.id.playnow_button);

        playnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playnowIntent = new Intent(FavActivity.this, PlayingnowActivity.class);
                startActivity(playnowIntent);
            }
        });

        TextView musiclib=(TextView) findViewById(R.id.musiclib_button);

        musiclib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musiclibIntent = new Intent(FavActivity.this,MoreActivity.class);
                startActivity(musiclibIntent);
            }
        });
    }
}