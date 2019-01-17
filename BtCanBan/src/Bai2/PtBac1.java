/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author Trong_Bin
 */
public class PtBac1 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so thuc a: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.println("nhap vao so thuc b: ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("nhap vao so thuc c: ");
        double c = sc.nextDouble();
        sc.nextLine();
        if(a == 0)
        {
            System.out.println("Phuong trinh vo nghiem");
        }
        else
        {
            double d;
            d = (c-b)/a;
            System.out.println("Phuong trinh co nghiem x = " + d);
        }
        
    }
    
}
