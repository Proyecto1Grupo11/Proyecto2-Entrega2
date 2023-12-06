package interfaz;
import javax.swing.*;

import logica.AdminGeneral;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazEliminarAdministradorSede extends JFrame {
	private AdminGeneral adminGeneral;
    public InterfazEliminarAdministradorSede() {
        super("Eliminar Administrador de Sede");
        this.adminGeneral = adminGeneral;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        
        JLabel labelNombreUsuario = new JLabel("Ingrese el username del administrador que desea borrar:");
        JTextField textFieldNombreUsuario = new JTextField();
        textFieldNombreUsuario.setPreferredSize(new Dimension(300, 25));

        
        JLabel labelCodigoSede = new JLabel("Ingrese el código de la sede a la que pertenece el administrador:");
        JTextField textFieldCodigoSede = new JTextField();
        textFieldCodigoSede.setPreferredSize(new Dimension(300, 25));

        
        JButton btnEliminarAdministradorSede = new JButton("Eliminar Administrador de Sede");

        
        btnEliminarAdministradorSede.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String nombreUsuario = textFieldNombreUsuario.getText();
                String codigoSede = textFieldCodigoSede.getText();

                adminGeneral.eliminarAdminSede(nombreUsuario, codigoSede);

                
                dispose();
            }
        });

        
        panelPrincipal.add(labelNombreUsuario);
        panelPrincipal.add(textFieldNombreUsuario);

        panelPrincipal.add(labelCodigoSede);
        panelPrincipal.add(textFieldCodigoSede);

        
        JPanel panelEspacio = new JPanel();
        panelEspacio.setPreferredSize(new Dimension(400, 10));
        panelPrincipal.add(panelEspacio);

        panelPrincipal.add(btnEliminarAdministradorSede);

        setContentPane(panelPrincipal);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}