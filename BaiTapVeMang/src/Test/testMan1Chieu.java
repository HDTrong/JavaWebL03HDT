/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class testMan1Chieu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner np = new Scanner(System.in);
        int[] mang = new int[5];
        for (int i = 0; i < mang.length; i++) {
            System.out.println("Nhap gia tri phan tu thu " + i);
            mang[i] = np.nextInt();
        }
        //In phần tử trong mảng dạng for - each
        for (int sc : mang) {
            System.out.println("gia tri " + sc);
        }
        //In phần tử trong mảng dạng for thông thường
        for (int i = 0; i < mang.length; i++) {
            System.out.println("gia tri phan tu thu " + i + " = " + mang[i]);

        }
    }
}
