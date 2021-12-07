package com.example.petroleumcalculator.ui.gravedadespecifica;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class GravedadEspecificaViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public GravedadEspecificaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Gravedad Especifica fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
