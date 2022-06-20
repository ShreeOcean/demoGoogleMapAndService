package com.example.mapdemoapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mapdemoapp.databinding.FragmentMapBinding;

public class MapFrag extends Fragment {

    FragmentMapBinding mapBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mapBinding = FragmentMapBinding.inflate(inflater,container,false);
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_map, container, false);
        return mapBinding.getRoot();
    }
}