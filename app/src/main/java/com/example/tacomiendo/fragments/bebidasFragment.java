package com.example.tacomiendo.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tacomiendo.Comida;
import com.example.tacomiendo.R;
import com.example.tacomiendo.adapters.Listaadapter;

import java.util.ArrayList;

public class bebidasFragment extends Fragment {
    RecyclerView recyclerViewcomida;
    ArrayList<Comida> listacomida;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista=inflater.inflate(R.layout.fragment_bebidas, container, false);
        listacomida= new ArrayList<>();
        recyclerViewcomida=(RecyclerView) vista.findViewById(R.id.recyclerviewbeb);
        recyclerViewcomida.setLayoutManager(new GridLayoutManager(getContext(),2));
        llenarlista();
        Listaadapter listadapter=new Listaadapter(listacomida);
        recyclerViewcomida.setAdapter(listadapter);
        return vista;
    }

    private void llenarlista() {
        listacomida.add(new Comida("Vino Tinto","$ 70.00",R.drawable.vino_tinto));
        listacomida.add(new Comida("Cafe","$ 20.00",R.drawable.cafe));
        listacomida.add(new Comida("Jugo","$ 15.00",R.drawable.jugo_natural));
        listacomida.add(new Comida("Coctel","$ 60.00",R.drawable.coctel));
        listacomida.add(new Comida("Coctel Jordano","$ 80.00",R.drawable.coctel_jordano));
    }
}
