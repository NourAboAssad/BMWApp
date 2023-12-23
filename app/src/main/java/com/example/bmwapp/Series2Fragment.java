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
 * Use the {@link Series2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Series2Fragment extends Fragment {
    private TextView tvM240i,tvM240iPrice;
    private ImageView ivSeries2,ivM240i;
    private Button btnPColor,btnWColor,btnBColor,btnGColor;
    private ImageView btnBack;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Series2Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Series2Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Series2Fragment newInstance(String param1, String param2) {
        Series2Fragment fragment = new Series2Fragment();
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
        return inflater.inflate(R.layout.fragment_series2, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        ivSeries2=getView().findViewById(R.id.imSeries2Series2);
       ivM240i=getView().findViewById(R.id.ivm240iwSeries2);
        tvM240i=getView().findViewById(R.id.tvM240iSeries2);
        tvM240iPrice=getView().findViewById(R.id.tvM240PraiceSeries2);
        btnWColor=getView().findViewById(R.id.btnWColorSeries2);
        btnPColor=getView().findViewById(R.id.btnPColorSeries2);
        btnBack=getView().findViewById(R.id.btnBackSeries2);
        btnBColor=getView().findViewById(R.id.btnBlackSeries2);
        btnGColor=getView().findViewById(R.id.btnGraySeries2);
        btnBColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoM2competitionBlackFragment();
            }
        });
        btnGColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoM2competitionGrayFragment();

            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSeriesListFragment();
            }
        });
        btnWColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoM240iWhiteFragment();
            }
        });
        btnPColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoM240iPurpleFragment();

            }
        });
    }
    private void gotoM240iWhiteFragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new M240iWhiteFragment());
        ft.commit();
    }
    private void gotoM240iPurpleFragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new M240iPurpleFragment());
        ft.commit();
    }
    private void gotoSeriesListFragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new SeriesListFragment());
        ft.commit();
    }
    private void gotoM2competitionBlackFragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new M2competitionBlackFragment());
        ft.commit();
    }
    private void gotoM2competitionGrayFragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new M2competitionGrayFragment());
        ft.commit();
    }
}