/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author Admin
 */
public class UDPTimeClient {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress idAddress = InetAddress.getByName("localhost");
        byte[] sendData=new byte[1024];
        byte[] receiveData=new byte[1024];
        sendData="getDate".getBytes();
        DatagramPacket sendPacket= new DatagramPacket(sendData, sendData.length, idAddress, 6969);
        clientSocket.send(sendPacket);
        DatagramPacket receivePacket= new DatagramPacket(receiveData, receiveData.length);
        clientSocket.receive(receivePacket);
        String str =new String(receivePacket.getData());
        System.out.println(str);
        clientSocket.close();
    }
}
