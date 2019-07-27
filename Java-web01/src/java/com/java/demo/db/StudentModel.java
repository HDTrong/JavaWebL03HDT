/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class StudentModel {
    Connection conn;

    public StudentModel() throws ClassNotFoundException, SQLException {
        ketnoi db = new ketnoi();
        this.conn = db.getConnect();
    }
    public List<Student> getStudents() throws ClassNotFoundException, SQLException {
        // 1 . ket noi db
        // 2 . tao cau truy van query
        String query =  "SELECT * FROM testhello";
        // 3 . thuc thi cau truy van query
        Statement stmt = this.conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        // 4 . duyet ket qua va add vao list
        List<Student> list = new ArrayList<>();
        while (rs.next()) {
            Student q = new Student();
            q.setMa(rs.getString("Ma"));
            q.setName(rs.getString("Ten"));
            q.setDiaChi(rs.getString("DiaChi"));
            list.add(q);
        }
        return list;
    }
}
