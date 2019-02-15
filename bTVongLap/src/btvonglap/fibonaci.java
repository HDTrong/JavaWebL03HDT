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
public class fibonaci {
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int fn;
        int f1 = 1;
        int f2 = 1;
        if(n==0)
        {
            fn = 0;
        }
        else if(n<=2&&n>0)
        {
            fn = 1;
        }
        else
        {
            for(i=3;i<=n;i++)
            {
                fn = f1 + f2;
                f2 = f1;
                f1 = fn;
            }
        }
    }
}
