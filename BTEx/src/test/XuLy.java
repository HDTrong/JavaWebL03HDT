/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class XuLy {

    public int nhap() throws Exception{
        boolean t;
        int a = 0;
        do {            
            try {
                t = true;
            System.out.println("Nhâp so: ");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            return a;
        } catch (Exception e) {
            System.out.println("Nhâp sai: ");
            t = false;
        }
        } while (!false);

        
        
    }
}
