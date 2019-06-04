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
import com.example.tacomiendo.R;
import com.example.tacomiendo.adapters.Listaadapter;

import java.util.ArrayList;


public class platillosFragment extends Fragment {

    RecyclerView recyclerViewcomida;
    ArrayList<Comida> listacomida;

      @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista=inflater.inflate(R.layout.fragment_platillos, container, false);
        listacomida= new ArrayList<>();
        recyclerViewcomida=(RecyclerView) vista.findViewById(R.id.recyclerviewplat);
        recyclerViewcomida.setLayoutManager(new GridLayoutManager(getContext(),2));
        llenarlista();
        Listaadapter listadapter=new Listaadapter(listacomida);
        recyclerViewcomida.setAdapter(listadapter);
        return vista;
    }

    private void llenarlista() {
        listacomida.add(new Comida("Sandwich","$ 25.00",R.drawable.sandwich));
        listacomida.add(new Comida("Camarones","$ 100.00",R.drawable.camarones));
        listacomida.add(new Comida("Lomo De Cerdo","$ 110.00",R.drawable.lomo_cerdo));
        listacomida.add(new Comida("Sushi","$ 60.00",R.drawable.sushi));
    }

}
