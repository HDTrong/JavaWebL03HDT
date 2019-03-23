/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhhoc;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Menu=====");
        System.out.println("1. Hinh binh hanh");
        System.out.println("2. Hinh chu nhat");
        System.out.println("3. Hinh vuong");
        System.out.println("4. Exit");
        
        do{
           System.out.println("Nhap lua chon cua ban: ");
           int chon = sc.nextInt();
           switch(chon){
               case 1:{ HinhBinhHanh bh = new HinhBinhHanh();
                        System.out.println("kich thuoc hinh binh hanh: ");
                        bh.input();
                        System.out.println(bh.acreage());
                        System.out.println(bh.perimeter());
                        break;
               }
               case 2:{ HinhChuNhat cn = new HinhChuNhat();
                        System.out.println("kich thuoc hinh chu nhat: ");
                        cn.input();
                        System.out.println(cn.acreage());
                        System.out.println(cn.perimeter());
                        break;
               }
               case 3:{ HinhVuong hv = new HinhVuong();
                        System.out.println("Nhap kich thuoc hinh vuong: ");
                        hv.input();
                        System.out.println(hv.acreage());
                        System.out.println(hv.perimeter());
                        break;
                }
               case 4: return;
               default: System.out.println("Ban nhap sai moi ban nhap lai");
                   break;
           }
        }while (true);
        
        
        
    }
    
}
