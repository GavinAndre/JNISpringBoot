#include "NativeLib.h"
#include "jni_lib.hpp"
#include "uuid.hpp"

JNIEXPORT jstring JNICALL Java_com_gavinandre_jnispringboot_jni_NativeLib_generateUUID
  (JNIEnv *env, jclass type) {
    std::string uuid = generate_hex(16);
    return string_to_jstring(env, uuid);
}
