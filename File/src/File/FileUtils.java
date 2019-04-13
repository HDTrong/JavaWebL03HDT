/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.File;

/**
 *
 * @author PC
 */
public class FileUtils {
    public void outFile(String f){
        
        File f1 = new File(f);
        String ghi = null;
        String[] mang = f1.list();
        if(mang == null){
            System.out.println("Mảng rỗng");
        }
        else{
            for (int i = 0; i < mang.length; i++) {
                String chuoi = mang[i];
                //đếm phần tử xuất hiện, nếu không tồn tại dấu chấm, trả về -1;
                int kT = chuoi.indexOf(".");
                if(kT > 0){
                    ghi = mang[i];
                    System.out.println(ghi);
                }
            }
        }
        //return "Không còn file";
    }
    
    public void outFolder(String f){
        
        File f1 = new File(f);
        String ghi = null;
        File[] mang = f1.listFiles();
        if(mang == null){
            //return "Mảng rỗng";
            System.out.println("Mảng rỗng");
        }
        else{
            for (int i = 0; i < mang.length; i++) {
                //isDire kiểm tra thư mục
                //isFile kiểm tra file
                if(mang[i].isDirectory()){
                   
                    System.out.println(mang[i].getName());
                }
            }
        }
        //return "Không còn file";
    }
    
    public void outFilePic(String f){
        
        File f1 = new File(f);
        String ghi = null;
        String[] mang = f1.list();
        if(mang == null){
            System.out.println("Mảng rỗng");
        }
        else{
            for (int i = 0; i < mang.length; i++) {
                String chuoi = mang[i];
                //đếm phần tử xuất hiện, nếu không tồn tại dấu chấm, trả về -1;
                int kT = chuoi.indexOf(".png");
                int kT2 = chuoi.indexOf(".jpg");
                int kT3 = chuoi.indexOf(".jpeg");

                
                if(kT > 0 ||kT2 > 0 || kT3>0){
                    ghi = mang[i];
                    System.out.println(ghi);
                }
            }
        }
        //return "Không còn file";
    }
    
    public void outFileExt(String ext, String path){
        File f = new File(path);
        File[] mang = f.listFiles();
        for (int i = 0; i < mang.length; i++) {
                
            }
 {
            
        }
    }
}
