/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyHocVien;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author P
 */
public class Input {

    public Input() {
    }

    


    
    
    public String inputID(){
        Scanner sc = new Scanner(System.in);
        String tempid = sc.nextLine();
        try {
            //id = HV000;
            //Kiểm tra ký tự đầu
            //if(!tempid.startsWith("HV")) throw new Exception("id phai bat dau bang HV");
            //cắt chuỗi
            //String sub = tempid.substring(2);
            //int paseInt = Integer.parseInt(sub);
            // Toán tử 3 ngôi;
            if(!tempid.matches("HV[0-9]{3}"))throw new Exception("Phải bắt đầu bằng HV theo sau là 3 chữ số");
                
            }
        catch (Exception e) {
            System.out.println("Sai dinh dang");
            System.out.println(e.getMessage());
            return this.inputID();
            //Logger.getLogger(Input.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tempid;
        
    }
    public String inputPhone(){
        Scanner sc = new Scanner(System.in);
        String phone = sc.nextLine();
        try {
            if(!phone.matches("(\\+84|0)[0-9]{9}")) throw new Exception("So dien thoai pahi co 10 so");
                
        } catch (Exception e) {
            System.out.println("Sai định dang");
            System.out.println(e.getMessage());
            return this.inputPhone();
        }
        //if (phone.matches("^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$"))
        return phone;
    }
    
    public double inputDTK(){
        Scanner sc = new Scanner(System.in);
        double dTK = Double.parseDouble(sc.nextLine());
        try{
            if((dTK<1 || dTK>10)) throw new Exception("Diem phai từ 1-10");
            
        } catch (Exception ex) {
            System.out.println("Không hợp lệ");
            return inputDTK();
            //Logger.getLogger(Input.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dTK;
    }
    public  String inputName(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        try {
            if ((name.length() < 8)) throw new Exception("Ten phai lon hon 8 ky tu");
            
        } catch (Exception e) {
            System.out.println("Định dang sai");
            return inputName();
        }
        return name;
    }
}
