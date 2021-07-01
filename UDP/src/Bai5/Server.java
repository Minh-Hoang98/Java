package Bai5;

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
            String a=request.trim();
            System.out.println(request);
            System.out.println(XuLy.daonguoc(request.trim()));
            if (XuLy.daonguoc(a).equals(a
            )) {
                sendData = "Chuoi doi xung".trim().getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ipAddress, port);
                serverSocket.send(sendPacket);
            } else {
               sendData="Chuoi chua doi xung".trim().getBytes();
               DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ipAddress, port);
                serverSocket.send(sendPacket);
            }

        }
    }

}
