package com.example.petroleumcalculator.ui.gravedadapi;

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
import com.example.petroleumcalculator.databinding.FragmentGravedadApiBinding;
import com.example.petroleumcalculator.ui.gravedadapi.GravedadApiViewModel;

public class GravedadApiFragment extends Fragment {

    private GravedadApiViewModel gravedadapiViewModel;
    private FragmentGravedadApiBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        gravedadapiViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(GravedadApiViewModel.class);

        binding = FragmentGravedadApiBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        gravedadapiViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });
        return root;
    }

}