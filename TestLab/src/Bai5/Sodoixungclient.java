
package Bai5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Sodoixungclient {


    public static void main(String[] args){
        try{
        Socket socket = new Socket("127.0.0.1",8089);
        Scanner scan = new Scanner(System.in);
        DataInputStream din = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
         while (true) {
            System.out.print("Client: ");
            String s1 = scan.nextLine();
            dos.writeUTF(s1);
            String s2 = din.readUTF();
            System.out.println("Server: "+ s2 );
            if(s2.contains("Đối xứng!!!")){
                break;
            }
            dos.flush();
            scan=scan.reset();
        }
    }catch(Exception e){
            System.out.println("Server end!");
    }
    }
}
