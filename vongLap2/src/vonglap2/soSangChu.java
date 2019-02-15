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
public class soSangChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so n co 2 chu so: ");
        int n = sc.nextInt();
        int temp = n;
        int du;
        int nguyen;
        du = temp % 10;
        nguyen = temp / 10;
        switch(nguyen){
            case 1: System.out.print("mười ");
                    break;
            case 2: System.out.print("hai mươi ");
                    break;
            case 3: System.out.print("ba mươi ");
                    break;
            case 4: System.out.print("bốn mươi ");
                    break;
            case 5: System.out.print("năm mươi ");
                    break;
            case 6: System.out.print("sau mươi ");
                    break;
            case 7: System.out.print("bảy mươi ");
                    break;
            case 8: System.out.print("tám mươi ");
                    break;
            case 9: System.out.print("chín mươi ");
                    break;
        }
        switch(du){
            case 1: System.out.print("một ");
                    break;
            case 2: System.out.print("hai ");
                    break;
            case 3: System.out.print("ba  ");
                    break;
            case 4: System.out.print("bốn ");
                    break;
            case 5: System.out.print("năm ");
                    break;
            case 6: System.out.print("sau ");
                    break;
            case 7: System.out.print("bảy ");
                    break;
            case 8: System.out.print("tám ");
                    break;
            case 9: System.out.print("chín ");
                    break;
        }
    }
}
