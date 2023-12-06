package interfaz;

import javax.swing.*;

import logica.Empleado;
import logica.Roles;
import logica.Sede;
import logica.Vehiculo;

import java.awt.*;
import java.util.ArrayList;

public class InterfazReporteVehiculoMantenimiento extends JFrame {

    public InterfazReporteVehiculoMantenimiento(Empleado empleado) {
        super("Reporte de Vehículo en Mantenimiento");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new GridLayout(5, 2));

        ArrayList<Vehiculo> carrosMantenimiento = empleado.obtenerCarrosMantenimiento();

        for (Vehiculo vehiculo : carrosMantenimiento) {
            agregarCampo(panelPrincipal, "Placa", vehiculo.getPlaca());
            agregarCampo(panelPrincipal, "Marca", vehiculo.getMarca());
            agregarCampo(panelPrincipal, "Modelo", vehiculo.getModelo());
            agregarCampo(panelPrincipal, "Categoría", vehiculo.getCategoria());
        }

        setContentPane(panelPrincipal);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void agregarCampo(JPanel panel, String etiqueta, String valor) {
        JLabel label = new JLabel(etiqueta);
        JTextField textField = new JTextField(valor);
        textField.setEditable(false);

        panel.add(label);
        panel.add(textField);
    }

}