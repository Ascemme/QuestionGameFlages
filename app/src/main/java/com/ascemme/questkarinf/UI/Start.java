package com.ascemme.questkarinf.UI;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ascemme.questkarinf.R;
import com.ascemme.questkarinf.MainActivity;

public class Start extends Fragment implements View.OnClickListener {
    Button btnStart;
    Button btnExit;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnStart = getView().findViewById(R.id.btnStart);
        btnExit = getView().findViewById(R.id.btnExit);
        btnStart.setOnClickListener(this);
        btnExit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnStart:
                ((MainActivity) getActivity()).ChangerFragment(1);

        }
    }
}
