/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.db;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class insert {
    Connection conn;

    public insert() throws ClassNotFoundException, SQLException {
        DBConnector db = new DBConnector();
        this.conn = db.getConnect();
    }
}
