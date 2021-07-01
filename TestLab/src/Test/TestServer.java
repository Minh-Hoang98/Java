/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Chat.*;
import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 *
 * @author Laptop88
 */
public class TestServer {

    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(7000);

        System.out.println("server start....");
        Socket socket = server.accept();
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        DataInputStream din = new DataInputStream(socket.getInputStream());
        Scanner kb = new Scanner(System.in);

        while (true) {
            String st = din.readUTF();
            String s = din.readUTF();
            dos.writeUTF(st);               
            dos.flush();
            kb = kb.reset();
        }

    }
}

