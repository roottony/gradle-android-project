Gradle-android-sample-project
======================

Project demonstrates several basic and some more advanced setup options for Android project built with Gradle. 

## Building project ##
### Prerequirements ###
1. Java 1.6 or 1.7 installed, java executable should ba accessable from command line (added to PATH system variable).
2. Latest Android SDK must be installed.
3. ANDROID_SDK_HOME environment variable pointing to the Android SDK location.

### Building ###
Change direcory to the project directory:

    cd GradleAndroidProject
    
Build the project:

    ./gradlew assembleDebug
    
Install project on connected Android device:

    ./gradlew installDebug