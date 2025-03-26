package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Driver {

    public static void main(String[] args){
        Date today = new Date(2025,3,26);
        Student student = new Student("123@uni.com","235532","123 drive",today,"Joe");
        Subject subject = new Subject("Computer Science", "CS101");

        Assignment assignment = new Assignment("Programming Project", today, 4,"Super hard assignment");
        subject.addAssignment(assignment);
        File submissionFile = student.submit("adfjklsd","assesment",today);

        // Submission should include a student class for easier grade calc
        Submission submission = new Submission(false,2);
        submission.addFile(submissionFile);


        //Assumption for calc to be included/skipped for simplicity
        Grade grade = new Grade(assignment,submission,46.7);
        student.addGrade(assignment,grade);

        System.out.println(student.getGrade(assignment));













    }
}



