package Bai4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.channels.DatagramChannel;
import java.util.Date;

public class Server {

    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket serverSocket = new DatagramSocket(6969);
        System.out.println("Server is started");
        byte[] receiveData = new byte[1024];
        byte[] sendData = new byte[1024];
        byte[] sendData1 = new byte[1024];
        byte[] sendData2 = new byte[1024];
        while (true) {
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);
            InetAddress ipAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();
            String request = new String(receivePacket.getData(), "ASCII");
            try {
                int n = Integer.parseInt(request.trim());
                Bai3 a = new Bai3();
                String chuoi = a.convert(n, 2);
                String chuoi1 = a.result(n, 8);
                String chuoi2 = a.result(n, 16);
                String s = "";
                s += "Binary: " + a.convert(n, 2).trim() + "\n";
                s += "Octal: " + a.result(n , 8).trim() + "\n";
                s += "Hecxa: " + a.result(n , 16).trim() + "\n";
                sendData = s.getBytes();
            } catch (Exception e) {
            }
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ipAddress, port);
            serverSocket.send(sendPacket);
        }
    }

}
