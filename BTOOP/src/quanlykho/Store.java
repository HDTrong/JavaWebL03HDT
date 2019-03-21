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
public class Store {
    //private static final int MAX_PRODUC = 20;
    private Product[] products;
    private int dem;
    //public Store(Product[] products, int dem) {
        //this.products = new Product[MAX_PRODUC];
       // this.dem = 0;
    //}

    public Store() {
    }

    public Store(Product[] products) {
        this.products = products;
    }
    
    
    public void addProduct(){
        Product p;
        SmartPhone sm = new SmartPhone();
        Camera cm = new Camera();
        System.out.println("Bạn muốn nhập sản phẩm về Camera hay SmartPhone:");
        System.out.println("Chọn 1: SmartPhone:");
        System.out.println("Chọn 2: Camera:");
        Scanner sc = new Scanner(System.in);
        int add = sc.nextInt();
        if(add == 1){
            p = new SmartPhone();
            
        }
        else{
            p = new Camera();
        }
        p.addNew();
        if(dem >= products.length){
            System.out.println("Ban khong the them product");
            return;
        }
        products[dem] = p;
        dem++;
    }
    void listProduct(){
        System.out.println("=====Danh Sach=====");
        for(Product p: products){
            if(p == null)
                break;
            System.out.println(p);
        }
    }
    
    void search(String name){
        for(Product p : products){
            if(p == null)
                break;
            if(p.name.equals(name)){
                System.out.println(p);
                return ;
            }
        }
        System.out.println("Khong tim thay");
    }
    
    
    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    

}
