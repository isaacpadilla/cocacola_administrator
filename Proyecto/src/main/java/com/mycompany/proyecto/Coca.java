package com.mycompany.proyecto;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public final class Coca extends JFrame implements ActionListener {

    private JTextField textfield1;
    private JLabel label1, label2, label3, label4, label5;
    private JButton boton1;
    public ImageIcon logo;
    public Image icono;
    static String texto = "";
    static TextField textfieldx; 
    

    public Coca() {

        setLayout(null);

        setTitle("Bienvenido");

        getContentPane().setBackground(new Color(255, 0, 0));
        label1 = new JLabel();//LA GLORIA, COMO PONER ICONOS A MANO PURO CODIGO HIJOS DE PUTA
        ImageIcon logo = new ImageIcon("C:\\Users\\Isaac\\Desktop\\Proyecto\\Proyecto\\src\\main\\java\\com\\mycompany\\proyecto\\icon.png");
        this.setIconImage(logo.getImage());
        label1.setIcon(new ImageIcon("C:\\Users\\Isaac\\Desktop\\Proyecto\\Proyecto\\src\\main\\java\\com\\mycompany\\proyecto\\icon.png"));
        Component add = add(label1);
        add(add);

        label2 = new JLabel("Sistema de control vacacional");
        label2.setBounds(35, 135, 300, 30);
        label2.setFont(new Font("Andale Mono", 3, 18));
        label2.setForeground(new Color(255, 255, 255));
        add(label2);

        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(45, 212, 200, 30);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(new Color(255, 255, 255));
        add(label3);

        label4 = new JLabel("©2022 The Coca-Cola Company");
        label4.setBounds(85, 375, 300, 30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(new Color(255, 255, 255));
        add(label4);

        label5 = new JLabel();
        Icon icon = new ImageIcon("C:\\Users\\Isaac\\Desktop\\Proyecto\\Proyecto\\src\\main\\java\\com\\mycompany\\proyecto\\logo-coca.png");
        label5.setIcon(icon);
        Component add1 = add(label5);
        label5.setBounds(25, 15, 300, 150);
        add(label5);

        textfield1 = new JTextField();
        textfield1.setBounds(45, 240, 255, 25);
        textfield1.setBackground(new Color(224, 224, 224));
        textfield1.setFont(new Font("Andale Mono", 1, 14));
        textfield1.setForeground(new Color(255, 0, 0));
        add(textfield1);

        boton1 = new JButton("Ingresar");
        boton1.setBounds(125, 280, 100, 30);
        boton1.setBackground(new Color(255, 255, 255));
        boton1.setFont(new Font("Andale Mono", 1, 14));
        boton1.setForeground(new Color(255, 0, 0));
        boton1.addActionListener(this);
        add(boton1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            texto = textfield1.getText().trim();
            if (texto.equals("")) {
                System.out.println("Ingresa tu nombre");
                JOptionPane.show.MessageDialog(null,"Ingresa tu usuario");

            } else {
                 this.setVisible(false);
            Licencia ventana = new Licencia();
            ventana.setBounds(0, 0, 620, 380);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setLocationRelativeTo(null);
            }
           

        }

    }
}
