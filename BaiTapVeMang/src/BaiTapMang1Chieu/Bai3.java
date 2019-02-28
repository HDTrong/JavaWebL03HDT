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
public class Bai3 {
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
        System.out.println("Nhap so nguyen a = ");
        int a = sc.nextInt();
        int temp = 0;
        for (int i = 0; i < mang.length; i++) {
            if( a == mang[i]){
                temp ++;
                System.out.println("Phan tu a = " +a+ " xuat hien trong mang(lan " +temp+ ")");
                System.out.println("Vi tri: i = " +i+ " = " +mang[i]);
            }
        }
        if(temp == 0){
            System.out.println("Phan tu a = " +a+ " khong xuat hien trong mang");
        }
    }
    
}
