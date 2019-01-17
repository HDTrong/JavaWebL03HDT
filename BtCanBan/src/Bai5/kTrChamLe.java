/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.Scanner;

/**
 *
 * @author Trong_Bin
 */
public class kTrChamLe {
    public static void main(String[] args) {
        System.out.println("Nhap vao so nguyen a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        /*if(a%2 == 0)
        {
        System.out.println("a la so chan");
        }
        else
        {
        System.out.println("a la so le");
        }*/
        String name = (a%2== 0) ? "a la so chan" : "a la so le";
        System.out.println(" " + name);
    }
    
}
