package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Date;

class Subject {
    private String name;
    private String subjectCode;
    private ArrayList<Assignment> assignments = new ArrayList<>();

    public Subject(String name, String subjectCode){
        this.name = name;
        this.subjectCode = subjectCode;
    }

    public String getName(){
        return name;
    }

    public String getCode(){
        return subjectCode;
    }

    public void addAssignment(Assignment assignment) {
        if (assignment != null) {
            assignments.add(assignment);
        }
    }


    public Assignment createAssignment(String name, String description, Date dueDate,int attempts) {
        Assignment newAssignment = new Assignment(description,dueDate,attempts,name);
        assignments.add(newAssignment);
        return newAssignment;
    }
}
