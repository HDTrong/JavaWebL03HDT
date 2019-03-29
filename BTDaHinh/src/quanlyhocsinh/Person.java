/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyhocsinh;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Person {
    protected String id;
    protected String name;

    public Person() {
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id: ");
        id = sc.nextLine();
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
    }

    @Override
    public String toString() {
        return "id = " + id + ", name = " + name;
        }
    }
