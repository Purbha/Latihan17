package com.ims_hr.latihan17;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button B_OK1, B_OK2;
    MunculPesan munculPesan;

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
        munculPesan = new MunculPesan(MainActivity.this);
    }

    private void Listen_B_OK1(){
        B_OK1.setOnClickListener(v -> {
            Intent In = new Intent(MainActivity.this,SatuActivity.class);
            startActivity(In);
            munculPesan.PanggilToast("Ini adalah toast.");
        });
    }

    private void Listen_B_OK2() {
        B_OK2.setOnClickListener(v -> {
            Intent In = new Intent(MainActivity.this,DuaActivity.class);
            startActivity(In);
            munculPesan.PanggilToast("Ini adalah toast.");
        });
    }

}
