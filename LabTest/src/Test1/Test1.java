/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Laptop88
 */
public class Test1 extends JFrame implements ActionListener {

    JPanel pn, pn1, pn2, pn3;
    JLabel lb1, lb2, lb3, lb;
    JTextField txt1;
    JTextArea txta;
    JButton ok, reset, exit;
    Choice ch;

    Test1(String title) {
        super(title);
        GUI();
    }

    public void GUI() {
        lb = new JLabel("Minh Họa Tách Số");
        lb1 = new JLabel("Nhập số: ");
        lb2 = new JLabel("Tách theo chiều: ");
        lb3 = new JLabel("Kết quả:");

        ch = new Choice();
        ch.add("Phải -> Trái");
        ch.add("Trái -> Phải");

        txt1 = new JTextField();
        txta = new JTextArea();

        ok = new JButton("OK");
        reset = new JButton("Result");
        exit = new JButton("Exit");

        ok.addActionListener(this);
        reset.addActionListener(this);
        exit.addActionListener(this);

        pn = new JPanel(new GridLayout(4, 1));
        pn1 = new JPanel(new FlowLayout());
        pn2 = new JPanel(new GridLayout(3, 1));
        pn3 = new JPanel(new FlowLayout());

        pn1.add(lb);

        pn2.add(lb1);
        pn2.add(txt1);
        pn2.add(lb2);
        pn2.add(ch);
        pn2.add(lb3);
        pn2.add(txta);

        pn3.add(ok);
        pn3.add(reset);
        pn3.add(exit);

        pn.add(pn1);
        pn.add(pn2);
        pn.add(pn3);

        add(pn);

        setSize(500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        show();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ok) {
            String nhapso = txt1.getText().trim();

            String choice = ch.getSelectedItem().toString();
            if (choice.equalsIgnoreCase("Phải -> Trái")) {
                String kq = "";
                for (int i = nhapso.length() - 1; i >= 0; i--) {
                    if (i != 0) {
                        kq = kq + nhapso.charAt(i) + ',';
                    } else {
                        kq = kq + nhapso.charAt(i);
                    }
                    txta.setText(kq);
                }
            } else if (choice.equalsIgnoreCase("Trái -> Phải")) {
                String kq = "";
                for (int i = 0; i < nhapso.length(); i++) {
                    if (i != nhapso.length() - 1) {
                        kq = kq + nhapso.charAt(i) + ',';
                    } else {
                        kq = kq + nhapso.charAt(i);
                    }
                    txta.setText(kq);
                }
            }
        }
        if (e.getSource() == reset) {
            txta.setText("");
            txt1.setText("");
        }
        if (e.getSource() == exit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Test1 ae = new Test1("Basic Arithmetic Operations");
    }
}
