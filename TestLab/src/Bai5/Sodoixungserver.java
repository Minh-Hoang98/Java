package Bai5;

import Bai4.Bai4;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Sodoixungserver {

    public String nhiphan(String m) {
        int number = Integer.parseInt(m);
        int dem = 0;
        int[] binary = new int[20];
        String result = "";
        while (number > 0) {
            binary[dem] = number % 2;
            number = number / 2;
            dem++;
        }
        for (int i = dem - 1; i >= 0; i--) {
            result += binary[i];
        }
        return result;
    }

    public boolean doixung(String m) {
        String test = "";
        for (int i = m.length() - 1; i >= 0; i--) {
            char a = m.charAt(i);
            test += a;
        }
        if (test.equals(m)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        try {
            Sodoixungserver sovo = new Sodoixungserver();
            ServerSocket sc = new ServerSocket(8089);
            System.out.println("Server is ready");
            Socket sk = sc.accept();
            DataInputStream din = new DataInputStream(sk.getInputStream());
            DataOutputStream dos = new DataOutputStream(sk.getOutputStream());
            while (true) {
                String s = din.readUTF();
                String b="0";
                String chuoi1 = sovo.nhiphan(s);
                for (int i = chuoi1.length(); i < 8; ++i) {
                    chuoi1 = b + chuoi1;
                }
                boolean result = sovo.doixung(chuoi1);
                if (result == true) {
                    dos.writeUTF("Đối xứng!!! " + chuoi1);
                    dos.flush();
                    sc.isClosed();
                    din.close();
                    dos.close();

                } else {
                    dos.writeUTF("Không đối xứng!!! " + chuoi1);
                    dos.flush();
                }
            }
        } catch (Exception e) {
            System.out.println("Client disconnect !");
        }

    }
}
