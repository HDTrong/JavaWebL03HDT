/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Scanner scanner = new Scanner(System.in);
        CustomerManager cm = new CustomerManager();
        while (true) {            
            System.out.println("Nhap vao lua chon cua ban: ");
            System.out.println("1.Load: ");
            System.out.println("2.Add: ");
            System.out.println("3.Search: ");
            System.out.println("4.Save: ");
            System.out.println("5.Edit: ");
            System.out.print("Choose ? ");
            int chon = Integer.parseInt(scanner.nextLine());
            switch(chon){
                case 1:
                    System.out.print("File Path > ");
                    String path = scanner.nextLine();
                    if(cm.load(path)){
                        System.out.println("Successful");
                    }
                    else{
                        System.out.println("Error");
                    }
                    break;
                case 2:
                    cm.add();
                    break;
                case 3:
                    if(cm.save()){
                        System.out.println("Successful");
                    }
                    else{
                        System.out.println("Error");
                    }
                    break;
                case 4:
                    System.out.print("Id > ");
                    int id = Integer.parseInt(scanner.nextLine());
                    Customer customer = cm.search(id);
                    if(customer != null){
                        System.out.println(customer);
                    }
                    else{
                        System.out.println("Not found");
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Not vaid");
            }
        }
    }
}
