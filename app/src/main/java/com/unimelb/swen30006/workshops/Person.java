package com.unimelb.swen30006.workshops;

import java.util.Date;

abstract class Person {
    private String address;
    private Date DOB;
    private String name;


    public Person(String address, Date DOB, String name){
        this.address = address;
        this.DOB = DOB;
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public Date getDate(){
        return DOB;
    }

    public String getName(){
        return name;
    }
}
