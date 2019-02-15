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
public class pTB2 {

    /**
     * @param args the command line arguments
     */
    //ax2 + bx + c
    public static void main(String[] args) {
        // TODO code application logic here
        //Scan ("%d%d ", &a, &b)....
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        //sc.nextLine();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap c: ");
        double c = sc.nextDouble();
        double delta;
        if(a==0){
            if(b==0){
                if(c==0)
                {
                    System.out.println("Phuong trinh vo so nghiem");
                }
                else
                    System.out.println("Phuong trinh vo nghiem");

            }
            else
                System.out.println("phuong tri co nghiem: x = " + (-c/b));
        }
        else{
            delta = b*b - 4*a*c;
            if(delta < 0)
            {
                System.out.println("Phuong trinh vo nghiem");
            }
            else if(delta == 0)
            {
                System.err.println(" phuong trinh co nghiep kep: x = " +(-b/2*a));
            }
            else
            {
                System.out.println("Phuong trinh co 2 nghiem: x1 = " +((-b+Math.sqrt(delta))/2*a));
                System.out.println("Phuong trinh co 2 nghiem: x2 = " +((-b-Math.sqrt(delta))/2*a));
            }
            
        }
        
         
    }
    
}
