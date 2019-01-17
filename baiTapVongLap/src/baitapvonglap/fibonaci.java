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
public class fibonaci {
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0&&n<2){
            System.out.println("f(" +n+ ")= " + 1);
        }
        int f;
        int i = 1;
        f = (n-i) + (n-(i+1));
        System.out.println("f = " +f);
    }
}
