package com.sg.xtramile.infrastructure.persistence;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.time.LocalDate;

import org.springframework.stereotype.Repository;

import com.sg.xtramile.domain.model.StudentData;
import com.sg.xtramile.domain.model.StudentShow;
import com.sg.xtramile.domain.repository.StudentRepo;

@Repository
public class StudentRepoImp implements StudentRepo {
    private DataBase db = new DataBase();
    public StudentRepoImp() {
        
    }
    public List<StudentShow> showall() {
        List<StudentShow> data = new ArrayList<StudentShow>();
        ResultSet res = db.ResQ("SELECT * FROM mhsdata");
        try {
            while (res.next()) {
                StudentData temp = new StudentData(res.getString(1), res.getString(2), res.getString(3), LocalDate.parse(res.getString(4)));
                StudentShow shtemp = new StudentShow(temp);
                data.add(shtemp);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return data;
    }
    public void add(StudentData data) {

    }
    public void edit(String id, StudentData data) {

    }
    public void delete(String id) {

    }
}
