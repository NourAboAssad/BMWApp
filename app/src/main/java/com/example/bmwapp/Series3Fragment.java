package com.example.bmwapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Series3Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Series3Fragment extends Fragment {

    private Button btnCSGreenColor,btnCSGrayColor,btnComGreenColor,btnComBlackColor;
    private ImageView btnBack;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Series3Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Series3Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Series3Fragment newInstance(String param1, String param2) {
        Series3Fragment fragment = new Series3Fragment();
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
        return inflater.inflate(R.layout.fragment_series3, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        btnComBlackColor=getView().findViewById(R.id.btnComBlackSeries3);
        btnComGreenColor=getView().findViewById(R.id.btnComGreenSeries3);
        btnCSGrayColor=getView().findViewById(R.id.btnCSGraySeries3);
        btnCSGreenColor=getView().findViewById(R.id.btnCSGreenSeries3);
        btnBack=getView().findViewById(R.id.btnBackSeries3);
        btnCSGreenColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoM3CSGreenFragment();
            }
        });
        btnCSGrayColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoM3CSGrayFragment();
            }
        });
        btnComBlackColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoM3CompetitionBlackFragment();
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
                gotoM3CompetitionGreenFragment();
            }
        });

    }
    private void gotoM3CompetitionBlackFragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new M3CompetitionBlackFragment());
        ft.commit();
    }
    private void gotoM3CompetitionGreenFragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new M3CompetitionGreenFragment());
        ft.commit();
    }
    private void gotoSeriesListFragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new SeriesListFragment());
        ft.commit();
    }
    private void gotoM3CSGrayFragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new M3CSGrayFragment());
        ft.commit();
    }
    private void gotoM3CSGreenFragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new M3CSGreenFragment());
        ft.commit();
    }
}