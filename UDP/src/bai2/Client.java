
package bai2;

import Bai3.*;
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
        byte[] sendData=new byte[1024];
        byte[] receiveData=new byte[1024];
        Scanner scan=new Scanner(System.in);
        System.out.print("Client: ");
        String msg=scan.nextLine();
        sendData=msg.getBytes();
        DatagramPacket sendPacket= new DatagramPacket(sendData, sendData.length, idAddress, 6969);
        clientSocket.send(sendPacket);
        DatagramPacket receivePacket= new DatagramPacket(receiveData, receiveData.length);
        clientSocket.receive(receivePacket);
        String str =new String(receivePacket.getData());
        System.out.println(str);
    }
}
