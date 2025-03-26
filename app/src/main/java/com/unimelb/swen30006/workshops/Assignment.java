package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Assignment {

    private String description;
    private Date dueDate;
    private int maxAttempts;
    private String name;
    private List<Submission> submissions = new ArrayList<>();

    public Assignment(String description,Date dueDate, int maxAttempts, String name){
        this.description = description;
        this.dueDate = dueDate;
        this.maxAttempts = maxAttempts;
        this.name = name;
    }

    public void addSubmission(Submission submission) {
        submissions.add(submission);
    }

    public List<Submission> invalidSubmissions(){
        List<Submission> falseSubmissions = new ArrayList<>();
        for (Submission i : submissions){
            if (!i.getValidity()){
                falseSubmissions.add(i);
            }

        }

        return falseSubmissions;

    }

    public List<Submission> validSubmissions(){
        List<Submission> trueSubmissions = new ArrayList<>();
        for (Submission i : submissions){
            if (i.getValidity()){
                trueSubmissions.add(i);
            }

        }

        return trueSubmissions;

    }

}
