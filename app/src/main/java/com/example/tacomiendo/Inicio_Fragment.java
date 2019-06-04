package com.example.tacomiendo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tacomiendo.adapters.ListaIniadapter;
import com.example.tacomiendo.adapters.Listaadapter;

import java.util.ArrayList;


public class Inicio_Fragment extends Fragment {
    RecyclerView recyclerViewcomida;
    ArrayList<Comida> listacomida;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista=inflater.inflate(R.layout.fragment_inicio_, container, false);
        listacomida= new ArrayList<>();
        recyclerViewcomida=(RecyclerView) vista.findViewById(R.id.recyclerviewini);
        recyclerViewcomida.setLayoutManager(new GridLayoutManager(getContext(),1));
        llenarlista();
        ListaIniadapter listadapter=new ListaIniadapter(listacomida);
        recyclerViewcomida.setAdapter(listadapter);
        return vista;
    }
    private void llenarlista() {
        listacomida.add(new Comida("Cupcakes","$ 40.00",R.drawable.cupcakes_festival));
        listacomida.add(new Comida("Cafe","$ 20.00",R.drawable.cafe));
        listacomida.add(new Comida("Rosca","$ 25.00",R.drawable.rosca));
        listacomida.add(new Comida("Lomo de Cerdo","$ 110.00",R.drawable.lomo_cerdo));
        listacomida.add(new Comida("Coctel Jordano","$ 80.00",R.drawable.coctel_jordano));
    }
}
