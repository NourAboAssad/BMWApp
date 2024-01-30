package com.example.bmwapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Series4Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Series4Fragment extends Fragment {
    private Button btnCSlGrayColor,btnCSlWhiteColor,btnComGreenColor,btnComYellowColor;
    private ImageView btnBack;
    private ImageView btnSettings;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Series4Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Series4Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Series4Fragment newInstance(String param1, String param2) {
        Series4Fragment fragment = new Series4Fragment();
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
        return inflater.inflate(R.layout.fragment_series4, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        btnComYellowColor=getView().findViewById(R.id.btnComYellowSeries4);
        btnComGreenColor=getView().findViewById(R.id.btnComGreenSeries4);
        btnCSlGrayColor=getView().findViewById(R.id.btnCSlGraySeries4);
        btnCSlWhiteColor=getView().findViewById(R.id.btnCSlWhiteSeries4);
        btnBack=getView().findViewById(R.id.btnBackSeries4);
        btnSettings=getView().findViewById(R.id.btnSettingsSeries4);
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSettingsFragment();
            }
        });
        btnCSlGrayColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoM4CslGrayFragment();
            }
        });
        btnCSlWhiteColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoM4CslWhiteFragment();
            }
        });
        btnComYellowColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoM4CompetitionYellowFragment();
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSeriesListFragment();
            }
        });
        btnComGreenColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoM4CompetitionGreenFragment();
            }
        });

    }
    private void gotoM4CslGrayFragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new M4CslGrayFragment());
        ft.commit();
    }
    private void gotoM4CslWhiteFragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new M4CslWhiteFragment());
        ft.commit();
    }
    private void gotoSeriesListFragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new SeriesListFragment());
        ft.commit();
    }
    private void gotoM4CompetitionYellowFragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new M4CompetitionYellowFragment());
        ft.commit();
    }
    private void gotoM4CompetitionGreenFragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new M4CompetitionGreenFragment());
        ft.commit();
    }
    private void gotoSettingsFragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new SettingsFragment());
        ft.commit();
    }
}