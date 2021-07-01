package Bai5;

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
        boolean st = true;
        while (st) {
            System.out.print("Nhập chuỗi: ");
            String msg = scan.nextLine();
            sendData = msg.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, idAddress, 6969);
            clientSocket.send(sendPacket);
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
            String str = new String(receivePacket.getData());
            String a = str.trim();
            if (str.trim().equals("Chuoi doi xung") || str.trim().equals("Chuoi doi xung xung")) {
                st = false;
                System.out.println("Chuỗi đối xứng");
                clientSocket.close();
            }
            else{
                System.out.println("Chuỗi chưa đối xứng");
                st = true;
            }          
        }
    }

}
