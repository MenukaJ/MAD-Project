package com.example.e_channeling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Patient_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_login);
    }

    public void onButtonClickedLogin(View view) {
        Intent intent = new Intent(this, patient_dashboard.class);
        startActivity(intent);

    }

    public void onButtonClickedRegister(View view) {
        Intent intent = new Intent(this, PeatientSignup_form.class);
        startActivity(intent);

    }
}