package com.example.bmwapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    private Stack<Fragment> fragmentStack = new Stack<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gotoAllCarsFragment();
    }
    private void gotoLoginFragment() {
        FragmentTransaction ft= getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new LoginFragment());
        ft.commit();
    }
    private void gotoAllCarsFragment() {
        FragmentTransaction ft= getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new AllCarsFragment());
        ft.commit();
    }
    private void gotoAddCarFragment() {
        FragmentTransaction ft= getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new AddCarFragment());
        ft.commit();
    }
    public void pushFragment(Fragment fragment) {
        fragmentStack.push(fragment);
        /*
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout, fragment)
                .commit(); */
    }
}