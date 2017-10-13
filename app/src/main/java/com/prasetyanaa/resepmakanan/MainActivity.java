package com.prasetyanaa.resepmakanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ayambakar_btn = (Button)findViewById(R.id.btnAyamBakar);
        Button sopbuntut_btn = (Button)findViewById(R.id.btnSopBuntut);
        Button satejamur_btn = (Button)findViewById(R.id.btnSateJamur);

        ayambakar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AyamBakarActivity.class);
                startActivity(intent);
            }
        });

        sopbuntut_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SopBuntutActivity.class);
                startActivity(intent);

            }
        });

        satejamur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, SateJamurActivity.class);
                startActivity(intent);
            }
        });
    }
}
