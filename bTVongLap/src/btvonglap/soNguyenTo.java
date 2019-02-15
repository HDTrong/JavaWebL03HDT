/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvonglap;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class soNguyenTo {


    /**
     * @param args the command line arguments
     */
    //ax2 + bx + c
    public static void main(String[] args) {
            System.out.println("Nhap n: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int dem = 0;
            int demm = 0;
            if(n < 2)
            {
                System.out.println(" n khong phai so nguyen to");
            }
            for(int i = 1;i<=n;i++){
                if(n%i==0)
                    dem++;
            }
            if(dem == 2)
            {
                
                System.out.println("n la so nguyen to");
            }
            else{
                System.out.println("n khong phai la so nguyen to");
            }
            System.out.println("Cac so nguyen to < n: ");
            for(int j=2;j<=n;j++)
            {
                for(int k=1;k<=j;k++)
                {
                    if(j%k==0)
                    {
                        demm++;
                    }
                        
                }
                if(demm == 2)
                {
                    System.out.println(" "+ j);
                   
                }
                demm =0;
                
            }
            
            
    }
}
