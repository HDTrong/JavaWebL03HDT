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
public class VeTamGiacCan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do cao h: ");
        int h = sc.nextInt();
        for(int i = 0; i<h;i++){
            //in khoảng trắng
            for(int k=0;k<h-i-1;k++)
            {
                System.out.print(" ");
            }
            //in dấu sao
            for(int j = 0; j < 2*i+1;j++){             
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
