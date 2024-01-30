package com.example.bmwapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link M4CompetitionGreenFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class M4CompetitionGreenFragment extends Fragment {
    private ImageView btnSettings;
    private ImageView btnBack;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public M4CompetitionGreenFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment M4CompetitionGreenFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static M4CompetitionGreenFragment newInstance(String param1, String param2) {
        M4CompetitionGreenFragment fragment = new M4CompetitionGreenFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_m4_competition_green, container, false);
    }
    @Override
    public void onStart() {
        super.onStart();
        btnBack=getView().findViewById(R.id.btnBackM4CompetitionGreen);
        btnSettings=getView().findViewById(R.id.btnSettingsM4CompetitionGreen);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSeries4Fragment();
            }
        });
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSettingsFragment();
            }
        });
    }
    private void gotoSeries4Fragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new Series4Fragment());
        ft.commit();
    }
    private void gotoSettingsFragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new SettingsFragment());
        ft.commit();
    }
}