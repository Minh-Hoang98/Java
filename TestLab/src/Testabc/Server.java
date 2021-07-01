package Testabc;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Server {

    private int port;
    public static ArrayList<Socket> listclient;

    public Server(int port) {
        this.port = port;
    }

    public Server() {
    }

    private void execute() throws IOException {
        ServerSocket server = new ServerSocket(port);

        System.out.println("Server is listenning....");
        while (true) {
            Socket socket = server.accept();
            System.out.println("Connect  with +" + socket);
            Server.listclient.add(socket);
            ReadServer read = new ReadServer(socket);
            read.start();
        }
    }

    class ReadServer extends Thread {

        private Socket server;

        public ReadServer(Socket server) {
            this.server = server;
        }

        public void run() {
            DataInputStream din = null;
            Server sovo = new Server();
    
            
            try {
                din = new DataInputStream(server.getInputStream());
                while (true) {
                    String s = din.readUTF();
                    String st = din.readUTF();                  
                    if (s.contains("exit")) {
                        Server.listclient.remove(server);//remove client muon thoat
                        System.out.println("Disconnec with " + server);
                        din.close();
                        server.close();
                        break;
                    }
                    for (Socket item : Server.listclient) {
                        if (item.getPort() == server.getPort()) {
                            DataOutputStream dos = new DataOutputStream(item.getOutputStream());
                                dos.writeUTF(s);
                                dos.writeUTF(st);
                                dos.flush();
                                Server.listclient.remove(server);
                                System.out.println("Disconnec with " + server);
                                din.close();
                                server.close();                          
                        }
                    }
                }
            } catch (Exception e) {
                try {
                    din.close();
                    server.close();
                } catch (Exception ex) {
                    System.out.println("Ngat ket noi server");
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Server.listclient = new ArrayList<>();
        Server server = new Server(9090);
        server.execute();
    }
}
