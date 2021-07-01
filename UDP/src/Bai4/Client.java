package Bai4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress idAddress = InetAddress.getByName("localhost");
        byte[] sendData = new byte[1024];
        byte[] receiveData = new byte[1024];
        Scanner scan = new Scanner(System.in);
        for (int i = 0;; i++) {
            System.out.print("Nhập số: ");
            String msg = scan.nextLine();
            if (Integer.parseInt(msg) > 0) {
                sendData = msg.getBytes();
                break;
            } else {
                System.out.println("Số phải lớn hơn 0 !");
                continue;
            }
        }
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, idAddress, 6969);
        clientSocket.send(sendPacket);
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        clientSocket.receive(receivePacket);
        String s = new String(receivePacket.getData());      
        System.out.println(s);
        clientSocket.close();
    }
}
