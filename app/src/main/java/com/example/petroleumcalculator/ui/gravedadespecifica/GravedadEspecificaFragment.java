package com.example.petroleumcalculator.ui.gravedadespecifica;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;

import com.example.petroleumcalculator.R;
import com.example.petroleumcalculator.databinding.FragmentGalleryBinding;
import com.example.petroleumcalculator.databinding.FragmentGravedadApiBinding;
import com.example.petroleumcalculator.databinding.FragmentGravedadEspecificaBinding;
import com.example.petroleumcalculator.ui.gallery.GalleryViewModel;
import com.example.petroleumcalculator.ui.gravedadespecifica.GravedadEspecificaViewModel;

public class GravedadEspecificaFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_gravedad_especifica, container, false);
        return root;
    }
}


