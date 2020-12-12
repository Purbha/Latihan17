package com.ims_hr.app_satu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button B_OK1;
    Button B_OK2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Inisial();
        Listen_B_OK1();
        Listen_B_OK2();
    }

    private void Inisial(){
        B_OK1 = (Button) findViewById(R.id.button_Main_OK1);
        B_OK2 = (Button) findViewById(R.id.button_Main_OK2);
    }

    private void Listen_B_OK1(){
        B_OK1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 10;
                Intent In = new Intent(MainActivity.this,SatuActivity.class);
                startActivity(In);
                Toast.makeText(MainActivity.this, "Nilai a adalah: " + a, Toast.LENGTH_SHORT).show();
                Log.d("Nilai a",String.valueOf(a));
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
