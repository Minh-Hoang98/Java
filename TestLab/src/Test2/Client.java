package Test2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Client {

    public static void main(String[] args) throws Exception {
        DatagramSocket cs = new DatagramSocket();
        InetAddress ip = InetAddress.getLocalHost();
        while (true) {
            byte[] sd = new byte[1024];
            byte[] rd = new byte[1024];
            System.out.print("Nhập chuỗi: ");
            Scanner s;
            String str = "";
            while (true) {
                s = new Scanner(System.in);
                str = s.nextLine();
                if (!str.equals("")) {
                    break;
                }
                System.out.print("Nhập lại: ");
            }
            sd = str.getBytes();
            DatagramPacket sp = new DatagramPacket(sd, sd.length, ip, 6969);
            cs.send(sp);
            DatagramPacket rp = new DatagramPacket(rd, rd.length);
            cs.receive(rp);
            str = new String(rp.getData());
            System.out.println(str);
            if (str.trim().equals("Chuỗi đối xứng")) {
                cs.close();
                break;
            }
        }
    }
}
