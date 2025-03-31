package com.unimelb.swen30006.workshops;

import java.util.ArrayList;

public class Subject {
    private String name;
    private String subjectCode;
    private ArrayList<Assignment> assignments;

    public Subject(String name, String subjectCode, ArrayList<Assignment> assignments) {
        this.name = name;
        this.subjectCode = subjectCode;
        this.assignments = assignments;
    }
}