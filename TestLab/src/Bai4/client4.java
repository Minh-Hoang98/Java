package Bai4;

import bai3.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class client4 {

    public static void main(String[] args) throws IOException {
        Socket sk = new Socket("localhost", 9876);
        DataInputStream din = new DataInputStream(sk.getInputStream());
        DataOutputStream dos = new DataOutputStream(sk.getOutputStream());
        Scanner kb = new Scanner(System.in);
        for (int i = 0;; i++) {
            System.out.print("Enter Number: ");
            String msg = kb.nextLine();
            if (Integer.parseInt(msg) > 0) {
                dos.writeUTF(msg);
                dos.flush();
                break;
            }
            else{
                System.out.println("Số phải lớn hơn 0!!!");
                continue;
            }
        }

        while (true) {
            String chuoi = din.readUTF();
            System.out.println(chuoi);
            kb = kb.reset();
        }
    }
}
