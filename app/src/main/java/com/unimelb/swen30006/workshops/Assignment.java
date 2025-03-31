package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Assignment {
    private String description;
    private String name;
    private Date dueDate;
    private int maxAttempts;

    // Constructor
    public Assignment(String description, String name, Date dueDate, int maxAttempts) {
        this.description = description;
        this.name = name;
        this.dueDate = dueDate;
        this.maxAttempts = maxAttempts;
    }



}
