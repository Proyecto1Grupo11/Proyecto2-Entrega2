package interfaz;
import javax.swing.*;

import logica.AdminGeneral;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazAñadirSede extends JFrame {
	private AdminGeneral adminGeneral;
    public InterfazAñadirSede() {
        super("Añadir Sede");
        this.adminGeneral = adminGeneral;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        
        JLabel labelCodigoSede = new JLabel("Ingrese el código de la sede:");
        JTextField textFieldCodigoSede = new JTextField();
        textFieldCodigoSede.setPreferredSize(new Dimension(300, 25));

        
        JLabel labelUbicacion = new JLabel("Ingrese la ubicación de la sede:");
        JTextField textFieldUbicacion = new JTextField();
        textFieldUbicacion.setPreferredSize(new Dimension(300, 25));

        
        JLabel labelHorario = new JLabel("Ingrese el horario de atención de la sede:");
        JTextField textFieldHorario = new JTextField();
        textFieldHorario.setPreferredSize(new Dimension(300, 25));

        
        JButton btnAñadirSede = new JButton("Añadir Sede");

        
        btnAñadirSede.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigoSede = textFieldCodigoSede.getText();
                String ubicacion = textFieldUbicacion.getText();
                String horario = textFieldHorario.getText();
                adminGeneral.addSede(codigoSede, ubicacion, horario);

                dispose();
            }
        });

        panelPrincipal.add(labelCodigoSede);
        panelPrincipal.add(textFieldCodigoSede);

        panelPrincipal.add(labelUbicacion);
        panelPrincipal.add(textFieldUbicacion);

        panelPrincipal.add(labelHorario);
        panelPrincipal.add(textFieldHorario);

        // Espacio en blanco para centrar el botón
        JPanel panelEspacio = new JPanel();
        panelEspacio.setPreferredSize(new Dimension(400, 10));
        panelPrincipal.add(panelEspacio);

        panelPrincipal.add(btnAñadirSede);

        setContentPane(panelPrincipal);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}