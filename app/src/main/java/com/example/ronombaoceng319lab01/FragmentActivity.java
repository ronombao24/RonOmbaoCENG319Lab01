package com.example.ronombaoceng319lab01;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentActivity extends Fragment
{

    public FragmentActivity()
    {
        //CONSTRUCTOR TO RUN THE PROGRAM
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        String str ;
        str = getString(R.string.activity_fragment_header)+""+getString(R.string.onCreateNotif);

        View viewList = inflater.inflate(R.layout.fragment_activity, container, false);
        Toast toast = Toast.makeText(getContext(),str,Toast.LENGTH_SHORT);
        toast.show();

        final ListView listView = viewList.findViewById(R.id.listview);
        listView.setSelector(android.R.color.holo_green_dark);
        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView parent, View view, int pos, long id)
            {
                if (pos == 0)
                {
                    Intent intent = new Intent(getActivity(), VRActivity.class);
                    intent.putExtra("activity", "AIActivity");
                    startActivity(intent);
                }
                if (pos == 1)
                {
                    Intent intent = new Intent(getActivity(), VRActivity.class);
                    intent.putExtra("activity", "VRActivity");
                    startActivity(intent);
                }
            }
        });

        return viewList;
    }


    public void onStart()
    {
        super.onStart();
        String activityString ;
        activityString = getString(R.string.activity_fragment_header) + "" + getString(R.string.onStartNotif);

        Toast toast = Toast.makeText(getContext(), activityString, Toast.LENGTH_SHORT);

        toast.show();
    }

}