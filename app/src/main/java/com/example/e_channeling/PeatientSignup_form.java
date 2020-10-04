package com.example.e_channeling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PeatientSignup_form extends AppCompatActivity {
    EditText txtName,txtAge,txtemail,txtPassword;
    Button btnSave;
    DatabaseReference reff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peatient_signup_form);

        txtName = (EditText) findViewById(R.id.editpaientNAme);
        txtAge = (EditText)findViewById(R.id.editPatientAge);
        txtemail = (EditText)findViewById(R.id.editEmail);
        txtPassword = (EditText)findViewById(R.id.password);
        btnSave = (Button)findViewById(R.id.btnAddPacient);
        reff = FirebaseDatabase.getInstance().getReference().child("Paient");

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Paient paient = new Paient();
                paient.setName(txtName.getText().toString().trim());
                paient.setAge(txtAge.getText().toString().trim());
                paient.setEmail(txtemail.getText().toString().trim());
                paient.setPassword(txtPassword.getText().toString().trim());
                reff.push().setValue(paient);





            }
        });


    }


}