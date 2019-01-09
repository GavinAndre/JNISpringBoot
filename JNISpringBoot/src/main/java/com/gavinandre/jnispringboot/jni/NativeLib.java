package com.gavinandre.jnispringboot.jni;

import java.net.URL;

public class NativeLib {
    static {
        URL url = NativeLib.class.getClassLoader().getResource("jniLibs/libNativeLib.so");
        System.load(url.getPath());
    }

    public static void main(String[] args) {
        String uuid = generateUUID();
        System.out.println("generateUUID: " + uuid);
    }

    public static native String generateUUID();
}
