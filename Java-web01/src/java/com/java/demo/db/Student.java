/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.db;

/**
 *
 * @author PC
 */
public class Student {
    String ma;
    String name;
    String diaChi;

    public Student() {
    }

    public Student(String ma, String name, String diaChi) {
        this.ma = ma;
        this.name = name;
        this.diaChi = diaChi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Student{" + "ma=" + ma + ", name=" + name + ", diaChi=" + diaChi + '}';
    }
    
    
}
