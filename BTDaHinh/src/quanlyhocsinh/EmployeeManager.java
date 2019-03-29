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
public class EmployeeManager extends Manager{

    public Person[] person;
    private int dem;

    public EmployeeManager() {
    }

    public EmployeeManager(Person[] person) {
        this.person = person;
    }

    

    
    
    @Override
    void add() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Employee e = new Employee();
        e.Input();
        if(dem >= person.length){
            System.out.println("Ban khong the them vi danh sach da day");
            return;
        }
        person[dem] = e;
        dem++;
    }

    @Override
    void show() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("=====Danh Sach=====");
        for (Person e : person) {
            if(e == null){
                System.out.println("Danh sach trong: ");
                break;
            }
            else{
                System.out.println(e);
            }
            
        }
    
    
    }

    @Override
    void search(String name) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (Person e : person) {
            if(e == null){
                break;
            }
            if(e.name.equals(name)){
                System.out.println(e);
                break;
            }
            else{
                System.out.println("Khong tim thay");
            }
        }
        
    }
    
}
