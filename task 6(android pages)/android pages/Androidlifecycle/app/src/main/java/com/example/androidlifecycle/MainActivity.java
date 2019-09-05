package com.example.androidlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("onCreatTag", "onCreate: app start");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStartTag", "onStart: app start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onPesumeTag", "onResume: app open");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPauseTag", "onPause: app pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStopTag", "onStop: app background");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestoryTag", "onDestroy:app close ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("onRestartTag", "onRestart: app start");
    }
}
