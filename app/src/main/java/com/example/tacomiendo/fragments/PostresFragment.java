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

public class PostresFragment extends Fragment {
    RecyclerView recyclerViewcomida;
    ArrayList<Comida> listacomida;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista=inflater.inflate(R.layout.fragment_postres, container, false);
        listacomida= new ArrayList<>();
        recyclerViewcomida=(RecyclerView) vista.findViewById(R.id.recyclerviewpost);
        recyclerViewcomida.setLayoutManager(new GridLayoutManager(getContext(),2));
        llenarlista();
        Listaadapter listadapter=new Listaadapter(listacomida);
        recyclerViewcomida.setAdapter(listadapter);
        return vista;
    }
    private void llenarlista() {
        listacomida.add(new Comida("Cupcakes","$ 40.00",R.drawable.cupcakes_festival));
        listacomida.add(new Comida("Flan","$ 20.00",R.drawable.flan_celestial));
        listacomida.add(new Comida("Muffin","$ 25.00",R.drawable.muffin_amoroso));
        listacomida.add(new Comida("Pastel De Fresa","$ 30.00",R.drawable.pastel_fresa));
        listacomida.add(new Comida("Postre Vainilla","$ 25.00",R.drawable.postre_vainilla));
        listacomida.add(new Comida("Rosca","$ 25.00",R.drawable.rosca));

    }
}
