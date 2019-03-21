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
public class Camera extends Product{
    private boolean hasWifi;

    public Camera(boolean hasWifi, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasWifi = hasWifi;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }
    
    

    public Camera() {
    }
    public void addNew(){
        super.addNew();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap wifi (true là có, false): ");
        this.hasWifi = sc.nextBoolean();
    }
    @Override
    public String toString() {
        return super.toString() +", wifi: " +isHasWifi(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
