package com.tranlook.testactivitylifecircle;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class TestActivity extends AppCompatActivity {

    String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, "On Create ccccccc");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "On Pause eeee");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "On Stop ggg");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "On Destroy");

    }
}
