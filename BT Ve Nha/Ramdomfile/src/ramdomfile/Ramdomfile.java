/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramdomfile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Ramdomfile {
   public static void main(String[] args) {
   
      try {
         // create a new RandomAccessFile with filename test
         RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Laptop88\\Desktop\\hoang.txt", "rw");

         // write something in the file
         raf.writeUTF("Hello World");

         // set the file pointer at 0 position
         raf.seek(0);

         // read and print the contents of the file
         System.out.println("" + raf.readUTF());

         // return the file descriptor of the stream
         System.out.println("" + raf.getFD());


         // return the file pointer
         System.out.println("" + raf.getFilePointer());

         // change the position of the file pointer
         raf.seek(10);

         // return the file pointer
         System.out.println("" + raf.getFilePointer());
          // print the length of the file
         System.out.println("" + raf.length());

         // write something more in the file
         raf.writeUTF("This is an example");

         // print the length of the file
         System.out.println("" + raf.length());
         // read the first byte and print it
         raf.seek(3);
         System.out.println("" + raf.read());
         raf.close();
      } catch (IOException ex) {
         ex.printStackTrace();
      }
   }
}