package interfaz;
import javax.swing.*;

import logica.AdminSede;
import logica.Roles;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazCrearNuevoEmpleado extends JFrame {
	private AdminSede adminSede; 

    public InterfazCrearNuevoEmpleado(AdminSede adminSede) {
        super("Crear Nuevo Empleado");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.adminSede = adminSede;

        JPanel panelPrincipal = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JLabel labelNombreUsuario = new JLabel("Ingrese el nombre del usuario:");
        JTextField textFieldNombreUsuario = new JTextField();
        textFieldNombreUsuario.setPreferredSize(new Dimension(300, 25));

        JLabel labelContraseña = new JLabel("Ingrese su contraseña:");
        JTextField textFieldContraseña = new JTextField();
        textFieldContraseña.setPreferredSize(new Dimension(300, 25));

        JButton btnCrearEmpleado = new JButton("Crear Nuevo Empleado");

        btnCrearEmpleado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreUsuario = textFieldNombreUsuario.getText();
                String contraseña = textFieldContraseña.getText();

                adminSede.addEmpleado(nombreUsuario, contraseña, Roles.EMPLEADO);

                dispose();
            }
        });

        
        panelPrincipal.add(labelNombreUsuario);
        panelPrincipal.add(textFieldNombreUsuario);

        panelPrincipal.add(labelContraseña);
        panelPrincipal.add(textFieldContraseña);

        JPanel panelEspacio = new JPanel();
        panelEspacio.setPreferredSize(new Dimension(400, 10));
        panelPrincipal.add(panelEspacio);

        panelPrincipal.add(btnCrearEmpleado);

        setContentPane(panelPrincipal);
        setSize(400, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}