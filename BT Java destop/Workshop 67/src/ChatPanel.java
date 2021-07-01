
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JTextArea;

public class ChatPanel extends javax.swing.JPanel {

    Socket socket;
    BufferedReader br;
    DataOutputStream dos;
    OutputThread t = null;
    String sender, receiver;

    public ChatPanel(Socket socket, String sender, String receiver) {
        initComponents();
        this.socket = socket;
        this.sender = sender;
        this.receiver = receiver;
        try {
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            dos = new DataOutputStream(socket.getOutputStream());
            t = new OutputThread(socket, txtEmpty, sender, receiver);
            t.start();
        } catch (Exception e) {

        }
    }

    public JTextArea getText() {
        return this.txtEmpty;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEmpty = new javax.swing.JScrollPane();
        txtEmpty = new javax.swing.JTextArea();
        pnlMessage = new javax.swing.JPanel();
        pnlScroll = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(700, 300));
        setPreferredSize(new java.awt.Dimension(700, 400));
        setLayout(new java.awt.BorderLayout());

        txtEmpty.setColumns(20);
        txtEmpty.setFont(new java.awt.Font("EmojiOne", 0, 13)); // NOI18N
        txtEmpty.setRows(5);
        pnlEmpty.setViewportView(txtEmpty);

        add(pnlEmpty, java.awt.BorderLayout.CENTER);

        pnlMessage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Message", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 18))); // NOI18N
        pnlMessage.setPreferredSize(new java.awt.Dimension(500, 120));
        pnlMessage.setLayout(new java.awt.GridLayout(1, 0));

        txtMessage.setColumns(20);
        txtMessage.setFont(new java.awt.Font("EmojiOne", 0, 13)); // NOI18N
        txtMessage.setRows(5);
        txtMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMessageKeyReleased(evt);
            }
        });
        pnlScroll.setViewportView(txtMessage);

        pnlMessage.add(pnlScroll);

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        pnlMessage.add(btnSend);

        add(pnlMessage, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        if (txtMessage.getText().trim().length() == 0) {
            return;
        }
        try {
            byte[] utf8bytes = txtMessage.getText().getBytes("UTF-8");
            dos.write(utf8bytes);
            dos.write(13);
            dos.write(10);
            dos.flush();
            this.txtEmpty.append("\n" + sender + ": " + txtMessage.getText());
            txtMessage.setText("");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void txtMessageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMessageKeyReleased
        String str = txtMessage.getText();
        if (str.length() >= 2) {
            boolean check2 = false, check3 = false;
            String emojiString2 = str.substring(str.length() - 2);
            String emojiString3 ="";
            if (str.length() >= 3) {
                emojiString3 = str.substring(str.length() - 3);
            }
            String emoji = "", substr = "";
            switch (emojiString3) {
                case ">:(":
                    emoji = new String(Character.toChars(0x1F616));
                    check3 = true;
                    break;
                case ":'(":
                    emoji = new String(Character.toChars(0x1F622));
                    check3 = true;
                    break;
                case "3:)":
                    emoji = new String(Character.toChars(0x1F608));
                    check3 = true;
                    break;
                case "O:)":
                    emoji = new String(Character.toChars(0x1F607));
                    check3 = true;
                    break;
                case "-_-":
                    emoji = new String(Character.toChars(0x1F611));
                    check3 = true;
                    break;
            }
            if (check3) {
                substr = str.substring(0, str.length() - 3);
                substr += emoji;
                txtMessage.setText(substr);
            } else {
                switch (emojiString2) {
                    case ":)":
                        emoji = new String(Character.toChars(0x263A));
                        check2 = true;
                        break;
                    case ":D":
                        emoji = new String(Character.toChars(0x1F600));
                        check2 = true;
                        break;
                    case "=)":
                        emoji = new String(Character.toChars(0x1F603));
                        check2 = true;
                        break;
                    case ":(":
                        emoji = new String(Character.toChars(0x1F61E));
                        check2 = true;
                        break;
                    case ":P":
                        emoji = new String(Character.toChars(0x1F61B));
                        check2 = true;
                        break;
                    case ":O":
                        emoji = new String(Character.toChars(0x1F62E));
                        check2 = true;
                        break;
                    case ";)":
                        emoji = new String(Character.toChars(0x1F609));
                        check2 = true;
                        break;
                    case "B)":
                        emoji = new String(Character.toChars(0x1F60E));
                        check2 = true;
                        break;
                    case ":/":
                        emoji = new String(Character.toChars(0x1F615));
                        check2 = true;
                        break;
                    case ":|":
                        emoji = new String(Character.toChars(0x1F610));
                        check2 = true;
                        break;
                    case ":*":
                        emoji = new String(Character.toChars(0x1F617));
                        check2 = true;
                        break;
                    case ";*":
                        emoji = new String(Character.toChars(0x1F618));
                        check2 = true;
                        break;
                    case "<3":
                        emoji = new String(Character.toChars(0x2764));
                        check2 = true;
                        break;

                }

                if (check2) {
                    substr = str.substring(0, str.length() - 2);
                    substr += emoji;
                    txtMessage.setText(substr);
                }
            }
        }
    }//GEN-LAST:event_txtMessageKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JScrollPane pnlEmpty;
    private javax.swing.JPanel pnlMessage;
    private javax.swing.JScrollPane pnlScroll;
    private javax.swing.JTextArea txtEmpty;
    private javax.swing.JTextArea txtMessage;
    // End of variables declaration//GEN-END:variables
}
