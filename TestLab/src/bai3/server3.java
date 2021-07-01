
package bai3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class server3 {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9000);
        System.out.println("Sever is started");
        while (true) {
            Socket sk = server.accept();
            DataOutputStream dos = new DataOutputStream((sk.getOutputStream()));
            DataInputStream din = new DataInputStream(sk.getInputStream());

            String chuoi = din.readUTF();
            String chuoi5 = Chuoi.chuoiDao(chuoi);
            dos.writeUTF("chuoi dao: " + chuoi5);
            String chuoi1 = Chuoi.chuoihoa(chuoi);
            dos.writeUTF("chuoi hoa: " + chuoi1);
            String chuoi2 = Chuoi.chuoithuong(chuoi);
            dos.writeUTF("chuoi thuong: " + chuoi2);
            String chuoi3 = Chuoi.hoathuong(chuoi);
            dos.writeUTF("chuoi hoa va thuong : " + chuoi3);
            String chuoi4 = Chuoi.nguyenam1(chuoi);
            dos.writeUTF("nguyen am: " + chuoi4);

            String chuoi6 = Chuoi.soTu(chuoi);
            dos.writeUTF("sotu: " + chuoi6);
        }

    }
}
