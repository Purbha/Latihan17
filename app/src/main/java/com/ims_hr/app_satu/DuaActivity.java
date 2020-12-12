package com.ims_hr.app_satu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class DuaActivity extends AppCompatActivity {

    ImageButton IB_Icon1, IB_Icon2;
    class_Pesan class_pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);
        Inisial();
        Listen_IB_Icon1();
        Listen_IB_Icon2();
    }

    private void Inisial() {
        IB_Icon1 = findViewById(R.id.imageButton_Dua_Icon1);
        IB_Icon2 = findViewById(R.id.imageButton_Dua_Icon2);
        class_pesan = new class_Pesan(DuaActivity.this);
    }

    private void Listen_IB_Icon1(){
        IB_Icon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                class_pesan.Pesan(" 1");
            }
        });
    }

    private void Listen_IB_Icon2(){
        IB_Icon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                class_pesan.Pesan(" 2");
            }
        });
    }

}
