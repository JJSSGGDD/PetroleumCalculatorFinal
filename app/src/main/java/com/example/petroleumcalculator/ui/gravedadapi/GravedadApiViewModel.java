package com.example.petroleumcalculator.ui.gravedadapi;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class GravedadApiViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public GravedadApiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Gravedad API fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
