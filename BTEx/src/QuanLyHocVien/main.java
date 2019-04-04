/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyHocVien;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        
        do {            
            System.out.println("===== MENU =====");
            System.out.println("1.add");
            System.out.println("2. Danh sach");
            System.out.println("3. Top");
            System.out.println("4. Exit");
            System.out.println("Mời bạn chọn");
            int chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case 1:
                    studentManager.add();
                    break;
                case 2:
                    studentManager.HienThi();
                    break;
                case 3:
                    studentManager.showTop(3);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:System.out.println("nhap sai");
            }
        } while (true);
        
    }
    
}
