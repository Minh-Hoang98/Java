package Bai3;

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
        while (true) {
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);
            InetAddress ipAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();
            String request = new String(receivePacket.getData(), "ASCII");
            String s = "";
            Bai4 a = new Bai4();
            s += "Chuỗi hoa: " + a.chuoihoa(request).trim() + "\n";
            s += "Chuỗi vừa hoa vừa thường: " + a.chuoimix(request).trim() + "\n";
            s += "Chuỗi thường: " + a.chuoithuong(request).trim();
            sendData = s.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ipAddress, port);
            serverSocket.send(sendPacket);
        }
    }

}
