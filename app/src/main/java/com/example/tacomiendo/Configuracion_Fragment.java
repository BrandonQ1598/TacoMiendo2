package com.example.tacomiendo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Configuracion_Fragment extends Fragment {
    TextView boton,opcion;
    RadioGroup grupo;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista=inflater.inflate(R.layout.fragment_configuracion_, container, false);
        boton=(TextView) vista.findViewById(R.id.boton);
        opcion=(TextView) vista.findViewById(R.id.txtop);
        grupo=(RadioGroup) vista.findViewById(R.id.opciones);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grupo.setVisibility(View.VISIBLE);
            }
        });
        grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId==R.id.radioButton){
                    Toast.makeText(getContext(),"Un correo al dia",Toast.LENGTH_SHORT).show();
                    opcion.setText("Un correo al dia");
                    grupo.setVisibility(View.INVISIBLE);
                }else if (checkedId==R.id.radioButton2){
                    Toast.makeText(getContext(),"Un correo a la semana",Toast.LENGTH_SHORT).show();
                    opcion.setText("Un correo a la semana");
                    grupo.setVisibility(View.INVISIBLE);
                }else if (checkedId==R.id.radioButton3){
                    Toast.makeText(getContext(),"Un correo al mes",Toast.LENGTH_SHORT).show();
                    opcion.setText("Un correo al mes");
                    grupo.setVisibility(View.INVISIBLE);
                }else if (checkedId==R.id.radioButton4){
                    Toast.makeText(getContext(),"Un correo al año",Toast.LENGTH_SHORT).show();
                    opcion.setText("Un correo al año");
                    grupo.setVisibility(View.INVISIBLE);
                }

            }
        });
        return vista;

    }

}
