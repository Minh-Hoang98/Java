/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Chat.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Laptop88
 */
public class TestClient {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 7000);
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        DataInputStream din = new DataInputStream(socket.getInputStream());
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.print("ID: ");
            String msg = kb.nextLine();
            dos.writeUTF(msg);
            System.out.print("Password: ");
            String sg = kb.nextLine();
            dos.writeUTF(sg);
            dos.flush();
            String st = din.readUTF();
            System.out.println(st);
            kb = kb.reset();
            break;
        }
    }

}
