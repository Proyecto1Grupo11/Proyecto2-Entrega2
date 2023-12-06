package interfaz;
import javax.swing.*;

import logica.Empleado;
import logica.Roles;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazAñadirConductorAdicional extends JFrame {
	 private Empleado empleado;

	    public InterfazAñadirConductorAdicional(Empleado empleado) {
	        super("Añadir Conductor Adicional");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.empleado = empleado;

        
        JPanel panelPrincipal = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

       
        JLabel labelRutaLicencia = new JLabel("Ingrese la ruta de la imagen de su licencia:");
        JTextField textFieldRutaLicencia = new JTextField();
        textFieldRutaLicencia.setPreferredSize(new Dimension(300, 25));

        
        JLabel labelCodigoSedeReserva = new JLabel("Ingrese el código de la sede donde se realizó la reserva:");
        JTextField textFieldCodigoSedeReserva = new JTextField();
        textFieldCodigoSedeReserva.setPreferredSize(new Dimension(300, 25));

       
        JLabel labelCodigoReserva = new JLabel("Ingrese el código de reserva:");
        JTextField textFieldCodigoReserva = new JTextField();
        textFieldCodigoReserva.setPreferredSize(new Dimension(300, 25));

        
        JButton btnAñadirConductorAdicional = new JButton("Añadir Conductor Adicional");

        
        btnAñadirConductorAdicional.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String rutaLicencia = textFieldRutaLicencia.getText();
                String codigoSedeReserva = textFieldCodigoSedeReserva.getText();
                String codigoReserva = textFieldCodigoReserva.getText();
                empleado.addConductorAdicional(rutaLicencia, codigoSedeReserva, codigoReserva);
                System.out.println("Añadir conductor adicional con licencia en ruta: " + rutaLicencia);
                System.out.println("Reserva realizada en sede con código: " + codigoSedeReserva);
                System.out.println("Reserva con código: " + codigoReserva);

                
                dispose();
            }
        });

        
        panelPrincipal.add(labelRutaLicencia);
        panelPrincipal.add(textFieldRutaLicencia);

        panelPrincipal.add(labelCodigoSedeReserva);
        panelPrincipal.add(textFieldCodigoSedeReserva);

        panelPrincipal.add(labelCodigoReserva);
        panelPrincipal.add(textFieldCodigoReserva);

        JPanel panelEspacio = new JPanel();
        panelEspacio.setPreferredSize(new Dimension(400, 10));
        panelPrincipal.add(panelEspacio);

        panelPrincipal.add(btnAñadirConductorAdicional);

        setContentPane(panelPrincipal);
        setSize(350, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}