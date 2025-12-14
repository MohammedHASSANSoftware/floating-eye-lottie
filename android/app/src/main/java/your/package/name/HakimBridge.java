package com.mhsoftware.floatingeye;

import android.util.Log;

public class HakimBridge {

    public static void save(String title, String text) {
        Log.d("HakimEye", "Saved: " + title + " | " + text);

        // لاحقًا:
        // 1. نحفظ بقاعدة بيانات
        // 2. نغير حالة العين
        // 3. نرسل الحدث للـ Overlay
    }

}
