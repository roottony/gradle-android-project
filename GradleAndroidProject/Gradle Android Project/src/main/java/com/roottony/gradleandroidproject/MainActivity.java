package com.roottony.gradleandroidproject;

import android.os.Bundle;
import android.util.Log;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.google.gson.Gson;
import com.roottony.gradleandroidlibrary.HelloLibraryProject;

public class MainActivity extends SherlockFragmentActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);

        new HelloLibraryProject().sayHello(this);

        Gson gson = new Gson();
        Log.i(TAG, gson.toJson("Hello from GSON!"));
    }

}
