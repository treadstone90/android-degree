package com.example.karthik.portfolio;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LinearLayout linearLayout = (LinearLayout)inflater.inflate(R.layout.fragment_main, container, false);
        ArrayList<String> data = new ArrayList<String>();
        data.add("Spotify Streamer");
        data.add("Scores App");
        data.add("Library App");
        data.add("Build it Bigger");
        data.add("XYZ Reader");
        data.add("Capstone: My own app");

        final Toast toast = Toast.makeText(getActivity(), "blah", Toast.LENGTH_SHORT);

        for(String s: data) {
            final Button b = (Button)inflater.inflate(R.layout.button_app, container, false);
            b.setText(s);
            b.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    toast.setText("This button will launch " + b.getText());
                    toast.show();
                }
            });
            if(s.equals("Capstone: My own app")) {
                b.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
            } else {
                b.getBackground().setColorFilter(Color.parseColor("#673AB7"), PorterDuff.Mode.MULTIPLY);
            }
            linearLayout.addView(b);
        }
        return linearLayout;
    }
}
