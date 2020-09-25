package com.example.ronombaoceng319lab01;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class VRActivity  extends AppCompatActivity
{
    TextView text;
    String placeholder = "Cycle: \n";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vr_activity);

        Intent intent = getIntent();
        String string = intent.getStringExtra("activity");
        text = findViewById(R.id.vrView);
        text.setText(string + placeholder);
        text.append(getString(R.string.onCreateNotif)+"\n");
    }

    //onStart()
    public void onStart()
    {
        super.onStart();
        text.append(getString(R.string.onStartNotif)+"\n");
    }

    //onStop()
    public void onStop()
    {
        super.onStop();
        text.append(getString(R.string.onStopNotif)+"\n");
    }

    //onPause()
    public void onPause()
    {
        super.onPause();
        text.append(getString(R.string.onStopNotif)+"\n");
    }

    //onResume()
    public void onResume()
    {
        super.onResume();
        text.append(getString(R.string.onStopNotif)+"\n");
    }

    //onDestroy()
    public void onDestroy()
    {
        super.onDestroy();
        text.append(getString(R.string.onDestroyNotif)+"\n");
    }
}