package com.sg.xtramile.infrastructure.persistence;

import java.sql.*;

public class DataBase {
    private PreparedStatement stm;
    private ResultSet res;
    private Connection con;
    public DataBase() {
        try {
            con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/xtramilemhs","root","root"); 
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    private void Statement(String query) {
        try {
            stm = con.prepareStatement(query);
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
    public ResultSet ResQ(String query) {
        Statement(query);
        try {
            res = stm.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
        return res;
    }
    public void UpdateQ(String query) {
        System.out.println(query);
        Statement(query);
        try {
            stm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
