package com.example.e_channeling;

public class Feedback {


    String name;
    String age;
    String DoctorName;
    String feedback;

    public Feedback(String name, String age, String doctorName, String feedback) {

        this.name = name;
        this.age = age;
        DoctorName = doctorName;
        this.feedback = feedback;
    }

    public Feedback() {

    }


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }



    public String getName() {
        return name;
    }



    public String getDoctorName() {
        return DoctorName;
    }

    public String getFeedback() {
        return feedback;
    }



}
