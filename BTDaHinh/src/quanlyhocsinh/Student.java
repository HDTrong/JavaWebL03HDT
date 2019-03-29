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
public class Student extends Person{
    private String Email;

    public Student() {
    }

    public Student(String Email) {
        this.Email = Email;
    }

    public Student(String Email, String id, String name) {
        super(id, name);
        this.Email = Email;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public void Input(){
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap email: ");
        this.Email = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", email = " +Email; //To change body of generated methods, choose Tools | Templates.
    }
    
}
