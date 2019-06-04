package com.example.tacomiendo.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tacomiendo.Comida;
import com.example.tacomiendo.Direccion;
import com.example.tacomiendo.R;
import com.example.tacomiendo.adapters.Listaadapter;
import com.example.tacomiendo.adapters.Listadiradapter;

import java.util.ArrayList;


public class direccionesFragment extends Fragment {

    RecyclerView recyclerViewdireccion;
    ArrayList<Direccion> listadireccion;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista=inflater.inflate(R.layout.fragment_direcciones, container, false);
        listadireccion= new ArrayList<>();
        recyclerViewdireccion=(RecyclerView) vista.findViewById(R.id.recyclerviewdir);
        recyclerViewdireccion.setLayoutManager(new LinearLayoutManager(getContext()));
        llenarlista();
        Listadiradapter listadapter=new Listadiradapter(listadireccion);
        recyclerViewdireccion.setAdapter(listadapter);
        return vista;
    }

    private void llenarlista() {
        listadireccion.add(new Direccion("Lerdo De Tejada Ote #8","1","Zitacuaro, Mich","7151037416"));
    }

}