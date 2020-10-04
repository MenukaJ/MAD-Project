package com.example.e_channeling;

public class Paient {

    String name;
    String age;
    String email;
    String password;


    public Paient(String name, String age, String email,String password) {

        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;


    }

    public Paient() {

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }




}
