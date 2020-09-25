package com.example.ronombaoceng319lab01;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentDisplay extends Fragment
{
    public TextView text;

    public FragmentDisplay()
    {
        //CONSTRUCTOR TO RUN THE PROGRAM
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        String string = getString(R.string.display_activity_header)+""+getString(R.string.onCreateNotif);


        Toast toast = Toast.makeText(getContext(), string, Toast.LENGTH_SHORT);
        toast.show();

        return inflater.inflate(R.layout.fragment_display, container, false);
    }

    @Override
    public void onStart()
    {
        super.onStart();

        Toast toast = Toast.makeText(getContext(),getString(R.string.display_activity_header)+ "" + getString(R.string.onStartNotif), Toast.LENGTH_SHORT);
        toast.show();
    }
    @SuppressLint("WrongViewCast")
    public void displayStatus (String string)
    {
        text = (TextView) getActivity().findViewById(R.id.mainview);
        text.append(string);
    }

}
