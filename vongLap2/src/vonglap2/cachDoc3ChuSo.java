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
public class cachDoc3ChuSo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so n co 3 chu so: ");
        int n = sc.nextInt();
        int temp = n;
        int dV;
        int tThe;
        int chuc;
        int tram;
        dV = temp % 10;
        tThe = temp / 10;
        chuc = tThe % 10;
        tram = temp /100;
        if(chuc == 0 && dV == 0){
            switch(tram){
            case 1: System.out.print("một trăm ");
                    break;
            case 2: System.out.print("hai trăm ");
                    break;
            case 3: System.out.print("ba trăm ");
                    break;
            case 4: System.out.print("bốn trăm ");
                    break;
            case 5: System.out.print("năm trăm ");
                    break;
            case 6: System.out.print("sau trăm ");
                    break;
            case 7: System.out.print("bảy trăm ");
                    break;
            case 8: System.out.print("tám trăm ");
                    break;
            case 9: System.out.print("chín trăm ");
                    break;
            }
        }
        else{
            switch(tram){
            case 1: System.out.print("một trăm ");
                    break;
            case 2: System.out.print("hai trăm ");
                    break;
            case 3: System.out.print("ba trăm ");
                    break;
            case 4: System.out.print("bốn trăm ");
                    break;
            case 5: System.out.print("năm trăm ");
                    break;
            case 6: System.out.print("sau trăm ");
                    break;
            case 7: System.out.print("bảy trăm ");
                    break;
            case 8: System.out.print("tám trăm ");
                    break;
            case 9: System.out.print("chín trăm ");
                    break;
        }
        switch(chuc){
            case 0: System.out.print("lẻ ");
                    break;
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
        switch(dV){
            
            case 1: System.out.print("mốt ");
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
}
