package com.example.tacomiendo.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tacomiendo.Comida;
import com.example.tacomiendo.R;

import java.util.ArrayList;

public class Listaadapter extends RecyclerView.Adapter<Listaadapter.ViewHolderComida> {
    ArrayList<Comida> listacomida;

    public Listaadapter(ArrayList<Comida> listacomida) {
        this.listacomida = listacomida;
    }

    @NonNull
    @Override
    public ViewHolderComida onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_comida,null,false);
        return new ViewHolderComida(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderComida viewHolderComida, int i) {
        viewHolderComida.nombre.setText(listacomida.get(i).getNombre());
        viewHolderComida.precio.setText(listacomida.get(i).getPrecio());
        viewHolderComida.foto.setImageResource(listacomida.get(i).getFoto());
    }

    @Override
    public int getItemCount() {
        return listacomida.size();
    }

    public class ViewHolderComida extends RecyclerView.ViewHolder {
        TextView nombre,precio;
        ImageView foto;
        public ViewHolderComida(@NonNull View itemView) {
            super(itemView);
            nombre=(TextView) itemView.findViewById(R.id.nombre);
            precio=(TextView) itemView.findViewById(R.id.precio);
            foto=(ImageView) itemView.findViewById(R.id.foto);
        }
    }
}
