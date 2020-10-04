package com.example.e_channeling;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.e_channeling.model.Schedule;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


import java.util.Calendar;

public class AddScheduleFragment extends Fragment {

    EditText form;
    EditText to;
    EditText date;
    Button submit;
    Spinner category;
    Spinner hospital;
   // DatabaseReference rootRef, demoRef;
   DatabaseReference reff;



    EditText edittext;


    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_add_schedule, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
//        rootRef = FirebaseDatabase.getInstance().getReference();
//        demoRef = rootRef.child("Schedule");


        date =(EditText)view.findViewById(R.id.editTextDate3);
        submit = (Button) view.findViewById(R.id.save);
        category = (Spinner) view.findViewById(R.id.spinner1);
        hospital = (Spinner) view.findViewById(R.id.spinner2);
        form = (EditText)view.findViewById(R.id.editTextTime);
        to = (EditText)view.findViewById(R.id.editTextTime2);


        reff = FirebaseDatabase.getInstance().getReference().child("Schedule");
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String fromTime = form.getText().toString();
                String toTime = to.getText().toString();
                String hos = hospital.getSelectedItem().toString();
                String cat = category.getSelectedItem().toString();
                String dates = date.getText().toString();

                Schedule schedule = new Schedule();
                schedule.setDate(dates);
                schedule.setCategory(cat);
                schedule.setFrom(fromTime);
                schedule.setTo(toTime);
                schedule.setHospital(hos);

                reff.setValue(schedule);
             //   demoRef.push().setValue(schedule);
//                        .addOnSuccessListener(new OnSuccessListener<Void>() {
//                    @Override
//                    public void onSuccess(Void aVoid) {
//                        System.out.println("Succsess");
//                    }
//                }).addOnFailureListener(new OnFailureListener() {
//                    @Override
//                    public void onFailure(@NonNull Exception e) {
//                        System.out.println("fail");
//                    }
//                });
            }
        });
        edittext = (EditText)view.findViewById(R.id.editTextDate3);
        edittext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showDatePicker();
            }
        });

    }

    private void showDatePicker() {
        DatePickerFragment date = new DatePickerFragment();
        /**
         * Set Up Current Date Into dialog
         */
        Calendar calender = Calendar.getInstance();
        Bundle args = new Bundle();
        args.putInt("year", calender.get(Calendar.YEAR));
        args.putInt("month", calender.get(Calendar.MONTH));
        args.putInt("day", calender.get(Calendar.DAY_OF_MONTH));
        date.setArguments(args);
        /**
         * Set Call back to capture selected date
         */
        date.setCallBack(ondate);
        date.show(getFragmentManager(), "Date Picker");
    }

    DatePickerDialog.OnDateSetListener ondate = new DatePickerDialog.OnDateSetListener() {

        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            edittext.setText(String.valueOf(dayOfMonth) + "-" + String.valueOf(monthOfYear+1)
                    + "-" + String.valueOf(year));
        }
    };
}
