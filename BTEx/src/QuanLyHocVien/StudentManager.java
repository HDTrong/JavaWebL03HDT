/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyHocVien;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class StudentManager{
    private static final int Max = 10;
    private Student[] students;   
    private int dem;
    
    public StudentManager() {
        this.students = new Student[Max];
        this.dem = 0;
    }

    
    
    public void add(){
        Input input = new Input();
        System.out.println("Id: ");
        String id = input.inputID();
        System.out.println("Name: ");
        String name = input.inputName();
        System.out.println("Điểm tổng kết: "); 
        double mark = input.inputDTK();
        System.out.println("Phone: ");
        String phone = input.inputPhone();
        
        Student s = new Student(id, name, mark, phone);
        this.students[this.dem] = s;
        this.dem++;
    }
    
    public void HienThi(){
        System.out.println("+++ Danh Sach +++");
        if(students == null){
            System.out.println("Danh sách rỗng");
        }
        for (int i = 0; i < this.dem; i++) {
            System.out.println(this.students[i]);            
        }       
    }
    
    public void showTop(int num) {
        Student[] arr = this.getOrderList();
        System.out.printf("----TOP %d----\n", num);
        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }
    }

    private Student[] getOrderList() {
        Student[] arr = this.students;
        for (int i = 0; i < this.dem - 1; i++) {
            for (int j = i + 1; j < this.dem; j++) {
                if (arr[i].mark < arr[j].mark) {
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }   
        }
        return arr;
    }
}
