package com.example.clase8demo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BlankFragment extends Fragment {

    public BlankFragment() {
        // Required empty public constructor
    }

    int i  = 0;

    // TODO: Rename and change types and number of parameters
    public static BlankFragment newInstance(int i) {
        BlankFragment fragment = new BlankFragment();
        fragment.i = i;

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        TextView textView = view.findViewById(R.id.textoFragment);
        textView.setText("hola mundo " + i);
        return view;

        //return inflater.inflate(R.layout.fragment_blank, container, false);
    }
}