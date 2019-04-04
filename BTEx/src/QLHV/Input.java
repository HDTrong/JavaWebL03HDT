/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLHV;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Input {
 
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }
    
    public String inputId() { // HV000
        String tempId = this.scanner.nextLine();
        try {
            //Kiem tra dieu kien
//            if (!tempId.startsWith("HV")) throw new Exception("Phai bat dau bang HV");
//            String sub = tempId.substring(2);
//            int parseInt = Integer.parseInt(sub);

            // Biểu thức chính quy - Regular Expression
            if (!tempId.matches("HV[0-9]{3}")) 
                throw new Exception("Phai bat dau bang HV va 3 so");
        } catch (Exception e) {
            System.out.println("Sai dinh dang");
            System.out.println(e.getMessage());
            return this.inputId();
        }
        return tempId;
    }
    
    public String inputName() {
        String tempName = this.scanner.nextLine();
        //Kiem tra dieu kien
        try {
            if (tempName.length() < 8) throw new Exception("Ten phai lon hon 8 ky tu");
        } catch (Exception e) {
            System.out.println("Sai dinh dang");
            System.out.println(e.getMessage());
            return this.inputName();
        }
        return tempName;
    }
    
    public double inputMark() {
        double tempMark = Double.parseDouble(this.scanner.nextLine());
        //Kiem tra dieu kien
        
        return tempMark;
    }
    
    public String inputPhone() {
        String tempPhone = this.scanner.nextLine();
        //Kiem tra dieu kien
//        if (tempPhone.matches("^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$"))
        return tempPhone;
    }
            
}