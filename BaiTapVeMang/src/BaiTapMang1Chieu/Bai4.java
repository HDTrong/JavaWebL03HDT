/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapMang1Chieu;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai4 {
    public static void main(String[] args) {
        Random rd = new Random();
        
        int[] mang = new int[15];
        for (int i = 0; i < mang.length; i++) {            
            mang[i] = rd.nextInt(100);
        }
        System.out.println("Các phan tu vua random: ");
        for (int in : mang) {
            System.out.println(" " +in);
        }
        System.out.println("Sap xep tang dan:");
        int temp;
        int demm = 0;
        int demmm = 0;
        for (int i = 0; i < mang.length; i++) {                        
            for (int j = i+1; j < mang.length; j++) {                
                if(mang[i] > mang[j]){
                    temp = mang[i];
                    mang[i] = mang[j];
                    mang[j] = temp;
                }               
            }
            if(mang[i] % 2 == 0){
                demm ++;
            }
            else{
                demmm ++;
            }
        }
        for (int in : mang) {
            System.out.println(" " +in);
        }
        System.out.println("Sap xep giam dan:");
        int tem;
        for (int i = 0; i < mang.length; i++) {                        
            for (int j = i+1; j < mang.length; j++) {                
                if(mang[i] < mang[j]){
                    tem = mang[i];
                    mang[i] = mang[j];
                    mang[j] = tem;
                }
               
            }
        }
        for (int in : mang) {
            System.out.println(" " +in);
        }
        System.out.println("So phan tu chan: " +demm);
        System.out.println("So phan tu le: " +demmm);

    }
}
