package com.ims_hr.latihan17;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class SatuActivity extends AppCompatActivity {

    ImageView IV_Icon1, IV_Icon2, IV_Icon3, IV_Icon4, IV_Icon5, IV_Icon6;
    class_Pesan class_pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satu);
        Inisial();
        Listen_IV_Icon1();
        Listen_IV_Icon2();
        Listen_IV_Icon3();
        Listen_IV_Icon4();
        Listen_IV_Icon5();
        Listen_IV_Icon6();
    }

    private void Inisial() {
        IV_Icon1 = findViewById(R.id.imageView_Satu_Icon1);
        IV_Icon2 = findViewById(R.id.imageView_Satu_Icon2);
        IV_Icon3 = findViewById(R.id.imageView_Satu_Icon3);
        IV_Icon4 = findViewById(R.id.imageView_Satu_Icon4);
        IV_Icon5 = findViewById(R.id.imageView_Satu_Icon5);
        IV_Icon6 = findViewById(R.id.imageView_Satu_Icon6);
        class_pesan = new class_Pesan(SatuActivity.this);
    }

    private void Listen_IV_Icon1() {
        IV_Icon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                class_pesan.Pesan(" 1");
            }
        });
    }

    private void Listen_IV_Icon2() {
        IV_Icon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                class_pesan.Pesan(" 2");
            }
        });
    }

    private void Listen_IV_Icon3() {
        IV_Icon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                class_pesan.Pesan(" 3");
            }
        });
    }

    private void Listen_IV_Icon4() {
        IV_Icon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                class_pesan.Pesan(" 4");
            }
        });
    }

    private void Listen_IV_Icon5() {
        IV_Icon5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                class_pesan.Pesan(" 5");
            }
        });
    }

    private void Listen_IV_Icon6() {
        IV_Icon6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                class_pesan.Pesan(" 6");
            }
        });
    }

}
