package com.campusassist.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.MissingFormatArgumentException;

public class FragmentHome extends Fragment {

    private Button btnFacultyDeets, btnMessMenu, btnFeeDeets, btnClgMap;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        /* NullPointerException aara yaha pe, getView() m kuch problem h..tutorial m view() tha sirf..library ka issue h yaha pe shyd
        btnFacultyDeets= getView().findViewById(R.id.btnFacultyDeets);
        btnMessMenu= getView().findViewById(R.id.btnMessMenu);
        btnFeeDeets= getView().findViewById(R.id.btnFeeDeets);
        btnClgMap= getView().findViewById(R.id.btnClgMap);
        */

        /* upar wale commented out h isliye inhe bhi kardiya, resolve kardena
        btnFacultyDeets.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                /*Intent intent=new Intent(FragmentHome.this,FacultyDeets.class);
                startActivity(intent);


            }
        });

        btnMessMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            /*
                Intent intent=new Intent(MainActivity.this,com.campusassist.myapplication.MessMenu.class);
            startActivity(intent);

             //
            }
        });

        btnFeeDeets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            /*
                Intent intent=new Intent(FragmentHome.this,com.campusassist.myapplication.FeeDeets.class);
            startActivity(intent);


            }
        });

        btnClgMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //Intent intent=new Intent(FragmentHome.this);
            }
        });
        */

        return inflater.inflate(R.layout.fragment_home,container,false);
    }


}
