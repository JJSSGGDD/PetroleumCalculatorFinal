package com.example.petroleumcalculator.ui.numerodereynolds;

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
import com.example.petroleumcalculator.databinding.FragmentNumeroDeReynoldsBinding;
import com.example.petroleumcalculator.ui.gallery.GalleryViewModel;
import com.example.petroleumcalculator.ui.gravedadespecifica.GravedadEspecificaViewModel;
import com.example.petroleumcalculator.ui.numerodereynolds.NumeroDeReynoldsViewModel;


public class NumeroDeReynoldsFragment extends Fragment {

    private NumeroDeReynoldsViewModel numeroDeReynoldsViewModel;
    private FragmentNumeroDeReynoldsBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        numeroDeReynoldsViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(NumeroDeReynoldsViewModel.class);

        binding = FragmentNumeroDeReynoldsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        numeroDeReynoldsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });
        return root;
    }

}
