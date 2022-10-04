package com.mycompany.proyecto;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Principal extends JFrame implements ActionListener {

    private JMenuBar mb;
    private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
    private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
    private JLabel label2, labelIcono, labelLogo, labelBienvenido, labelTitle, labelNombre, labelApaterno, labelAmaterno,
            labelDepartamento, labelAntiguedad, labelResultado, labelFooter;
    private JComboBox comboDepartamento, comboAntiguedad;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    private JTextField txtNombreTrabajador, txtApaternoTrabajador, txtAmaternoTrabajador;

    public Principal() {
        setLayout(null);
        setTitle("Pantalla principal");
        getContentPane().setBackground(new Color(255, 0, 0));

        labelIcono = new JLabel();//LA GLORIA, COMO PONER ICONOS A MANO PURO CODIGO HIJOS DE PUTA
        ImageIcon logo = new ImageIcon("C:\\Users\\Isaac\\Desktop\\Proyecto\\Proyecto\\src\\main\\java\\com\\mycompany\\proyecto\\icon.png");
        this.setIconImage(logo.getImage());
        labelIcono.setIcon(new ImageIcon("C:\\Users\\Isaac\\Desktop\\Proyecto\\Proyecto\\src\\main\\java\\com\\mycompany\\proyecto\\icon.png"));
        Component add = add(labelIcono);
        add(add);

        mb = new JMenuBar();
        mb.setBackground(new Color(255, 0, 0));
        setJMenuBar(mb);

        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(255, 0, 0));
        menuOpciones.setFont(new Font("Andale Mono", 1, 14));
        menuOpciones.setForeground(new Color(255, 255, 255));
        mb.add(menuOpciones);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(255, 0, 0));
        menuCalcular.setFont(new Font("Andale Mono", 1, 14));
        menuCalcular.setForeground(new Color(255, 255, 255));
        mb.add(menuCalcular);

        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setBackground(new Color(255, 0, 0));
        menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
        menuAcercaDe.setForeground(new Color(255, 255, 255));
        mb.add(menuAcercaDe);

        menuColorFondo = new JMenu("Color de fondo");
        menuColorFondo.setBackground(new Color(225, 0, 0));
        menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
        menuColorFondo.setForeground(new Color(255, 255, 255));
        mb.add(menuOpciones);

        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setFont(new Font("Andale Mono", 1, 14));
        miCalculo.setBackground(new Color(255, 225, 225));
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);

        miRojo = new JMenuItem("Rojo");
        miRojo.setBackground(new Color(255, 225, 225));
        miRojo.setFont(new Font("Andale Mono", 1, 14));
        menuColorFondo.add(miRojo);
        miRojo.addActionListener(this);

        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font("Andale Mono", 1, 14));
        miNegro.setBackground(new Color(255, 225, 225));
        menuColorFondo.add(miNegro);
        miNegro.addActionListener(this);

        miRojo = new JMenuItem("Rojo");
        miRojo.setFont(new Font("Andale Mono", 1, 14));
        miRojo.setBackground(new Color(255, 225, 225));
        menuColorFondo.add(miRojo);
        miRojo.addActionListener(this);

        miMorado = new JMenuItem("Morado");
        miMorado.setFont(new Font("Andale Mono", 1, 14));
        miMorado.setBackground(new Color(255, 225, 225));
        menuColorFondo.add(miMorado);
        miMorado.addActionListener(this);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono", 1, 14));
        miNuevo.setBackground(new Color(255, 225, 225));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);

        miElCreador = new JMenuItem("El creador");
        miElCreador.setFont(new Font("Andale Mono", 1, 14));
        miElCreador.setBackground(new Color(255, 225, 225));
        menuAcercaDe.add(miElCreador);
        miElCreador.addActionListener(this);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono", 1, 14));
        miSalir.setBackground(new Color(255, 225, 225));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);

        label2 = new JLabel();
        Icon icon = new ImageIcon("C:\\Users\\Isaac\\Desktop\\Proyecto\\Proyecto\\src\\main\\java\\com\\mycompany\\proyecto\\logo-coca.png");
        label2.setIcon(icon);
        Component add1 = add(label2);
        label2.setBounds(5, 5, 250,100);
        add(label2);

        labelBienvenido = new JLabel("Bienvenido");
        labelBienvenido.setBounds(280, 30, 300, 50);
        labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
        labelBienvenido.setBackground(new Color(255, 255, 255));
        add(labelBienvenido);

        labelTitle = new JLabel("Datos del trabajar para el cálculo de vacaciones");
        labelTitle.setBounds(45, 140, 900, 25);
        labelTitle.setFont(new Font("Andale Mono", 0, 24));
        labelBienvenido.setBackground(new Color(255, 255, 255));
        add(labelTitle);

        labelNombre = new JLabel("Nombre completo");
        labelNombre.setBounds(25, 188, 150, 25);
        labelNombre.setFont(new Font("Andale Mono", 1, 12));
        labelNombre.setBackground(new Color(255, 255, 255));
        add(labelNombre);

        txtNombreTrabajador = new JTextField();
        txtNombreTrabajador.setBounds(25, 213, 150, 25);
        txtNombreTrabajador.setBackground(new Color(224, 224, 224));

        txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtNombreTrabajador.setForeground(new java.awt.Color(255, 0, 0));
        add(txtNombreTrabajador);

        labelApaterno = new JLabel("Apellido paterno");
        labelApaterno.setBounds(25, 248, 180, 25);
        labelApaterno.setFont(new Font("Andale Mono", 1, 12));
        labelApaterno.setBackground(new Color(255, 255, 255));
        add(labelApaterno);

        txtApaternoTrabajador = new JTextField();
        txtApaternoTrabajador.setBounds(25, 334, 150, 25);
        txtApaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
        txtApaternoTrabajador.setForeground(new java.awt.Color(255, 0, 0));
        add(txtApaternoTrabajador);

        labelAmaterno = new JLabel("Apellido materno");
        labelAmaterno.setBounds(25, 308, 180, 25);
        labelAmaterno.setFont(new Font("Andale Mono", 1, 12));
        labelAmaterno.setBackground(new Color(255, 255, 255));
        add(labelAmaterno);

        txtAmaternoTrabajador = new JTextField();
        txtAmaternoTrabajador.setBounds(25, 334, 150, 25);
        txtAmaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
        txtAmaternoTrabajador.setForeground(new java.awt.Color(255, 0, 0));
        add(txtAmaternoTrabajador);

        labelDepartamento = new JLabel("Seleccione el departamento");
        labelDepartamento.setBounds(220, 188, 180, 25);
        labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
        labelDepartamento.setBackground(new Color(255, 255, 255));
        add(labelDepartamento);

        comboDepartamento = new JComboBox();
        comboDepartamento.setBounds(220, 213, 220, 25);
        comboDepartamento.setBackground(new java.awt.Color(224, 224, 224));
        comboDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
        comboDepartamento.setForeground(new java.awt.Color(255, 0, 0));
        add(comboDepartamento);
        comboDepartamento.addItem("");
        comboDepartamento.addItem("Atención al cliente");
        comboDepartamento.addItem("Departamento de Logística");
        comboDepartamento.addItem("Departamento de Gerencia");

        labelAntiguedad = new JLabel("Seleccione la antiguedad");
        labelAntiguedad.setBounds(220, 248, 180, 25);
        labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
        labelAntiguedad.setBackground(new Color(255, 255, 255));
        add(labelAntiguedad);

        comboAntiguedad = new JComboBox();
        comboAntiguedad.setBounds(220, 273, 220, 25);
        comboAntiguedad.setBackground(new java.awt.Color(224, 224, 224));
        comboAntiguedad.setForeground(new java.awt.Color(255, 0, 0));
        comboAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("1 año de servicio");
        comboAntiguedad.addItem("2 a 6 años de servicio");
        comboAntiguedad.addItem("7 años o más de servicio");

        labelResultado = new JLabel();
        labelResultado.setBounds(220, 307, 180, 25);
        labelResultado.setFont(new Font("Andale Mono", 1, 12));
        labelResultado.setForeground(new Color(255, 255, 255));
        add(labelResultado);

        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setBackground(new Color(224, 224, 224));
        textarea1.setFont(new Font("Andale Mono", 1, 11));
        textarea1.setForeground(new Color(255, 0, 0));
        textarea1.setText("\n   Aquí aparece el cálculo de las vacaciones: ");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(220, 333, 385, 90);
        add(scrollpane1);

        labelFooter = new JLabel("©2022 The Coca-Cola Company | Todos los derechos reservados");
        labelFooter.setBounds(135, 445, 500, 30);
        labelFooter.setFont(new java.awt.Font("Andale Mono", 1, 12));
        labelFooter.setForeground(new java.awt.Color(255, 255, 255));
        add(labelFooter);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miCalculo) {

        }
        if (e.getSource() == miNegro) {

        }
        if (e.getSource() == miRojo) {

        }
        if (e.getSource() == miMorado) {

        }
        if (e.getSource() == miNuevo) {

        }
        if (e.getSource() == miSalir) {

        }
        if (e.getSource() == miElCreador) {

        }
    }

}
