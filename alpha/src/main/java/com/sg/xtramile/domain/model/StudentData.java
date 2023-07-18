package com.sg.xtramile.domain.model;

import java.time.LocalDate;

public class StudentData {
    private String id;
    private String fname;
    private String lname;
    private LocalDate birthdate;

    public StudentData(String id, String fname, String lname, LocalDate birthdate) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.birthdate = birthdate;
    }

    public String getID() {
        return this.id;
    }
    public String getfname() {
        return this.fname;
    }
    public String getlname() {
        return this.lname;
    }
    public LocalDate getbDate() {
        return this.birthdate;
    }
}
