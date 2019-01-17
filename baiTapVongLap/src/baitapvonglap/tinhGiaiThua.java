/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapvonglap;

import java.util.Scanner;

/**
 *
 * @author PC
 */

   public class tinhGiaiThua {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int giaithua = 1;  
        for(int i=1;i<=n;i++){  
            giaithua=giaithua*i;
        }
        System.out.println("Giai thua cua " + n + " = " + giaithua);
    }
}