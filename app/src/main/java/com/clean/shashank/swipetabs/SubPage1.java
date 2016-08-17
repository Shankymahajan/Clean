package com.clean.shashank.swipetabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.io.File;


/**
 * A simple {@link Fragment} subclass.
 */
public class SubPage1 extends Fragment {

    Button buttonOpenDialog ;
    Button buttonUp;
    TextView textFolder ;

    String KEY_TEXTPSS = "TEXTPSS";
        static  final int DIALOG_ID = 0 ;
    ListView dialog_Listview ;

    File root;
    File curFolder ;

    public SubPage1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sub_page1, container, false);
    }

}
