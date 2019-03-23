/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhhoc;

/**
 *
 * @author PC
 */
public class HinhVuong extends HinhChuNhat{
    public double acreage() {
        
        System.out.println("Dien tich hinh vuong: ");
        return this.getCanhDay() * this.getChieuCao();
    }

    public double perimeter() {
        System.out.println("Chu vi hinh vuong: ");
        return (this.getCanhDay() * 4);
    }
    public void input(){
        super.input();
    }
}
