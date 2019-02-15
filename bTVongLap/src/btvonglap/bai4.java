/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvonglap;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class bai4 {
    public static void main(String[] args) {
        
        
        double n;
        double max = 0;
        double min = 0;
        do {            
            System.out.println("Nhap n: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextDouble();
            if(max<=n){
               max = n;
            }
            if(min>=n)
            {
                min = n;
            }
        } while(n != 0);
        System.out.println("So lon nha la n: " + max);
        System.out.println("So lon nha la n: " + min);
    }
}
