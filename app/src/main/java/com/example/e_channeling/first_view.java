package com.example.e_channeling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class first_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_view);
    }

    public void onButtonClickedPatientLogin(View view) {
        Intent intent = new Intent(this, Patient_login.class);
        startActivity(intent);

    }

    public void onButtonClickedDoctorLogin(View view) {
        Intent intent = new Intent(this, doctor_login.class);
        startActivity(intent);

    }

    public void onButtonClickedAdminLogin(View view) {
        Intent intent = new Intent(this, admin_login.class);
        startActivity(intent);

    }
}