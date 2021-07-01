package Testabc;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private InetAddress host;
    private int port;

    public Client(InetAddress host, int port) {
        this.host = host;
        this.port = port;
    }

    private void execute() throws IOException {
        Socket client = new Socket(host, port);
        ReadClinet read = new ReadClinet(client);
        read.start();
        WriteClient write = new WriteClient(client);
        write.start();
        System.out.print("ID: ");
    }

    class ReadClinet extends Thread {

        private Socket client;

        public ReadClinet(Socket client) {
            this.client = client;
        }

        public void run() {
            DataInputStream din = null;
            try {
                din = new DataInputStream(client.getInputStream());
                while (true) {
                    String sms =din.readUTF();
                    System.out.println("lzma"+sms);
                }
            } catch (Exception e) {
                try {
                    din.close();
                    client.close();
                } catch (Exception ex) {
                    System.out.println("Ngat ket noi server");
                }
            }
        }
    }

    class WriteClient extends Thread {

        private Socket client;

        public WriteClient(Socket client) {
            this.client = client;
        }

        public void run() {
            DataOutputStream dos = null;
            Scanner scan = null;
            try {
                dos = new DataOutputStream(client.getOutputStream());
                scan = new Scanner(System.in);
                while (true) {
                    
                    String sms = scan.nextLine();
                    dos.writeUTF(sms);
                    System.out.print("PW: ");
                    String sm = scan.nextLine();
                    dos.writeUTF(sm);
                }
            } catch (Exception e) {
                try {
                    dos.close();
                    client.close();
                } catch (Exception ex) {
                    System.out.println("Ngat ket noi server");
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Client client = new Client(InetAddress.getLocalHost(), 9090);
        client.execute();
    }

}
