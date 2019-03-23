/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhhoc;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class HinhBinhHanh extends Polyn{
    private double ChieuCao;
    private double CanhDay;
    private double CanhKe;

    public HinhBinhHanh() {
    }

    public HinhBinhHanh(double ChieuCao, double CanhDay) {
        this.ChieuCao = ChieuCao;
        this.CanhDay = CanhDay;
        this.CanhKe = CanhKe;

    }

    public double getCanhKe() {
        return CanhKe;
    }

    public void setCanhKe(double CanhKe) {
        this.CanhKe = CanhKe;
    }
    

    public double getChieuCao() {
        return ChieuCao;
    }

    public void setChieuCao(double ChieuCao) {
        this.ChieuCao = ChieuCao;
    }

    public double getCanhDay() {
        return CanhDay;
    }

    public void setCanhDay(double CanhDay) {
        this.CanhDay = CanhDay;
    }
    
    
    @Override
    double acreage() {
        
        System.out.println("Dien tich hinh binh hanh: ");
        return CanhDay * ChieuCao;
    }

    @Override
    double perimeter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cạnh kề: ");
        CanhKe = sc.nextDouble();
        System.out.println("Chu vi hinh binh hanh: ");
        return (CanhDay + CanhKe)*2;
    }

    @Override
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu cao: ");
        ChieuCao = sc.nextDouble();
        System.out.println("Nhap canh day: ");
        CanhDay = sc.nextDouble();
    }
    
}
