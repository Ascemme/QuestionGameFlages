package com.ascemme.questkarinf.UI;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.ascemme.questkarinf.MainActivity;
import com.ascemme.questkarinf.R;
import com.ascemme.questkarinf.model.GameAdapter;
import com.ascemme.questkarinf.model.ListOfValues;
import com.ascemme.questkarinf.model.Logic;
import com.ascemme.questkarinf.model.ModelText;

import java.util.ArrayList;
import java.util.Random;

public class game extends Fragment {
    int index = 0;
    ImageView imageView;
    public static ArrayList<ModelText> textList = new ArrayList <ModelText>();
    private ListView listView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imageView = getView().findViewById(R.id.flag);
        gamer();
    }

    private void gamer(){
        index =+1;
        setupData();
        setupList();
        setupOnclickListener();
        if (index == 10){
            ((MainActivity) getActivity()).ChangerFragment(2);
        }
    }
    private void setupData()
    {   Logic logic = new Logic(1);
        imageView.setImageResource(logic.getImageValue());
        textList.clear();
        ModelText btnFerst = new ModelText(logic.getFirstBtn(),1);
        textList.add(btnFerst);
        ModelText btnSecond = new ModelText(logic.getSecondBtn(),2);
        textList.add(btnSecond);
        ModelText btnThird = new ModelText(logic.getThirdBtn(),3);
        textList.add(btnThird);
        ModelText btnFourth = new ModelText(logic.getFourthBtn(),4);
        textList.add(btnFourth);
    }

    private void setupList(){
        listView = (ListView) getView().findViewById(R.id.ListView);
        GameAdapter adapter = new GameAdapter(getActivity().getApplicationContext(),0, textList);
        listView.setAdapter(adapter);
    }

    private void setupOnclickListener(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                ModelText selectedShape = (ModelText) (listView.getItemAtPosition(position));
//                Intent showDitel = new Intent(getApplicationContext(),DitailActivity.class);
//                showDitel.putExtra("id",selectedShape.getId());
//                startActivity(showDitel);
                System.out.println(selectedShape.getName());
                System.out.println(selectedShape.getId());
                gamer();
            }
        });
    }
}
