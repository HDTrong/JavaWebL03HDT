/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Scanner;
import sun.security.util.Length;

/**
 *
 * @author PC
 */
public class testMang2chieu {
    public static void main(String[] args) {
        int[][] mang2Chieu = new int[2][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Nhap phan tu thu ["+i+"]["+j+"]");
                mang2Chieu[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("   "+mang2Chieu[i][j]);
            }
            System.out.println("");
        }
        
    }
}
