package interfaz;
import logica.Empleado;
import logica.Roles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazGenerarEntrega extends JFrame {
    private Empleado empleado;  

    public InterfazGenerarEntrega(Empleado empleado) {
        super("Generar Entrega");
        this.empleado = empleado; 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        
        JLabel labelCodigoReserva = new JLabel("Ingrese el código de la reserva");
        JTextField textFieldCodigoReserva = new JTextField();

        
        textFieldCodigoReserva.setPreferredSize(new Dimension(200, 25));

        
        JButton btnGenerarEntrega = new JButton("Generar Entrega");

        
        btnGenerarEntrega.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String codigoReserva = textFieldCodigoReserva.getText();
                empleado.generarEntrega(codigoReserva);  

                dispose();
            }
        });

        
        panelPrincipal.add(labelCodigoReserva);
        panelPrincipal.add(textFieldCodigoReserva);

        
        JPanel panelEspacio = new JPanel();
        panelEspacio.setPreferredSize(new Dimension(300, 10));
        panelPrincipal.add(panelEspacio);

        panelPrincipal.add(btnGenerarEntrega);

        setContentPane(panelPrincipal);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}