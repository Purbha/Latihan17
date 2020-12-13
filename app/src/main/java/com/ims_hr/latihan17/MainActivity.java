package com.ims_hr.latihan17;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button B_OK1, B_OK2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Inisial();
        Listen_B_OK1();
        Listen_B_OK2();
    }

    private void Inisial(){
        B_OK1 = findViewById(R.id.button_Main_OK1);
        B_OK2 = findViewById(R.id.button_Main_OK2);
    }

    private void Listen_B_OK1(){
        B_OK1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent In = new Intent(MainActivity.this,SatuActivity.class);
                startActivity(In);
            }
        });
    }

    private void Listen_B_OK2() {
        B_OK2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent In = new Intent(MainActivity.this,DuaActivity.class);
                startActivity(In);
            }
        });
    }

}
