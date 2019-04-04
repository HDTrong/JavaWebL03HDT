/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class main {
    public static void main(String[] args) {
        XuLy xl = new XuLy();
        try {
            int a = xl.nhap();
            int b = xl.nhap();
            System.out.println("a/b = " + a/b);
        } catch (Exception ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
