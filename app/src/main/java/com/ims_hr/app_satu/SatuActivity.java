package com.ims_hr.app_satu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class SatuActivity extends AppCompatActivity {

    ImageView IV_Icon1;
    ImageView IV_Icon2;
    ImageView IV_Icon3;
    ImageView IV_Icon4;
    ImageView IV_Icon5;
    ImageView IV_Icon6;

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
        IV_Icon1 = (ImageView) findViewById(R.id.imageView_Satu_Icon1);
        IV_Icon2 = (ImageView) findViewById(R.id.imageView_Satu_Icon2);
        IV_Icon3 = (ImageView) findViewById(R.id.imageView_Satu_Icon3);
        IV_Icon4 = (ImageView) findViewById(R.id.imageView_Satu_Icon4);
        IV_Icon5 = (ImageView) findViewById(R.id.imageView_Satu_Icon5);
        IV_Icon6 = (ImageView) findViewById(R.id.imageView_Satu_Icon6);
    }

    private void Listen_IV_Icon1() {
        IV_Icon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SatuActivity.this, "Anda klik Icon 1",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Listen_IV_Icon2() {
        IV_Icon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SatuActivity.this, "Anda klik Icon 2",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Listen_IV_Icon3() {
        IV_Icon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SatuActivity.this, "Anda Klik Icon 3",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Listen_IV_Icon4() {
        IV_Icon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SatuActivity.this, "Anda Klik Icon 4",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Listen_IV_Icon5() {
        IV_Icon5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SatuActivity.this, "Anda Klik Icon 5",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Listen_IV_Icon6() {
        IV_Icon6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SatuActivity.this, "Anda Klik Icon 6",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

}
