package com.example.a06_navegacioninferior.ui.calls;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CallsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CallsViewModel() {
        mText = new MutableLiveData<>();
        //Texto que queremos que se muestre en el fragmento
        mText.setValue("This is calls fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
