package interfaz;
import javax.swing.*;

import logica.AdminGeneral;
import logica.Estados;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazAñadirVehiculo extends JFrame {
	private AdminGeneral adminGeneral;
    public InterfazAñadirVehiculo() {
        super("Añadir Vehículo");
        this.adminGeneral = adminGeneral;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

       
        JLabel labelCategoria = new JLabel("Ingrese la categoría del vehículo:");
        JTextField textFieldCategoria = new JTextField();
        textFieldCategoria.setPreferredSize(new Dimension(300, 25));

        
        JLabel labelPlaca = new JLabel("Ingrese la placa del vehículo:");
        JTextField textFieldPlaca = new JTextField();
        textFieldPlaca.setPreferredSize(new Dimension(300, 25));

        
        JLabel labelMarca = new JLabel("Ingrese la marca del vehículo:");
        JTextField textFieldMarca = new JTextField();
        textFieldMarca.setPreferredSize(new Dimension(300, 25));

        
        JLabel labelModelo = new JLabel("Ingrese el modelo del vehículo:");
        JTextField textFieldModelo = new JTextField();
        textFieldModelo.setPreferredSize(new Dimension(300, 25));

        
        JLabel labelColor = new JLabel("Ingrese el color del vehículo:");
        JTextField textFieldColor = new JTextField();
        textFieldColor.setPreferredSize(new Dimension(300, 25));

        
        JLabel labelTransmision = new JLabel("Ingrese el tipo de transmisión del vehículo:");
        JTextField textFieldTransmision = new JTextField();
        textFieldTransmision.setPreferredSize(new Dimension(300, 25));

       
        JLabel labelCodigoSede = new JLabel("Ingrese el código de sede:");
        JTextField textFieldCodigoSede = new JTextField();
        textFieldCodigoSede.setPreferredSize(new Dimension(300, 25));

        
        JButton btnAñadirVehiculo = new JButton("Añadir Vehículo");

        
        btnAñadirVehiculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String categoria = textFieldCategoria.getText();
                String placa = textFieldPlaca.getText();
                String marca = textFieldMarca.getText();
                String modelo = textFieldModelo.getText();
                String color = textFieldColor.getText();
                String transmision = textFieldTransmision.getText();
                String codigoSede = textFieldCodigoSede.getText();

                adminGeneral.nuevoVehiculo(categoria, placa, marca, codigoSede, modelo, color, transmision, Estados.DISPONIBLE, codigoSede);

                dispose();
            }
        });

        panelPrincipal.add(labelCategoria);
        panelPrincipal.add(textFieldCategoria);

        panelPrincipal.add(labelPlaca);
        panelPrincipal.add(textFieldPlaca);

        panelPrincipal.add(labelMarca);
        panelPrincipal.add(textFieldMarca);

        panelPrincipal.add(labelModelo);
        panelPrincipal.add(textFieldModelo);

        panelPrincipal.add(labelColor);
        panelPrincipal.add(textFieldColor);

        panelPrincipal.add(labelTransmision);
        panelPrincipal.add(textFieldTransmision);

        panelPrincipal.add(labelCodigoSede);
        panelPrincipal.add(textFieldCodigoSede);

        JPanel panelEspacio = new JPanel();
        panelEspacio.setPreferredSize(new Dimension(400, 10));
        panelPrincipal.add(panelEspacio);

        panelPrincipal.add(btnAñadirVehiculo);

        setContentPane(panelPrincipal);
        setSize(400, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}