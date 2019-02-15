/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vonglap2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class doiTienLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien ");
        int tien = sc.nextInt();
        int tienL1 = 100000;
        int tienL2 = 200000;
        int tienL3 = 500000;
        for (int i = tienL1; i <= tien; i+=tienL1) {
            for (int j = tienL2; j <= tien; j+=tienL2) {
                for (int k = tienL3; k <= tien; k+=tienL3) {         
                    if(i + j + k == tien)
                        System.out.printf("%d = %d (* %d) + %d (* %d) + %d (* %d)\n", tien, i/tienL1, tienL1, j/tienL2, tienL2, k/tienL3, tienL3);
                    
                }
                
            }
        }
    }
}
