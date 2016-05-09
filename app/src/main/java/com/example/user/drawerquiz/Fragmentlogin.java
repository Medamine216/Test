
package com.example.user.drawerquiz;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.annotation.Nullable;
/**
 * Created by user on 06/05/2016.
 */
public class Fragmentlogin extends Fragment {
  View myview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        myview=inflater.inflate(R.layout.login,container,false);
        return myview;
    }
}
