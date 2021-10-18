package com.ascemme.questkarinf.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ascemme.questkarinf.R;
import com.ascemme.questkarinf.model.ModelText;

import java.util.List;

public class GameAdapter extends ArrayAdapter<ModelText> {
    public GameAdapter(Context context, int resource, List<ModelText> shapeList){
        super(context,resource,shapeList);
    }

    @Override
    public View getView(int position, View contaner, ViewGroup parent) {
        ModelText shape = getItem(position);
        if (contaner == null){
            contaner = LayoutInflater.from(getContext()).inflate(R.layout.type_model,parent,false);
        }
        TextView tv = (TextView) contaner.findViewById(R.id.answer);
        tv.setText(shape.getName());
        return contaner;
    }}
