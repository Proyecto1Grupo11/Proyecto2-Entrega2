package interfaz;
import javax.swing.*;

import logica.AdminGeneral;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazBorrarVehiculo extends JFrame {
	private AdminGeneral adminGeneral;
    public InterfazBorrarVehiculo() {
    	
        super("Borrar Vehículo");
        this.adminGeneral = adminGeneral;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

       
        JLabel labelPlaca = new JLabel("Ingrese la placa del vehículo que desea eliminar:");
        JTextField textFieldPlaca = new JTextField();
        textFieldPlaca.setPreferredSize(new Dimension(300, 25));

        
        JLabel labelCodigoSede = new JLabel("Ingrese el código de la sede:");
        JTextField textFieldCodigoSede = new JTextField();
        textFieldCodigoSede.setPreferredSize(new Dimension(300, 25));

        
        JButton btnBorrarVehiculo = new JButton("Borrar Vehículo");

        
        btnBorrarVehiculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String placa = textFieldPlaca.getText();
                String codigoSede = textFieldCodigoSede.getText();

                adminGeneral.borrarVehiculo(placa, codigoSede);

                dispose();
            }
        });

        
        panelPrincipal.add(labelPlaca);
        panelPrincipal.add(textFieldPlaca);

        panelPrincipal.add(labelCodigoSede);
        panelPrincipal.add(textFieldCodigoSede);

        JPanel panelEspacio = new JPanel();
        panelEspacio.setPreferredSize(new Dimension(400, 10));
        panelPrincipal.add(panelEspacio);

        panelPrincipal.add(btnBorrarVehiculo);

        setContentPane(panelPrincipal);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}