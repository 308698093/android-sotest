package com.example.myapplication;

public class jniUnils {
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("muso");
    }
    public static native String stringFromJNI();
}
