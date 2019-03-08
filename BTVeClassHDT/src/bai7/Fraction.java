/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double getNumerator() {
        return numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("nhap tu so: ");
        this.numerator = input.nextInt();
        System.out.println("nhap mau so: ");
        this.denominator = input.nextInt();
    }
    public void print(){
        System.out.println(this.numerator + "/" +this.denominator);
    }
    public void rgps(){
     
    }
    public int ucln(){
        while (this.numerator != this.denominator) {            
            if(this.numerator > this.denominator)
            {
                this.numerator = this.numerator - this.denominator;
            }
            else{
                this.denominator = this.numerator - this.denominator;
            }
        }
        return 0;
    }
    
}
