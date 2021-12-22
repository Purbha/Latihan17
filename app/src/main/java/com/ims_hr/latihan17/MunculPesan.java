package com.ims_hr.latihan17;

import android.content.Context;
import android.widget.Toast;

public class MunculPesan {

    Context context;

    public MunculPesan(Context context) {
        this.context = context;
    }

    public void PanggilToast(String Pesannya) {
        Toast.makeText(context, Pesannya, Toast.LENGTH_SHORT).show();
    }

}
