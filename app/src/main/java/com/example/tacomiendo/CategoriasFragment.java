package com.example.tacomiendo;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tacomiendo.adapters.Seccionesadapter;
import com.example.tacomiendo.fragments.PostresFragment;
import com.example.tacomiendo.fragments.bebidasFragment;
import com.example.tacomiendo.fragments.platillosFragment;


public class CategoriasFragment extends Fragment {


    private OnFragmentInteractionListener mListener;
    View vista;
    private AppBarLayout appBar;
    private TabLayout pestanas;
    private ViewPager viewPager;
    public static int rotacion=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista=inflater.inflate(R.layout.fragment_categorias, container, false);

        if(rotacion==0) {
            View parent=(View)container.getParent();
            if (appBar == null) {
                appBar = (AppBarLayout) parent.findViewById(R.id.appbar);
                pestanas = new TabLayout(getActivity());
                pestanas.setTabTextColors(Color.parseColor("#FFFFFF"),Color.parseColor("#FFFFFF"));
                appBar.addView(pestanas);

                viewPager = (ViewPager) vista.findViewById(R.id.viewpagercat);
                llenarViewPager(viewPager);
                viewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                        super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                    }
                });
                pestanas.setupWithViewPager(viewPager);
            }
            pestanas.setTabGravity(TabLayout.GRAVITY_FILL);
        }else{
            rotacion=1;
        }
        return vista;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if(rotacion==0) {
            appBar.removeView(pestanas);
        }
    }

    private void llenarViewPager(ViewPager viewPager) {
        Seccionesadapter adapter=new Seccionesadapter(getFragmentManager());
        adapter.addFragment(new platillosFragment(),"Platillos");
        adapter.addFragment(new bebidasFragment(),"Bebidas");
        adapter.addFragment(new PostresFragment(),"Postres");
        viewPager.setAdapter(adapter);
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
