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
public class HinhChuNhat extends HinhBinhHanh{
    public double acreage() {
        
        System.out.println("Dien tich hinh chu nhat: ");
        return this.getCanhDay() * this.getChieuCao();
    }

    public double perimeter() {
        System.out.println("Chu vi hinh chu nhat: ");
        return ((this.getChieuCao() + this.getCanhDay()) * 2);
    }
    public void input(){
        super.input();
    }
}
