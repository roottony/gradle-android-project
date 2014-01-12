package com.roottony.gradleandroidproject;

import android.os.Bundle;
import android.widget.TextView;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.roottony.gradleandroidmaven.HelloMavenLibrary;
import com.roottony.hellojni.lib.HelloJni;
import com.google.gson.Gson;
import com.roottony.gradleandroidlibrary.HelloLibraryProject;
import com.roottony.helloso.HelloSo;

public class MainActivity extends SherlockFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getTextViewById(R.id.hello_from_project).setText(" ");
        getTextViewById(R.id.hello_from_library_project).setText(new HelloLibraryProject().sayHello());
        getTextViewById(R.id.hello_from_artifact_jar).setText(new Gson().toJson("Hello from GSON!"));
        getTextViewById(R.id.hello_from_jni).setText("JNI name is " + new HelloJni().jniNameFromJNI());
        getTextViewById(R.id.hello_from_so).setText(new HelloSo().helloFromSoLibrary());
        getTextViewById(R.id.hello_from_local_repo).setText(new HelloMavenLibrary().sayHello());
        getTextViewById(R.id.hello_from_build_config).setText("Ads enabled: " + BuildConfig.ADS_ENABLED);
    }

    private TextView getTextViewById(int textViewId) {
        return (TextView) findViewById(textViewId);
    }

}
