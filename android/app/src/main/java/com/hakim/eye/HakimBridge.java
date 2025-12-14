package com.hakim.eye;

import android.util.Log;

public class HakimBridge {

    public static void save(String chat, String message) {
        Log.d("HakimEye", "Saved: " + chat + " | " + message);
    }
}
