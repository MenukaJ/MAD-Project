package com.example.e_channeling;

public class Channels {


    String doctorName;
    String hospital;
    String reson;
    String date;

    public Channels(String doctorName, String hospital, String reson, String date) {
        this.doctorName = doctorName;
        this.hospital = hospital;
        this.reson = reson;
        this.date = date;
    }

    public Channels() {
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getReson() {
        return reson;
    }

    public void setReson(String reson) {
        this.reson = reson;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
