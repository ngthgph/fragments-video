package com.example.fragmentsvideo;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class DetailFrag extends Fragment {

    TextView tvDescription;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_detail, container, false);
        tvDescription = v.findViewById(R.id.tvDescription);
        return v;
    }

    public void updateAsSelected(ArrayList<String> descriptions, int index) {
        tvDescription.setText(descriptions.get(index));
    }
}