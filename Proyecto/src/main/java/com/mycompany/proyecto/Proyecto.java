package com.mycompany.proyecto;

import java.awt.TextField;

public class Proyecto {

    static String texto = "";
    static TextField textfieldx;

    public static void main(String[] args) {

        Coca caja = new Coca();
        caja.setBounds(0, 0, 350, 450);
        caja.setVisible(true);
        caja.setLocationRelativeTo(null);

        if (texto.equals("")) {
            System.out.println("Ingresa tu nombre");

        } else {
            caja.setVisible(false);
            Licencia ventana = new Licencia();
            ventana.setBounds(0, 0, 620, 380);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setLocationRelativeTo(null);
        }

    }

    /* Principal xd=new Principal();
        xd.setBounds(0, 0, 640, 535);
        xd.setVisible(true);
        xd.setResizable(false);
        xd.setLocationRelativeTo(null);
     */
}
