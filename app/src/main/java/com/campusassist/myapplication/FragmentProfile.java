package com.campusassist.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentProfile extends Fragment {
    private TextView tvName,tvCllgName,tvRollNo,tvEmail;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        tvName=getView().findViewById(R.id.tvName);
        tvCllgName=getView().findViewById(R.id.tvCllgName);
        tvRollNo=getView().findViewById(R.id.tvRollNo);
        tvEmail=getView().findViewById(R.id.tvEmail);


        return inflater.inflate(R.layout.fragment_profile,container,false);
    }
}
