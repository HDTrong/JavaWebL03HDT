/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapMang1Chieu;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mang = new int[5];
        for (int i = 0; i < mang.length; i++) {
            System.out.println("Nhap phan tu thu " +i);
            mang[i] = sc.nextInt();
        }
        System.out.println("Các phan tu vua nhap: ");
        for (int in : mang) {
            System.out.println(" " +in);
        }
        int sum = 0;
        int sumL = 0;
        int sumC = 0;
        for (int i = 0; i < mang.length; i++) {
            sum +=mang[i];
            if(mang[i] % 2 == 1)
            {
                sumL += mang[i];
            }
            if(mang[i] % 2 == 0)
            {
                sumC += mang[i];
            }
        }
        System.out.println("Tong cac phan tu trong mang: " +sum);
        System.out.println("Tong cac phan tu le trong mang: " +sumL);
        System.out.println("Tong cac phan tu chan trong mang: " +sumC);

    }
}
