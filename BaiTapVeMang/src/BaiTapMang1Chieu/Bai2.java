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
public class Bai2 {
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
        int max = 0;        
        int min = 0;
        for (int i = 0; i < mang.length; i++) {
            if(max < mang[i]){
                max = mang[i];
            }
            min = mang[0];
            if(min > mang[i]){
                min = mang[i];
            }
            if(mang[i] % 3 == 0){
                System.out.println("Phan tu thu " +i + " = " +mang[i] + " chia het cho 3");
            }
        }
        System.out.println("Phan tu lon nhat: " +max);
        System.out.println("Phan tu nho nhat: " +min);
    
    }
    
}
