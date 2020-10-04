package com.example.e_channeling;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ChannelDoctorFragment extends Fragment {

    EditText txtdate,txtdoctorNAme,txtreson,txthospital;
    Button btnSave;
    DatabaseReference reff;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_channel_doctor, container, false);
    }

    public void onViewCreated(View view,Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);
        txtdate = (EditText) view.findViewById(R.id.editDate);
        txtdoctorNAme = (EditText)view.findViewById(R.id.editDoctorName);
        txtreson = (EditText)view.findViewById(R.id.editHospital);
        txthospital = (EditText)view.findViewById(R.id.edithos);
        btnSave = (Button)view.findViewById(R.id.BtnAddchannel);
        reff = FirebaseDatabase.getInstance().getReference().child("Channels");

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Channels channels = new Channels();
                channels.setDate(txtdate.getText().toString().trim());
                channels.setDoctorName(txtdoctorNAme.getText().toString().trim());
                channels.setReson(txtreson.getText().toString().trim());
                channels.setHospital(txthospital.getText().toString().trim());
                reff.setValue(channels);





            }
        });
    }
}
