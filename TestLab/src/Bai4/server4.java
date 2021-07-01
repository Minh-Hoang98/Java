package Bai4;

import bai3.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class server4 {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9876);
        System.out.println("Sever is started");
        while (true) {
            Socket sk = server.accept();
            String b = "0";
            DataOutputStream dos = new DataOutputStream((sk.getOutputStream()));
            DataInputStream din = new DataInputStream(sk.getInputStream());

            String chuoi = din.readUTF();

            String chuoi1 = Bai4.result(Integer.parseInt(chuoi), 2);
            for (int i = chuoi1.length(); i < 8; ++i) {
                chuoi1 = b + chuoi1;
            }
            dos.writeUTF("Binary: " + chuoi1);

            String chuoi2 = Bai4.result(Integer.parseInt(chuoi), 8);
            dos.writeUTF("Octal: " + chuoi2);

            String chuoi3 = Bai4.result(Integer.parseInt(chuoi), 16);
            dos.writeUTF("Hecxa: " + chuoi3);

        }

    }
}
