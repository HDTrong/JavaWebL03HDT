/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapvonglap;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class UCLL_BCNN {
    public static void main(String[] args) {
        System.out.println("Nhap a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Nhap b");
        int b = sc.nextInt();
        for(int ucln = a; ucln>=1;ucln--){
            if(a%ucln==0 && b%ucln==0)
            {
                System.out.println("Uoc chung lon nhat cua " + a + " va " +b +" = "+ucln);
                break;
            }
        }
        for(int bcnn = a; bcnn<=a*b;bcnn++){
            if(bcnn%a==0 && bcnn%b==0)
            {
                System.out.println("Boi chung nho nhat cua " + a + " va " +b +" = "+bcnn);
                break;
            }
        }
        
    }
    
}
