/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;



import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Student {
    private String MaSV;
    private double DiemTB;
    private int Tuoi;
    private String Lop;

    public Student() {
    }

    public Student(String MaSV, double DiemTB, int Tuoi, String Lop) {
        this.MaSV = MaSV;
        this.DiemTB = DiemTB;
        this.Tuoi = Tuoi;
        this.Lop = Lop;
    }

    public String getMaSV() {
        return MaSV;
    }

    public double getDiemTB() {
        return DiemTB;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public String getLop() {
        return Lop;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public void setDiemTB(double DiemTB) {
        this.DiemTB = DiemTB;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }
    
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        
        do {        
            System.out.println("Nhap Ma Sinh Vien: ");
            MaSV = sc.nextLine();
            
            if(MaSV.length() != 8)
            {
                System.out.println("Ban nhap sai, mơi ban nhap lai: ");
            }
            else
                break;            
        } while (true);
        
        do {        
            System.out.println("Nhap diem TB:");
            DiemTB = sc.nextDouble();
            
            if(DiemTB<0 || DiemTB>10)
            {
                System.out.println("Ban nhap sai, mơi ban nhap lai: ");
            }
            else
                break;            
        } while (true);
        
        do {        
            System.out.println("Nhap Tuoi:");
            Tuoi = sc.nextInt();
            sc.nextLine();
            if(Tuoi <= 18)
            {
                System.out.println("Ban nhap sai, mơi ban nhap lai: ");
            }
            else
                break;            
        } while (true);
        
        do {        
            System.out.println("Nhap Lop:");
            Lop = sc.nextLine();
            String[] mang;
            mang = Lop.split("");
            if(mang[0].equals("A") || mang[0].equals("C"))
            {
                break;
            }
            else
                System.out.println("Ban nhap sai, mơi ban nhap lai: ");            
        } while (true);
}
    
    public void showInfo(){
        System.out.println("MaSV: " +this.MaSV);
        System.out.println("Diem Trung Binh: " +this.DiemTB);
        System.out.println("Tuoi: " +this.Tuoi);
        System.out.println("Lop: " +this.getLop());
    }
    public double kTra(){
        if(DiemTB >= 8){
            return 1;
        }
        else{
            return 0;
        }
    }

    
    public static void main(String[] args) {
        Student st = new Student();
        st.inputInfo();
        st.showInfo();
        if(st.kTra() == 1){
            System.out.println("Duoc hoc bong");
            
        }
        else
            System.out.println("Khong duoc hoc bong");
    }
}
