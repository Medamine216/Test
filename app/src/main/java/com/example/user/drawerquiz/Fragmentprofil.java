package com.example.user.drawerquiz;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by user on 06/05/2016.
 */
public class Fragmentprofil extends android.app.Fragment{

    View myview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        myview=inflater.inflate(R.layout.profil,container,false);
        return myview;
    }
}
