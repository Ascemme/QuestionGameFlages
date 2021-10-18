package com.ascemme.questkarinf;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.ascemme.questkarinf.UI.game;
import com.ascemme.questkarinf.UI.loging;
import com.ascemme.questkarinf.UI.Start;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChangerFragment(0);
    }

    public void ChangerFragment(int i){
        Fragment fragment;
        switch (i){
            case 1:
                fragment = new game();
                break;
            case 2:
                fragment = new loging();
                break;
            default:
                fragment = new Start();
                break;
        }
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_main,fragment);
        ft.commit();
    }

}
