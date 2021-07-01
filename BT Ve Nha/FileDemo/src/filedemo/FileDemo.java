/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedemo;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Laptop88
 */
public class FileDemo {

    public static void main(String[] args) {
        String path;
        File f1 = null;
        File f2 = new File("C:\\Users\\Laptop88\\Desktop\\progr.txt");
      try {
         // create new file
         File f = new File("C:\\Users\\Laptop88\\Desktop\\program.txt");
         
         // returns true if the file can be read
         boolean bool = f.canRead();
         path = f.getAbsolutePath();
         
         // print
         System.out.println("File can be read: "+bool); // Kiểm tra thư mục có gì đọc ko?
         System.out.println(f.getAbsolutePath()); // In ra tên đường dẫn tuyệt đối
          System.out.println(f.getName()); // Trả về tên của tệp hoặc thư mục 
          System.out.println(f.getParent()); //  Trả về chuỗi tên đường dẫn của cha mẹ hoặc nul không đặt tên thư mục mẹ
          System.out.println(f.isDirectory()); // file có nằm trong thư mục hay ko?
          System.out.println(f.isFile());
          System.out.println(f.list());
          System.out.println(f.canWrite());
          System.out.println(f.createNewFile()); // Trả về true nếu thư mục chứa file chưa tồn tại
          //System.out.println(f.delete()); //xóa file
          System.out.println(f.length());
          System.out.println(f.mkdir());
          System.out.println(f.renameTo(f2));// Đổi tên file f thành tên file f2 (tên file này thành tên file kia)
      } catch(Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
      }

    }
    
}
