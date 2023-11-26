package com.example.bmwapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SeriesListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SeriesListFragment extends Fragment {
    private ListView lvSeriesList;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SeriesListFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SeriesListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SeriesListFragment newInstance(String param1, String param2) {
        SeriesListFragment fragment = new SeriesListFragment();
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
        return inflater.inflate(R.layout.fragment_series_list, container, false);
    }
    @Override
    public void onStart() {
        connectComponents();

        super.onStart();
    }

    private void connectComponents() {
        ListView lvSeriesList= getView().findViewById(R.id.rvSeriesListSeriesListFragment);
        List<String> list=new ArrayList<>();
        list.add("Series2");
        list.add("Series3");
        list.add("Series4");
        ArrayAdapter arrayAdapter=new ArrayAdapter(getActivity().getApplicationContext(), android.R.layout.simple_list_item_1,list);
        lvSeriesList.setAdapter(arrayAdapter);
        lvSeriesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    //series2
                    gotoSeries2Fragment();
                }
                else if (position==1){
                    //series3
                    gotoSeries3Fragment();
                }
                else if (position==2){
                    //series4
                    gotoSeries4Fragment();
                }
                else if (position==3){
                    //series4
                }
            }
        });
    }
    private void gotoSeries2Fragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new Series2Fragment());
        ft.commit();
    }
    private void gotoSeries3Fragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new Series3Fragment());
        ft.commit();
    }
    private void gotoSeries4Fragment() {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutMain,new Series4Fragment());
        ft.commit();
    }
}