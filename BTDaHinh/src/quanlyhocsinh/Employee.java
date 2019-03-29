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
public class Employee extends Person{
    private String Salary;

    public Employee(String Salary) {
        this.Salary = Salary;
    }

    public Employee(String Salary, String id, String name) {
        super(id, name);
        this.Salary = Salary;
    }

    public Employee() {
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }
    public void Input(){
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap salary: ");
        this.Salary = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + " salary = " +Salary; //To change body of generated methods, choose Tools | Templates.
    }
    
}
