/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapMang2Chieu;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai2 {
    public static void main(String[] args) {
        int[][] maTran1 = new int[3][3];
        int[][] maTran2 = new int[3][3];
        int[][] maTran3 = new int[3][3];
        int[][] maTran4 = new int[3][3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                maTran1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                maTran2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                maTran3[i][j] = maTran1[i][j] + maTran2[i][j];
                
            }
            
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " +maTran1[i][j]);
            }
            System.out.println("");
        
    }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " +maTran2[i][j]);
            }
            System.out.println("");
        
    }
        System.out.println("Tong 2 ma tran");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " +maTran3[i][j]);
            }
            System.out.println("");
        
    }
        for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    maTran4[i][j] = 0;
                    for (int k = 0; k < 3; k++) {
                        maTran4[i][j] = maTran4[i][j] + maTran1[i][k] * maTran2[k][j];
                    }
                }
            }
        System.out.println("Tich 2 ma tran:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " +maTran4[i][j]);
            }
            System.out.println("");
            
}
}
}
