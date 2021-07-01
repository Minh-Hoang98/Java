/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientServer;

import java.io.*;
import java.net.Socket;

/**
 *
 * @author Laptop88
 */
public class TCPTimeClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",8977);
        DataInputStream din = new DataInputStream(socket.getInputStream());
        String time = din.readUTF();
        System.out.println(time);
    }
}
