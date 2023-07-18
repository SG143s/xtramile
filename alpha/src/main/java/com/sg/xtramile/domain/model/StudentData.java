package com.sg.xtramile.domain.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentData {
    @JsonProperty("id")
    private String id;
    @JsonProperty("fname")
    private String fname;
    @JsonProperty("lname")
    private String lname;
    @JsonProperty("birthdate")
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
