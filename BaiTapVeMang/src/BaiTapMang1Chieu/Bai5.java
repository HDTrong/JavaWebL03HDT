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
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float[] mang1 = new Float[3];
        Float[] mang2 = new Float[3];
        for (int i = 0; i < mang1.length; i++) {            
            mang1[i] = sc.nextFloat();
        }
        System.out.println("Toa do cua Vecter 1: ");
        for (float in : mang1) {
            System.out.println(" " +in);
        }
        for (int j = 0; j < mang2.length; j++) {            
            mang2[j] = sc.nextFloat();
        }
        System.out.println("Toa do cua Vecter 2: ");
        for (float ac : mang2) {
            System.out.println(" " +ac);
        }
        int r = 0, t = 0, y = 0;
        for (int i = 0; i < mang1.length; i++) {                        
            for (int j = 0; j < mang2.length; j++) {
                r = (int) (mang1[0] + mang2[0]);
                t = (int) (mang1[1] + mang2[1]);
                y = (int) (mang1[2] + mang2[2]);
            }
        }
        System.out.println("Tong cua 2 Vecter = (" +r+ ", " +t+ ", " +y+ ")");
    }
}
