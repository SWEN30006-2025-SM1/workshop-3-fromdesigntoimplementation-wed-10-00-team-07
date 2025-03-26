package com.unimelb.swen30006.workshops;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

class Student extends Person{

    private String email;
    private String studentID;
    private Map<Assignment, Grade> assignmentGrades = new HashMap<>();


    public Student(String email, String studentID, String address, Date DOB, String name){
        super(address,DOB,name);
        this.email = email;
        this.studentID = studentID;
    }

    public void sendEmailMsg(String message) {
        System.out.println("Email of :"+message+"\nhas been sent");

    }

    public double getGrade(Assignment assignment) {
        Grade grade = assignmentGrades.get(assignment);
        return grade.getGradesPerStage();
    }

    public void addGrade(Assignment assignment, Grade grade) {
        if (assignment != null && grade != null) {
            assignmentGrades.put(assignment, grade);
        }
    }

    public File submit(String data, String fileName, Date createdDate){
        File returnFile = new File(createdDate,data,fileName);
        //Creates a file, return it and feed file and student into a submission class

        return returnFile;



    }


}
