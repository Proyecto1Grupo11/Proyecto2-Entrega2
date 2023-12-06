package interfaz;
import javax.swing.*;

import logica.AdminGeneral;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazEliminarSede extends JFrame {
	private AdminGeneral adminGeneral;
    public InterfazEliminarSede() {
        super("Eliminar Sede");
        this.adminGeneral = adminGeneral;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        
        JLabel labelCodigoSede = new JLabel("Ingrese el código de la sede que desea eliminar:");
        JTextField textFieldCodigoSede = new JTextField();
        textFieldCodigoSede.setPreferredSize(new Dimension(300, 25));

        
        JButton btnEliminarSede = new JButton("Eliminar Sede");

        
        btnEliminarSede.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigoSede = textFieldCodigoSede.getText();
                adminGeneral.eliminarSedes(codigoSede);
                dispose();
            }
        });

        
        panelPrincipal.add(labelCodigoSede);
        panelPrincipal.add(textFieldCodigoSede);

        
        JPanel panelEspacio = new JPanel();
        panelEspacio.setPreferredSize(new Dimension(400, 10));
        panelPrincipal.add(panelEspacio);

        panelPrincipal.add(btnEliminarSede);

        setContentPane(panelPrincipal);
        setSize(500, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}