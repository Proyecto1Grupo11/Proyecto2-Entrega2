package interfaz;
import javax.swing.*;

import logica.AdminGeneral;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazModificarSeguro extends JFrame {
	private AdminGeneral adminGeneral; 
    public InterfazModificarSeguro() {
        super("Modificar Seguro");
        this.adminGeneral = adminGeneral;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        
        JLabel labelNombreSeguro = new JLabel("Ingrese el nombre del seguro que desea modificar:");
        JTextField textFieldNombreSeguro = new JTextField();
        textFieldNombreSeguro.setPreferredSize(new Dimension(300, 25));

        
        JLabel labelNuevoNombre = new JLabel("Ingrese el nuevo nombre del seguro:");
        JTextField textFieldNuevoNombre = new JTextField();
        textFieldNuevoNombre.setPreferredSize(new Dimension(300, 25));

        
        JLabel labelNuevaTarifa = new JLabel("Ingrese la nueva tarifa del seguro:");
        JTextField textFieldNuevaTarifa = new JTextField();
        textFieldNuevaTarifa.setPreferredSize(new Dimension(300, 25));

        
        JButton btnModificarSeguro = new JButton("Modificar Seguro");

        
        btnModificarSeguro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String nombreSeguro = textFieldNombreSeguro.getText();
                String nuevoNombre = textFieldNuevoNombre.getText();
                int nuevaTarifa = Integer.parseInt(textFieldNuevaTarifa.getText());

                
                adminGeneral.modificarSeguro(nombreSeguro, nuevoNombre, nuevaTarifa);
                dispose();
            }
        });

        
        panelPrincipal.add(labelNombreSeguro);
        panelPrincipal.add(textFieldNombreSeguro);

        panelPrincipal.add(labelNuevoNombre);
        panelPrincipal.add(textFieldNuevoNombre);

        panelPrincipal.add(labelNuevaTarifa);
        panelPrincipal.add(textFieldNuevaTarifa);

        
        JPanel panelEspacio = new JPanel();
        panelEspacio.setPreferredSize(new Dimension(400, 10));
        panelPrincipal.add(panelEspacio);

        panelPrincipal.add(btnModificarSeguro);

        setContentPane(panelPrincipal);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}