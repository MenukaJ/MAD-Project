package com.example.e_channeling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class admin_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
    }
    public void onButtonClickedLogin(View view) {
        Intent intent = new Intent(this, admin_dashboard.class);
        startActivity(intent);

    }
}