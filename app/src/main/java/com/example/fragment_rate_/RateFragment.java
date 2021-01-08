package com.example.fragment_rate_;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.Toast;


public class RateFragment extends Fragment {
    private RatingBar ratingBar;


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public RateFragment() {
    }


    public static RateFragment newInstance(String param1, String param2) {
        RateFragment fragment = new RateFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        Log.d(Constants.LOG_TAG, RateFragment.class.getName() + " New instance created");
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            Log.d(Constants.LOG_TAG, RateFragment.class.getName() + " is onCreate");
        }

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_rate, container, false);

        ratingBar = rootView.findViewById(R.id.rating);
        Log.d(Constants.LOG_TAG, RateFragment.class.getName() + " is onCreateView");
        return rootView;
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d(Constants.LOG_TAG, RateFragment.class.getName() + " is onViewStateRestored");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(Constants.LOG_TAG, RateFragment.class.getName() + " is onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(Constants.LOG_TAG, RateFragment.class.getName() + " is onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(Constants.LOG_TAG, RateFragment.class.getName() + " is onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(Constants.LOG_TAG, RateFragment.class.getName() + " is onStop");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(Constants.LOG_TAG, RateFragment.class.getName() + " is onSaveInstanceState");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(Constants.LOG_TAG, RateFragment.class.getName() + " is onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(Constants.LOG_TAG, RateFragment.class.getName() + " is onDestroy");
    }
}