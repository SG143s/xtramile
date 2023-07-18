package com.sg.xtramile.domain.model;

import java.time.LocalDate;
import java.time.Period;

import com.fasterxml.jackson.annotation.*;

public class StudentShow {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("age")
    private int age;

    public StudentShow(StudentData data) {
        this.id = data.getID();
        this.name = data.getfname() + " " + data.getlname();
        this.age = Period.between(data.getbDate(), LocalDate.now()).getYears();
    }

    /*@Override
    public String toString() {
        return String.format("StudentShow[id=%s, name=%s, age=%s]", id, name, age);
    }*/
}
