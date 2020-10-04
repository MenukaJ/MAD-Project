package com.example.e_channeling;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class PatientFeedback extends Fragment {
    EditText txtName,txtAge,txtDoctorName,txtFeddback;
    Button btnSave;
    DatabaseReference reff;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_patient_feedback, container, false);


    }

    public void onViewCreated(View view,Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);
        txtName = (EditText) view.findViewById(R.id.editfeedbackName);
        txtAge = (EditText)view.findViewById(R.id.edtAge);
        txtDoctorName = (EditText)view.findViewById(R.id.edtDoctorName);
        txtFeddback = (EditText)view.findViewById(R.id.feedback);
        btnSave = (Button)view.findViewById(R.id.BtnAddFeedback);
        reff = FirebaseDatabase.getInstance().getReference().child("Feedback");

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Feedback feedback = new Feedback();
                feedback.setName(txtName.getText().toString().trim());
                feedback.setAge(txtAge.getText().toString().trim());
                feedback.setDoctorName(txtDoctorName.getText().toString().trim());
                feedback.setFeedback(txtFeddback.getText().toString().trim());
                reff.setValue(feedback);





            }
        });
    }




}