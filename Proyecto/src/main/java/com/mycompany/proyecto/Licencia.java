package com.mycompany.proyecto;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Licencia extends JFrame implements ActionListener, ChangeListener {

    private JLabel label1, label2, label3;
    private JCheckBox check1;
    private JButton boton1, boton2;
    private JScrollPane scrollpane1;
    JTextArea textarea1;

    public Licencia() {
        setLayout(null);
        setTitle("Licencia de uso");

        label1 = new JLabel();//LA GLORIA, COMO PONER ICONOS A MANO PURO CODIGO HIJOS DE PUTA
        ImageIcon logo = new ImageIcon("C:\\Users\\Isaac\\Desktop\\Proyecto\\Proyecto\\src\\main\\java\\com\\mycompany\\proyecto\\icon.png");
        this.setIconImage(logo.getImage());
        label1.setIcon(new ImageIcon("C:\\Users\\Isaac\\Desktop\\Proyecto\\Proyecto\\src\\main\\java\\com\\mycompany\\proyecto\\icon.png"));
        Component add = add(label1);
        add(add);

        label2 = new JLabel("TÉRMINOS Y CONDICIONES");
        label2.setBounds(215, 5, 200, 30);
        label2.setFont(new Font("Andale Mono", 1, 14));
        label2.setForeground(new Color(0, 0, 0));
        add(label2);

        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setFont(new Font("Andale Mono", 0, 9));
        textarea1.setText("\n\n      TÉRMINOS Y CONDICIONES\n"
                + "            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE ISAAC PROGRAMING.\n"
                + "            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DE LAS INTERFACES GRÁFICAS.\n"
                + "            C.  ISAAC PROGRAMING NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE.\n"
                + "\n"
                + "            LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE\n"
                + "           (ISAAC PROGRAMING Y EL AUTOR ISAAC PADILLA), NO SE RESPONSABILIZAN DEL USO QUE USTED\n"
                + "            HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)\n"
                + "            SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE.\n"
                + "\n"
                + "            PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE"
                + "\n            http://www.tiktok.com/kaspercalestenicns");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10, 40, 575, 200);
        add(scrollpane1);

        check1 = new JCheckBox("Yo acepto");
        check1.setBounds(10, 250, 300, 30);
        check1.addChangeListener((ChangeListener) this);
        add(check1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10, 290, 100, 30);
        boton1.setEnabled(false);
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("No acepto");
        boton2.setBounds(120, 290, 100, 30);
        boton2.setEnabled(true);
        boton2.addActionListener(this);
        add(boton2);

        label2 = new JLabel();
        Icon icon = new ImageIcon("C:\\Users\\Isaac\\Desktop\\Proyecto\\Proyecto\\src\\main\\java\\com\\mycompany\\proyecto\\coca-cola.png");
        label2.setIcon(icon);
        Component add1 = add(label2);
        label2.setBounds(315, 135, 300, 300);
        add(label2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }

}
