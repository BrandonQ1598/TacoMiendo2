package com.example.tacomiendo.adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class Seccionesadapter extends FragmentStatePagerAdapter {
    private final List<Fragment> listafragments=new ArrayList<>();
    private final List<String> listaTitulos=new ArrayList<>();
    public Seccionesadapter(FragmentManager fm) {
        super(fm);
    }
    public void addFragment(Fragment fragment,String titulo){
        listafragments.add(fragment);
        listaTitulos.add(titulo);
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listaTitulos.get(position);
    }

    @Override
    public Fragment getItem(int i) {
        return listafragments.get(i);
    }

    @Override
    public int getCount() {
        return listafragments.size();
    }
}
