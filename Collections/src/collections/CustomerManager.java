/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import com.sun.org.apache.bcel.internal.generic.F2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class CustomerManager {
    ArrayList<Customer> list = new ArrayList<>();
    public boolean load(String file) throws IOException, ClassNotFoundException{
        try {
            ObjectInputStream fiStream = new ObjectInputStream(new FileInputStream(file));
            list = (ArrayList<collections.Customer>) fiStream.readObject();
            fiStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CustomerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }
    
    public void add(){
        //1.Nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        Customer cus = new Customer();
        System.out.print("ID > ");
        cus.setId(Integer.parseInt(sc.nextLine()));
        System.out.print("Name > ");
        cus.setName(sc.nextLine());
        System.out.print("Address > ");
        cus.setAddress(sc.nextLine());
        System.out.print("Age > ");
        cus.setAeg(Integer.parseInt(sc.nextLine()));
        //2. Thêm dữ liệu vào trong list
        this.list.add(cus);
        
    }
    
    public Customer search(int id){
        
        for (Customer list1 : list) {
            if(list1.getId() == id){
                return list1;
            }
        }
        
        return null;
    }
    
    public boolean save(){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream(
                            new File("D:\\Java\\JAVA_L03_ACT\\Collections\\co.dat")));
            oos.close();
        } catch (Exception e) {
        }
        return true;
    }
}
