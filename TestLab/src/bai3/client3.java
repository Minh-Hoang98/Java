package bai3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class client3 {

    public static void main(String[] args) throws IOException {
        Socket sk = new Socket("localhost", 9000);
        DataInputStream din = new DataInputStream(sk.getInputStream());
        DataOutputStream dos = new DataOutputStream(sk.getOutputStream());
        Scanner kb = new Scanner(System.in);
        System.out.print("nhap chuoi: ");
        String msg = kb.nextLine();
        dos.writeUTF(msg);
        dos.flush();
        while (true) {
            String chuoi = din.readUTF();
            System.out.println(chuoi);
            kb = kb.reset();

        }
    }
}
