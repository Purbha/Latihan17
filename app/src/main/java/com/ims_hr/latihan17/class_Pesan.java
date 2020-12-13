package com.ims_hr.latihan17;

import android.content.Context;
import android.widget.Toast;

public class class_Pesan {

    private Context Ctx;

    public class_Pesan(Context context) {
        this.Ctx = context;
    }

    public void Pesan(String angka) {
        Toast.makeText(Ctx,  Ctx.getString(R.string.pesan_Menu) + angka,
                Toast.LENGTH_SHORT).show();
    }

}
