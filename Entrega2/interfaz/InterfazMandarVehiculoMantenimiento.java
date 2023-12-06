package interfaz;
import javax.swing.*;

import logica.Empleado;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazMandarVehiculoMantenimiento extends JFrame {

    private Empleado empleado; 

    public InterfazMandarVehiculoMantenimiento(Empleado empleado) {
        super("Mandar Vehículo a Mantenimiento");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.empleado = empleado;
        setContentPane(new PanelMandarVehiculoMantenimiento());
        setSize(300, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    class PanelMandarVehiculoMantenimiento extends JPanel {

        public PanelMandarVehiculoMantenimiento() {
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

            JLabel labelPlaca = new JLabel("Escriba la placa del vehículo:");
            JTextField textFieldPlaca = new JTextField();

            JButton btnMandarMantenimiento = new JButton("Mandar a Mantenimiento");

            btnMandarMantenimiento.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    String placa = textFieldPlaca.getText();
                    empleado.mandarMantenimiento(placa); 
                    dispose();
                }
            });

        add(labelPlaca);
        add(textFieldPlaca);
        add(btnMandarMantenimiento);
       
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Añade un espacio alrededor del panel
        }
    }
}