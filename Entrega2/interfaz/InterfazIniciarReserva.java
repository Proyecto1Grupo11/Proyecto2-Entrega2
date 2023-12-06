package interfaz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

import logica.Empleado;

public class InterfazIniciarReserva extends JFrame {

    private Empleado empleado;

    public InterfazIniciarReserva(Empleado empleado) {
        super("Iniciar Reserva");
        this.empleado = empleado;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new PanelIniciarReserva());
        setSize(750, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}


class PanelIniciarReserva extends JPanel {
	private Empleado empleado;
    public PanelIniciarReserva() {
        setLayout(new GridLayout(10, 2, 10, 10));

        addLabelAndTextField("Ingrese el código de sede:");
        addLabelAndTextField("Ingrese el tipo de carro:");
        addLabelAndTextField("Ingrese la sede de entrega:");
        addLabelAndTextField("Ingrese la sede de recogida:");
        addLabelAndTextField("Ingrese la fecha y hora de recogida (Año/Mes/Día/Hora/Min/Seg):");
        addLabelAndTextField("Ingrese la fecha y hora de entrega (Año/Mes/Día/Hora/Min/Seg):");
        addLabelAndTextField("Ingrese la placa del vehículo:");
        addLabelAndTextField("Ingrese el nombre de usuario del cliente:");

        JButton btnIniciarReserva = new JButton("Iniciar Reserva");

        btnIniciarReserva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigoSede = getTextFromTextField(0);
                String tipoDeCarro = getTextFromTextField(1);
                String sedeEntrega = getTextFromTextField(2);
                String sedeRecogida = getTextFromTextField(3);
                String fechaHoraRecogida = getTextFromTextField(4);
                String fechaHoraEntrega = getTextFromTextField(5);
                String placaVehiculo = getTextFromTextField(6);
                String usernameCliente = getTextFromTextField(7);

                String mensaje = empleado.iniciarReserva(codigoSede, tipoDeCarro, sedeRecogida, sedeEntrega, "",
                        fechaHoraRecogida, fechaHoraEntrega, placaVehiculo, usernameCliente, "", 0, 0, 0, "");

                JOptionPane.showMessageDialog(null, mensaje);
            }
        });

        add(btnIniciarReserva);

        setBorder(new EmptyBorder(10, 10, 10, 10));
    }

    private void addLabelAndTextField(String labelText) {
        JLabel label = new JLabel(labelText);
        JTextField textField = new JTextField();
        add(label);
        add(textField);
    }

    private String getTextFromTextField(int index) {
        Component component = getComponent(index * 2 + 1);
        if (component instanceof JTextField) {
            JTextField textField = (JTextField) component;
            return textField.getText();
        }
        return "";
    }
}