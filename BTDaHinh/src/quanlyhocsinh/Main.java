/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyhocsinh;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        Person person1[] = new Person[20];
        Person person2[] = new Person[15];
        StudentManager st = new StudentManager(person1);
        EmployeeManager e = new EmployeeManager(person2);
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        int chon2 = 0;
        int chon3 = 0;
        do {            
            System.out.println("=======Menu=======");
            System.out.println("1. Nhap Student");
            System.out.println("2. Nhap Employee");
            System.out.println("3. Exit");
            
            System.out.println("Nhap lua chon:");
            chon = sc.nextInt();
            sc.nextLine();
            Menu m = new Menu();
            switch(chon){
                case 1: do{
                            m.display();
                            chon2 = sc.nextInt();
                            sc.nextLine();
                            switch(chon2){
                                case 1: st.add();
                                    break;
                                case 2: st.show();
                                    break;
                                case 3: System.out.println("Nhap ten");
                                    st.search(sc.nextLine());
                                    break;
                                case 4: return;
                                default: System.out.println("Nhap sai");
                                    break;
                            }
                        }while (chon2 !=4);
                case 2: do{
                            m.display();
                            chon3 = sc.nextInt();
                            sc.nextLine();
                            switch(chon3){
                                case 1: e.add();
                                    break;
                                case 2: e.show();
                                    break;
                                case 3: System.out.println("Nhap ten");
                                    e.search(sc.nextLine());
                                    break;
                                case 4: return;
                                default: System.out.println("Nhap sai");
                                    break;
                            }
                        }while (chon3 !=4);
                case 3: return;
                default: System.out.println("Nhap sai");
            }
        } while (chon < 4 && chon > 0);
    }
}
