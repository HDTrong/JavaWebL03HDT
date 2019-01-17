/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author Trong_Bin
 */
public class DoiGiaTriavb {
    public static void main(String[] args) {
        System.out.println("Nhap vao so thuc a: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        
        sc.nextLine();
        System.out.println("Nhap vao so thuc b: ");
        double b = sc.nextDouble();
        sc.nextLine();
        double temp;
        /*temp = a;
        a = b;
        b = temp;
        System.out.println("a = " +a + ", " + "b = " +b);*/
        a = a+b;
        b = a-b;
        a = a-b;
        
        System.out.println("a = " + a + ", " + "b = " +b);
    }
    
}
