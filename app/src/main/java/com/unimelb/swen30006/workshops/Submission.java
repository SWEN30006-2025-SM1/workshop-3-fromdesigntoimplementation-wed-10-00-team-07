package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Sample private submission class to be replaced by your implementation
class Submission {
    // Return two fake files

    private boolean validity;
    private List<File> files = new ArrayList<>();
    private int attemptNum;

    public Submission(boolean validity, int attemptNum) {
        this.validity = validity;
        this.attemptNum = attemptNum;
        // Copying input list
    }

    public void addFile(File file) {
        files.add(file);
    }

    public File[] includedFiles(){
        Date test = new Date(2025,3,26);
        File[] files = new File[2];
        files[0] = new File(test,"sklfdjsakljf","File 1");
        files[1] = new File(test,"wioajfe","File 2");
        return files;
    }

    public boolean getValidity(){
        return validity;
    }


}
