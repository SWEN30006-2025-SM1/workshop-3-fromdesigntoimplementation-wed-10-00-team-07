package com.unimelb.swen30006.workshops;

public class Grade {
    private Assignment assignment;
    private Submission submission;
    private double gradesPerStage;


    public Grade(Assignment assignment, Submission submission,double gradesPerStage) {
        this.submission = submission;
        this.assignment = assignment;
        this.gradesPerStage = gradesPerStage;
    }

    public double getGradesPerStage(){
        return gradesPerStage;
    }
}
