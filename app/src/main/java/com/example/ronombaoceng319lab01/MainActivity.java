package com.example.ronombaoceng319lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    FragmentDisplay fragment;
    String string;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment = (FragmentDisplay) getSupportFragmentManager().findFragmentById(R.id.displayFragments);
        string = getString(R.string.main_activity_header) + "\n" + getString(R.string.onCreateNotif);
        fragment.displayStatus(string);
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        string = "\n" + getString(R.string.onStartNotif);
        fragment.displayStatus(string);
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        string = "\n" + getString(R.string.onStopNotif);
        fragment.displayStatus(string);
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        string = "\n" + getString(R.string.onPauseNotif);
        fragment.displayStatus(string);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        string = "\n" + getString(R.string.onResumeNotif);
        fragment.displayStatus(string);
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        string = "\n" + getString(R.string.onDestroyNotif);
        fragment.displayStatus(string);
    }
}