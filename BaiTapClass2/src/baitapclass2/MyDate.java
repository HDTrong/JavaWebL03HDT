/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapclass2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public boolean KTNam(){
        if(this.year <1){
            return false;
        }
        return true;
    }
    public boolean KTThang(){
        if(this.month <1||this.month>12){
            return false;
        }
        return true;
    }
    public boolean KTNhuan(){
        if((this.year % 4 == 0 && this.year %100!=0) || (this.year%400==0)){
            return true;
        }
        return false;
    }
    public boolean kiemTraDay(){
        
        if(this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || 
                this.month == 10 || this.month == 12 ){
            if(this.day < 1 || this.day >31){
                return false;
            }
            else {
                return true;
            }
        }
        else if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11){
            if(this.day < 1 || this.day > 30)
            {
                return false;
            }
            else{
                return true;
            }
        }
        else if(this.month == 2){
            if(this.KTNhuan() == true){
                if(this.day <1 || this.day > 29){
                    return false;
                }
                else{
                    return true;
                }
            }
            else{
                if(this.day < 1 || this.day > 28)
                {
                    return false;
                }
                else{
                    return true;
                }
                
            }
        }
        return false;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap nam: ");
            this.year = sc.nextInt();
            if(this.KTNam() == false){
                System.out.println("Ban nhap sai, moi ban nham lai");
            }
            else
                break;
        }while(true);
        do {            
            System.out.println("Nhap thang: ");
            this.month = sc.nextInt();
            if(this.KTThang() == false){
                System.out.println("Ban nhap sai, moi ban nham lai");
            }
            else
                break;
        } while (true);
        do {            
            System.out.println("Nhap ngay: ");
            this.day = sc.nextInt();
            if(this.kiemTraDay() == false){
                System.out.println("Ban nhap sai, moi ban nham lai");
            }
            else
                break;
        } while (true);
    }
    public void Output(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ban muon in ngay thang theo dang nao, moi ban chon: ");
        System.out.println("1: Ngay/Thang/Nam. Vi du: 14/07/1998 (dang ngan)");
        System.out.println("2: Ngay Thang Nam. Vi du: Ngay 14 thang 7 nam 1998 (dang dai)");
        int x;
        do{
            x = sc.nextInt();
            
                switch(x){
                    case 1: System.out.println(+this.day+ "/" +this.month+ "/" +this.year);
                            break;
                    case 2: System.out.println("Ngay " +this.day+ " thang " +this.month+ " nam " +this.year);
                            break;
                    default:
                        System.out.println("ban chi dươc chon 1 hoac 2");
                        break;
                }
        }while (x !=1 && x !=2);        
            
        }
    

    public void addYear(int year) {
        this.year += year;
    }

    public void addMonth(int month) {
        this.month += month;
        if (this.month > 12) {
            int years = this.month % 12;
            this.addYear(years);
            this.month = this.month / 12;
        }
    }

    public void addDay(int day) {
        this.day += day;

        switch (this.month) {
            case 2:
                if (this.KTNhuan()) {
                    if (this.day >= 29) {
                        this.addMonth(1);
                        int diff = this.day - 29;
                        this.day = 0;
                        this.addDay(diff);
                    }
                } else {
                    if (this.day >= 28) {
                        this.addMonth(1);
                        int diff = this.day - 28;
                        this.day = 0;
                        this.addDay(diff);
                    }
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (this.day > 31) {
                    this.addMonth(1);
                    int diff = this.day - 31;
                    this.day = 0;
                    this.addDay(diff);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (this.day > 30) {
                    this.addMonth(1);
                    int diff = this.day - 30;
                    this.day = 0;
                    this.addDay(diff);
                }
                break;
        }
    }
    public void print(int type) {
        if (type == 0) {
            System.out.printf("%d/%d/%d \n", this.day, this.month, this.year);
        } else if (type == 1) {
            System.out.printf("Ngày %d Tháng %d Năm %d \n/n", this.day, this.month, this.year);
        }
    }

    private int month() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
