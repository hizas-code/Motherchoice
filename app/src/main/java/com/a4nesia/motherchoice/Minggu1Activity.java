package com.a4nesia.motherchoice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Minggu1Activity extends AppCompatActivity {
    private Button mButtonStart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minggu1);

        mButtonStart = (Button) findViewById(R.id.button_kwetiaw);
        mButtonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Minggu1Activity.this, KwetiawActivity.class); // dari MainActivity/posisi saat ini ke SecondActivity
                startActivity(intent);
            }
        });
        mButtonStart = (Button) findViewById(R.id.button_miebasil);
        mButtonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Minggu1Activity.this, MieBasilActivity.class); // dari MainActivity/posisi saat ini ke SecondActivity
                startActivity(intent);
            }
        });


    }
}
