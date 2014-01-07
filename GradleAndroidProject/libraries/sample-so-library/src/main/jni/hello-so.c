#include <string.h>
#include <jni.h>

/**
 * Source of the .so library. Not used during the build process.
 * Rename 'native' folder to 'jni', and 'jniLibs' folder to '<any-other-name>' to rebuild so libraries from this code.
 */
jstring
Java_com_roottony_helloso_HelloSo_helloFromSoLibrary(JNIEnv* env, jobject thiz)
{
    return (*env)->NewStringUTF(env, "Hello from .so library!");
}
