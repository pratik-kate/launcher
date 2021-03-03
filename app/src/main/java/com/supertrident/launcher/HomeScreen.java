package com.supertrident.launcher;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class HomeScreen extends Fragment {

    ImageView imageViewDrawer;
    public HomeScreen() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_screen,container,false);

        return view;
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imageViewDrawer = view.findViewById(R.id.icon_drawer);



        imageViewDrawer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                loadFragment(new AppDrawer());
            }
        });


    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .setCustomAnimations(android.R.anim.slide_in_left,
                            android.R.anim.slide_out_right)
                    .replace(R.id.container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

}