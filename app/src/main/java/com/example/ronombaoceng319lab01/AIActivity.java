package com.example.ronombaoceng319lab01;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class AIActivity extends AppCompatActivity
{
    TextView text;
    String dummy_text = "Cycle: \n";

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ai_activity);

        Intent intent = getIntent();
        String string = intent.getStringExtra("activity");
        text = findViewById(R.id.aiView);
        text.setText(string + dummy_text);
        text.append(getString(R.string.onCreateNotif)+"\n");
    }

    public void onStart()
    {
        super.onStart();
        text.append(getString(R.string.onStartNotif)+"\n");
    }

    public void onStop()
    {
        super.onStop();
        text.append(getString(R.string.onStopNotif)+"\n");
    }

    public void onPause()
    {
        super.onPause();
        text.append(getString(R.string.onStopNotif)+"\n");
    }

    public void onResume()
    {
        super.onResume();
        text.append(getString(R.string.onStopNotif)+"\n");
    }

    public void onDestroy()
    {
        super.onDestroy();
        text.append(getString(R.string.onDestroyNotif)+"\n");
    }
}