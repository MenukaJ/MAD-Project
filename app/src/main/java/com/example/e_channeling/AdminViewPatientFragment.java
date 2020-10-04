package com.example.e_channeling;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AdminViewPatientFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AdminViewPatientFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_admin_view_patient, container, false);
    }
}