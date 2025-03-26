package com.unimelb.swen30006.workshops;

import java.util.Date;

class Staff extends Person{
    private String[] roles;
    private String staffID;

    public Staff(String[] roles, String staffID, String address, Date DOB, String name){
        super(address,DOB,name);
        this.roles = roles;
        this.staffID = staffID;
    }

    public String[] getRoles(){
        return roles;
    }

    public String staffID(){
        return staffID;
    }
}
