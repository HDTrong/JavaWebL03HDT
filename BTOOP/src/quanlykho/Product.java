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
public class Product {
    protected int id;
    protected String name;
    protected double price;
    protected int quantity;

    public Product() {
    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public void addNew(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        this.id = sc.nextInt();
        System.out.println("Nhập name: ");
        sc.nextLine();
        this.name = sc.nextLine();
        System.out.println("Nhập price: ");
        this.price= sc.nextDouble();
        System.out.println("Nhập quantity: ");
        this.quantity = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + '}';
    }
    
}
