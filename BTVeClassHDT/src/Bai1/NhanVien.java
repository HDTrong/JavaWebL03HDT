/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class NhanVien {
    private String Ten;
    private int Tuoi;
    private String DiaChi;
    private double TienLuong;
    private int TongGioLam;

    public String getTen() {
        return Ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public double getTienLuong() {
        return TienLuong;
    }

    public int getTongGioLam() {
        return TongGioLam;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setTienLuong(double TienLuong) {
        this.TienLuong = TienLuong;
    }

    public void setTongGioLam(int TongGioLam) {
        this.TongGioLam = TongGioLam;
    }

    public NhanVien() {
    }
    
    
    
    public NhanVien(String Ten, int Tuoi, String DiaChi, double TienLuong, int TongGioLam) {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
        this.TienLuong = TienLuong;
        this.TongGioLam = TongGioLam;
    }
    
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        Ten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        Tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap dia chi: ");
        DiaChi = sc.nextLine();
        System.out.println("Nhap tien luong: ");
        TienLuong = sc.nextDouble();
        System.out.println("Nhap tong so gio lam: ");
        TongGioLam = sc.nextInt();       
    }
    public void printInfo(){
        System.out.println("Ten: " +this.Ten);
        System.out.println("Tuoi: " +this.Tuoi);
        System.out.println("Dia chi: " +this.DiaChi);
        System.out.println("Tien luong: " +this.TienLuong);
        System.out.println("Tong gio lam: " +this.TongGioLam);
    }
    public double tinhThuong(double thuong){
        if(TongGioLam >= 200){
            thuong = TienLuong * 20/100;
        }
        else if (TongGioLam <200 &&TongGioLam>=100) {
            thuong = TienLuong * 10/100;
            
        }
        else if(TongGioLam <100){
            thuong = 0;
        }
        return thuong;
    }
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.inputInfo();
        nv.printInfo();
        double thuong=0;
        System.out.println("So tien thuong: " +nv.tinhThuong(thuong));
    }
}
