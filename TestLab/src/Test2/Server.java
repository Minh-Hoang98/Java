/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

/**
 *
 * @author PC
 */
public class Server {

    public static String reflect(String a){
        String b = "";
        for(int i= a.length()-1; i>=0; i--){
            b+=a.charAt(i);
        }
        if(b.equals(a)){
            return "Chuỗi đối xứng";
        }
        return "Chuỗi không đối xứng!!!";
    }
    public static void main(String[] args) throws IOException {
        DatagramSocket ss = new DatagramSocket(6969);
        System.out.println("Server is started...");
        byte[] rd = new byte[1024];
        byte[] sd = new byte[1024];
        while (true) {
            DatagramPacket rp = new DatagramPacket(rd, rd.length);
            ss.receive(rp);
            InetAddress ip = rp.getAddress();
            int p = rp.getPort();
            String re = new String(rp.getData(), rp.getOffset(), rp.getLength());
            System.out.println(re);
            String s = reflect(re).trim();
            sd = s.getBytes("UTF-8");
            DatagramPacket sp = new DatagramPacket(sd, sd.length, ip, p);
            ss.send(sp);
        }
    }
}
