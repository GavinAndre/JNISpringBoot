package com.gavinandre.jnispringboot.jni;

class NativeLib {
    static {
        System.loadLibrary("NativeLib");
    }

    public static void main(String[] args) {
        String uuid = generateUUID();
        System.out.println("generateUUID: " + uuid);
    }

    public static native String generateUUID();
}
