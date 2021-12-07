package com.example.petroleumcalculator.ui.numerodereynolds;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class NumeroDeReynoldsViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public NumeroDeReynoldsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Numero de Reynolds fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
