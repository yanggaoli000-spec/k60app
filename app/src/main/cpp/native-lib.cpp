#include <jni.h>
#include <string>
#include <android/log.h>

#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, "K60Native", __VA_ARGS__)

extern "C" JNIEXPORT jstring JNICALL
Java_com_k60_app_MainActivity_stringFromJNI(JNIEnv* env, jclass) {
    LOGI("stringFromJNI");
    return env->NewStringUTF("Hello from C++ arm64-v8a");
}

extern "C" JNIEXPORT jint JNICALL
Java_com_k60_app_MainActivity_add(JNIEnv*, jclass, jint a, jint b) {
    LOGI("add(%d,%d)", a, b);
    return a + b;
}
