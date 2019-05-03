/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;




/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        //ArrayList<String> list = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add("Trong");
        list.add("binTrong");
        list.add("Trongbin");
        
        list.remove(2);
        System.out.println(list.size());
        System.out.println(list.get(1));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        
        Vector<String> v = new Vector<>();
        v.addElement("");
        
        LinkedList<String> ll = new LinkedList<>();
    }
}
