/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapMang2Chieu;

import com.sun.xml.internal.ws.api.message.saaj.SAAJFactory;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai1 {
    public static void main(String[] args) {
        int[][] mang = new int[3][3];
        int cot0 = 0, cot1 =0, cot2 = 0, hang0 = 0, hang1 = 0, hang2 = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mang[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " +mang[i][j]);
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i == 0){
                    hang0 += mang[i][j]; 
                }
                if(i == 1){
                    hang1 += mang[i][j]; 
                }
                if(i == 2){
                    hang2 += mang[i][j]; 
                }
                if(j == 0){
                    cot0 += mang[i][j]; 
                }
                if(j == 1){
                    cot1 += mang[i][j]; 
                }
                if(j == 2){
                    cot2 += mang[i][j]; 
                }
            }
        }
        System.out.println(" " +hang0);
        System.out.println(" " +hang1);
        System.out.println(" " +hang2);
        System.out.println(" " +cot0);
        System.out.println(" " +cot1);
        System.out.println(" " +cot2);
    }
}
