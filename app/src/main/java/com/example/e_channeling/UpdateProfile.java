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
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;


public class UpdateProfile extends Fragment {

    TextView a,b,c,d;
    Button btn;
    DatabaseReference reff;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_update_profile, container, false);
    }
    public void onViewCreated(View view,Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);
        a = (EditText)view.findViewById(R.id.editfeedbackName);
        b = (EditText)view.findViewById(R.id.edtAgeget);
        c = (EditText)view.findViewById(R.id.editEmailget);
        btn = (Button)view.findViewById(R.id.btnshow);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reff = FirebaseDatabase.getInstance().getReference().child("Paient").child("MImq8NAGEiqPSJLTO8U");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String name=  snapshot.child("name").getValue().toString();
                        String age=  snapshot.child("age").getValue().toString();
                        String email=  snapshot.child("email").getValue().toString();
                        a.setText(name);
                        a.setText(age);
                        a.setText(email);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {
                        System.out.println("The read failed: " + error.getCode());

                    }
                });
            }
        });
    }


}