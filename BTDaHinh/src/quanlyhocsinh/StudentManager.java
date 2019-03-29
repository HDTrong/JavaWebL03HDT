/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyhocsinh;

/**
 *
 * @author PC
 */
public class StudentManager extends Manager{
    //public final static int max = 20;
    public Person[] person;
    private int dem;

    public StudentManager() {
    }

    public StudentManager(Person[] person) {
        this.person = person;
    }

    
    
    @Override
    void add() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        Student st = new Student();
        st.Input();
        if(dem >= person.length){
            System.out.println("Ban khong the them vi danh sach da day");
            return;
        }
        person[dem] = st;
        dem++;
    }

    @Override
    void show() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("=====Danh Sach=====");
        for (Person st : person) {
            if(st == null){
                System.out.println("Danh sach trong: ");
                break;
            }
            else{
                System.out.println(st);
            }
            
        }
    
    
    }

    @Override
    void search(String name) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (Person st : person) {
            if(st == null){
                break;
            }
            if(st.name.equals(name)){
                System.out.println(st);
                break;
            }
            else{
                System.out.println("Khong tim thay");
            }
        }
        
    }
    
}
