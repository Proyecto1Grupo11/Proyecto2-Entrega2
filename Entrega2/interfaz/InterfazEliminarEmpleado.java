package interfaz;

import javax.swing.*;

import logica.AdminSede;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazEliminarEmpleado extends JFrame {
	private static AdminSede adminSede;

    public InterfazEliminarEmpleado(AdminSede adminSede) {
        super("Eliminar Empleado");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.adminSede = adminSede;

        JPanel panelPrincipal = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel label = new JLabel("Ingrese el nombre del empleado que desea eliminar:");
        JTextField textField = new JTextField();

        JButton btnEliminar = new JButton("Eliminar");
   
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreEmpleado = textField.getText();
                adminSede.deleteEmpleado(nombreEmpleado);

            }
        });


        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 10, 10, 10);
        panelPrincipal.add(label, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panelPrincipal.add(textField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        panelPrincipal.add(btnEliminar, gbc);


        setContentPane(panelPrincipal);
        setSize(400, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}