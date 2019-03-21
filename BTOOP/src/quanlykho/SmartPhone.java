/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykho;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class SmartPhone extends Product{
    private Boolean hasCamera;
    private int sim;

    public SmartPhone() {
    }

    public SmartPhone(Boolean hasCamera, int sim, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasCamera = hasCamera;
        this.sim = sim;
    }

    public Boolean getHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(Boolean hasCamera) {
        this.hasCamera = hasCamera;
        
    }

    public int getSim() {
        return sim;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }
    
    public void addNew(){
        super.addNew();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap camera (true là có, false):");
        this.hasCamera = sc.nextBoolean();
        System.out.println("Nhập sim: ");
        this.sim = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() +", camera: " +getHasCamera() + ", sim: " +getSim(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
