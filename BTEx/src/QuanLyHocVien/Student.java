/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyHocVien;

/**
 *
 * @author PC
 */
public class Student {
    protected String id;
    protected String name;
    protected double mark;
    protected int Group;
    protected String Phone;

    public Student() {
    }

    public Student(String id, String name, double mark, int Group, String Phone) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.Group = Group;
        this.Phone = Phone;
    }

    public Student(String id, String name, double mark, String Phone) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.Phone = Phone;
        this.calGroup();
    }
    private void calGroup(){
        if(mark >= 8)
            this.Group = 1;
        else if(mark >= 6)
            this.Group = 2;
        else if (mark >= 4) {
            this.Group = 3;
        }
        else 
            this.Group = 4;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", mark=" + mark + ", Group=" + Group + ", Phone=" + Phone + '}';
    }
    
    
    
}
