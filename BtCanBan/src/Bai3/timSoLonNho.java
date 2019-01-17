/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

import java.util.Scanner;

/**
 *
 * @author Trong_Bin
 */
public class timSoLonNho {
    public static void main(String[] args) {
        System.out.println("Nhap vao so a: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap vao so b: ");
        double b = sc.nextDouble();
        sc.nextLine();
        /*if(a>b)
        {
        System.out.println("a > b");
        }
        else
        {
        System.out.println("a < b");
        }*/
        String name = (a > b) ? "a>b" :"a<b";
        System.out.println(" " +name);
    }
    
}
