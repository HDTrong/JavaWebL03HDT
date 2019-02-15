/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vonglap2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class hCNR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai m: ");
        int m = sc.nextInt();
        System.out.println("Nhap chieu rong n: ");
        int n = sc.nextInt();
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                //hang 0 va hang m-1
                if(i == 0 || i == m-1)
                    System.out.print("*");
                //cot j = 0 va cot j = n -1
                else if(j == 0 || j == n-1)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
