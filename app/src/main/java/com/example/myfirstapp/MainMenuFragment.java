package com.example.myfirstapp;

import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myfirstapp.databinding.FragmentMainMenuBinding;

public class MainMenuFragment extends Fragment {

    private FragmentMainMenuBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentMainMenuBinding.inflate(inflater, container, false);

        binding.buttonToSecondFragment.setOnClickListener( v -> {
            Navigation.findNavController(v).navigate(MainMenuFragmentDirections.actionMainMenuFragmentToSecondFragment());
        });

        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}