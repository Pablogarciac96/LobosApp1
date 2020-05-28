package com.garcua.lobosapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class perfil extends Fragment {

    private ImageButton form;
    private View view;

    public perfil() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_perfil, container, false);
        configureImageButton();
        return view;
    }

    private void configureImageButton() {
        // TODO Auto-generated method stub
        ImageButton btn = (ImageButton) view.findViewById(R.id.imageButton8);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
            ///    Navigation.findNavController(view).navigate(R.id.form);

            }
        });


    }
}