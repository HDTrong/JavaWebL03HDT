/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvonglap;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class sinx {
    public static void main(String[] args) {
        System.out.println("Nhap goc: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(); //đơn vị là độ
        //đổi đơn vị sang rad
        double xRad = x * Math.PI / 180;
        
        int n = 10;
        double sinx = 0;
        for( int i = 0; i<n;i++){
            //(-1)^n.x^(2n+1)/(2n+1);
            sinx += Math.pow(-1, i)* (Math.pow(xRad, 2*i +1) / factori(2*i +1));
        }
        System.out.println("sin(" +x+ ") = " +sinx);
    } 
    public static int factori(int n){
        if(n == 0 || n == 1) return 1;
        return n*factori(n-1);
        }
}

