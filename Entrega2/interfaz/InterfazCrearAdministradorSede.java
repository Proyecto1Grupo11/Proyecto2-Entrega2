package interfaz;
import javax.swing.*;

import logica.AdminGeneral;
import logica.Roles;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazCrearAdministradorSede extends JFrame {
	private AdminGeneral adminGeneral; 
    public InterfazCrearAdministradorSede() {
    	
        super("Crear Nuevo Administrador de Sede");
        this.adminGeneral = adminGeneral;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        
        JLabel labelNombreUsuario = new JLabel("Ingrese el nombre de usuario del nuevo administrador de la sede:");
        JTextField textFieldNombreUsuario = new JTextField();
        textFieldNombreUsuario.setPreferredSize(new Dimension(300, 25));

        JLabel labelContraseña = new JLabel("Ingrese la contraseña del nuevo administrador de la sede:");
        JPasswordField passwordFieldContraseña = new JPasswordField();
        passwordFieldContraseña.setPreferredSize(new Dimension(300, 25));

        
        JLabel labelCodigoSede = new JLabel("Ingrese el código de la sede:");
        JTextField textFieldCodigoSede = new JTextField();
        textFieldCodigoSede.setPreferredSize(new Dimension(300, 25));

        
        JButton btnCrearAdministradorSede = new JButton("Crear Nuevo Administrador de Sede");

        btnCrearAdministradorSede.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String nombreUsuario = textFieldNombreUsuario.getText();
                String contraseña = new String(passwordFieldContraseña.getPassword());
                String codigoSede = textFieldCodigoSede.getText();

                adminGeneral.crearAdminSede(nombreUsuario, contraseña, codigoSede,Roles.ADMINISTRADORSEDE);

                dispose();
            }
        });

        panelPrincipal.add(labelNombreUsuario);
        panelPrincipal.add(textFieldNombreUsuario);

        panelPrincipal.add(labelContraseña);
        panelPrincipal.add(passwordFieldContraseña);

        panelPrincipal.add(labelCodigoSede);
        panelPrincipal.add(textFieldCodigoSede);

        JPanel panelEspacio = new JPanel();
        panelEspacio.setPreferredSize(new Dimension(400, 10));
        panelPrincipal.add(panelEspacio);

        panelPrincipal.add(btnCrearAdministradorSede);

        setContentPane(panelPrincipal);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}