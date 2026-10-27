package com.k60.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    static { System.loadLibrary("native-lib"); }

    public static native String stringFromJNI();
    public static native int add(int a, int b);

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        TextView tv = new TextView(this);
        tv.setTextSize(20f);
        tv.setPadding(40, 200, 40, 40);
        tv.setText("K60 适配\n\n"
            + "JNI: " + stringFromJNI() + "\n"
            + "3+5 = " + add(3, 5) + "\n"
            + "ABI: " + android.os.Build.SUPPORTED_ABIS[0] + "\n"
            + "SDK: " + android.os.Build.VERSION.SDK_INT);
        setContentView(tv);
    }
}
