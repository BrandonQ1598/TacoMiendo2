package com.example.tacomiendo.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tacomiendo.Comida;
import com.example.tacomiendo.Direccion;
import com.example.tacomiendo.R;

import java.util.ArrayList;

public class Listadiradapter extends RecyclerView.Adapter<Listadiradapter.ViewHolderDireccion> {
    ArrayList<Direccion> listadireccion;

    public Listadiradapter(ArrayList<Direccion> listadireccion) {
        this.listadireccion = listadireccion;
    }

    @NonNull
    @Override
    public ViewHolderDireccion onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_dir,null,false);
        return new ViewHolderDireccion(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDireccion viewHolderDireccion, int i) {
        viewHolderDireccion.direccion.setText(listadireccion.get(i).getDireccion());
        viewHolderDireccion.departamento.setText(listadireccion.get(i).getDepartamento());
        viewHolderDireccion.ciudad.setText(listadireccion.get(i).getCiudad());
        viewHolderDireccion.telefono.setText(listadireccion.get(i).getTelefono());
    }

    @Override
    public int getItemCount() {
        return listadireccion.size();
    }

    public class ViewHolderDireccion extends RecyclerView.ViewHolder {
        TextView direccion,departamento,ciudad,telefono;
        public ViewHolderDireccion(@NonNull View itemView) {
            super(itemView);
            direccion=(TextView) itemView.findViewById(R.id.direccion);
            departamento=(TextView) itemView.findViewById(R.id.departamento);
            ciudad=(TextView) itemView.findViewById(R.id.ciudad);
            telefono=(TextView) itemView.findViewById(R.id.telefono);
        }
    }
}