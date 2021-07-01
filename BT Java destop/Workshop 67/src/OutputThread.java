import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class OutputThread extends Thread {

    Socket socket;
    JTextArea txt;
    BufferedReader br;
    String sender;
    String receiver;

    public OutputThread(Socket socket, JTextArea txt, String sender, String receiver) {
        super();
        this.socket = socket;
        this.txt = txt;
        this.sender = sender;
        this.receiver = receiver;
        try {
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Network error!");
            System.exit(0);
        }

    }

    public void run() {
        while (true) {
            try {
                if (socket != null) {
                    String msg = "";
                    if (((msg = br.readLine())).length() > 0) {
                        txt.append("\n" + receiver + ": " + msg);
                    }
                }
            } catch (Exception ex) {
            }
        }
    }
}
