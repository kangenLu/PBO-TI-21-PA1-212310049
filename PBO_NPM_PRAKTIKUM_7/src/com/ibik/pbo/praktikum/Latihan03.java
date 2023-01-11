package com.ibik.pbo.praktikum;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Latihan03 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Latihan03() {
        // menampilkan jendela pada layar
        setVisible(true);
        // menentukan posisi jendela pada tengah layar
        pack();
        setLocationRelativeTo(null);
        // menentukan ukuran width dan height ada jendela
        setSize(500, 500);
        // berikan judul pada jendela
        setTitle("Contoh Window Frame");
        // menutup jendela secara penuh
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GenerateUI(this);
    }

    public static void main(String[] args) {
        new Latihan03();
    }

    private void GenerateUI(Latihan03 frame) {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        frame.setContentPane(mainPanel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        mainPanel.add(panel1, BorderLayout.NORTH);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(22, 23, 80, 16);
        panel1.add((lblEmail));

        final JTextField textEmail = new JTextField();
        textEmail.setBounds(105, 18, 169, 30);
        panel1.add(textEmail);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(22, 69, 61, 16);
        panel1.add(lblPassword);

        final JPasswordField textPassword = new JPasswordField();
        textPassword.setBounds(105, 64, 169, 30);
        panel1.add(textPassword);

        JCheckBox chkRemember = new JCheckBox("Remember Account ?");
        chkRemember.setBounds(105, 100, 169, 40);
        panel1.add(chkRemember);

        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(105, 150, 169, 40);
        ActionListener actionSubmit = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String myEmail = "MelaniAlexandria@gmail.com";
                String myName = "Melani";
                String myPass = "085280295301";

                String inputPass = new String(textPassword.getPassword());

                if (textEmail.getText().isEmpty() || inputPass.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Silakan mengisi data dengan benar", "Alert",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    if (!textEmail.getText().equals(myEmail) && !inputPass.equals(myPass)) {
                        JOptionPane.showMessageDialog(null, "Data yang anda masukan salah", "Alert",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Selamat Datang " + myName, "Success!",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        };
        btnSubmit.addActionListener(actionSubmit);
        panel1.add(btnSubmit);

        JLabel lblCopyright = new JLabel("copyright IBIK @ 2022", SwingConstants.CENTER);
        lblCopyright.setBackground(Color.BLUE);
        lblCopyright.setSize(300, 50);
        mainPanel.add(lblCopyright, BorderLayout.SOUTH);

        frame.add(panel1);
    }
}