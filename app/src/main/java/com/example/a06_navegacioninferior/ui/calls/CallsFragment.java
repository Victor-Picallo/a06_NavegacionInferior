package com.example.a06_navegacioninferior.ui.calls;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.a06_navegacioninferior.databinding.FragmentCallsBinding;
import com.example.a06_navegacioninferior.databinding.FragmentNotificationsBinding;

public class CallsFragment extends Fragment {

    // Variable para el binding
    private FragmentCallsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CallsViewModel callsViewModel =
                new ViewModelProvider(this).get(CallsViewModel.class);

        binding = FragmentCallsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCalls;
        callsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}