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
 * Use the {@link M3CompetitionBlackFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class M3CompetitionBlackFragment extends Fragment {
    private Button btnBack;
    private ImageView btnSettings;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public M3CompetitionBlackFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment M3CompetitionBlackFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static M3CompetitionBlackFragment newInstance(String param1, String param2) {
        M3CompetitionBlackFragment fragment = new M3CompetitionBlackFragment();
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
        return inflater.inflate(R.layout.fragment_m3_competition_black, container, false);
    }
    @Override
    public void onStart() {
        super.onStart();
        btnBack=getView().findViewById(R.id.btnBackM3CompetitionBlack);
        btnSettings=getView().findViewById(R.id.btnSettingsM3CompetitionBlack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSeries3Fragment();
            }
        });
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSettingsFragment();
            }
        });
    }
    private void gotoSeries3Fragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new Series3Fragment());
        ft.commit();
    }
    private void gotoSettingsFragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new SettingsFragment());
        ft.commit();
    }
}