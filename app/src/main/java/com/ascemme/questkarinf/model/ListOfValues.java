package com.ascemme.questkarinf.model;

import com.ascemme.questkarinf.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListOfValues {
    ArrayList<String> ancwerValues = new ArrayList<String>();
    int inter;
    private int[] images = {
            R.drawable.belarus,
            R.drawable.shese,
            R.drawable.uzb,
            R.drawable.usa,
            R.drawable.poland,
            R.drawable.it,
            R.drawable.france,
            R.drawable.rus,
            R.drawable.turkmen,
            R.drawable.japen,
            R.drawable.flagg1,
    };


    public ListOfValues() {
        addingToList();
    }

    public ArrayList<String> getAncwerValues() {
        return ancwerValues;
    }

    public void setAncwerValues(ArrayList<String> ancwerValues) {
        this.ancwerValues = ancwerValues;
    }

    public int[] getImages() {
        return images;
    }

    public void setImages(int[] images) {
        this.images = images;
    }

    public void addingToList(){
        ancwerValues.add("Беларусь");
        ancwerValues.add("Швейцария");
        ancwerValues.add("Узбекистан");
        ancwerValues.add("Америка");
        ancwerValues.add("Потльша");
        ancwerValues.add("Италия");
        ancwerValues.add("Франция");
        ancwerValues.add("Россия");
        ancwerValues.add("Туркменистан");
        ancwerValues.add("Япония");
        ancwerValues.add("Германия");
    }



}
