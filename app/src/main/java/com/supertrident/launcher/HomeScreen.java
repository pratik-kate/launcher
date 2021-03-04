package com.supertrident.launcher;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class HomeScreen extends Fragment implements View.OnLongClickListener {

    ImageView imageViewDrawer;
    public HomeScreen() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_screen,container,false);

        view.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(), "Clicked", Toast.LENGTH_SHORT).show();
                Intent pickIntent = new Intent(AppWidgetManager.ACTION_APPWIDGET_PICK);
                pickIntent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, 1);
                startActivityForResult(pickIntent, 1);
                return false;
            }
        });

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

    private void loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .setCustomAnimations(android.R.anim.fade_in,
                            android.R.anim.fade_out)
                    .replace(R.id.container, fragment)
                    .commit();
        }
    }

    @Override
    public boolean onLongClick(View v) {
        Toast.makeText(getContext(), "Clicked", Toast.LENGTH_SHORT).show();
        Intent pickIntent = new Intent(AppWidgetManager.ACTION_APPWIDGET_PICK);
        pickIntent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, 1);
        startActivityForResult(pickIntent, 1);
        return false;
    }
}