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
public class soDoiXung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhap n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sNew = 0;
        int pDu;
        int tThe;
        tThe = n;
        while(tThe != 0)
           {
            pDu = tThe % 10;
            sNew = sNew*10 + pDu;
            tThe /= 10;
            } 
        if(sNew == n) 
            System.out.println(n+ " La so doi xung");
        else
            System.out.println(n+ " Khong la so doi xung");
    }
}