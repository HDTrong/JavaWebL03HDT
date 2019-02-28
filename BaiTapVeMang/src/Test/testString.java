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
public class testString {
    public static void main(String[] args) {
        String str = new String();
        Scanner name = new Scanner(System.in);
        System.out.println("Nhap chuoi 1: ");
        str = name.nextLine();
        System.out.println("Nhap chuoi 2: ");
        String mb = name.nextLine();
        System.out.println("Chuoi vua nhap 1: " +str);
        System.out.println("Chuoi vua nhap 2: " +mb);
        System.out.println("kich thuoc: " +str.concat(mb));
        //charAt(?): Phần tử thứ ?;
        //length(): tổng các phần tử;
        //concat(): nối chuỗi;
    }
}
