package interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

import logica.EmpresaAlquiler;
import logica.Roles;

public class InterfazCrearUsuario extends JFrame {

    private JTextField[] camposTexto;
    private EmpresaAlquiler empresa;
    
    public InterfazCrearUsuario() {
        super("Crear Usuario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.empresa = empresa;
        camposTexto = new JTextField[12];

        JPanel panelPrincipal = new JPanel(new GridLayout(15, 1));

        addLabelAndTextField(panelPrincipal, "Ingrese el nombre de usuario:", 0);
        addLabelAndTextField(panelPrincipal, "Ingrese la contraseña:", 1);
        addLabelAndTextField(panelPrincipal, "Ingrese el nombre del cliente:", 2);
        addLabelAndTextField(panelPrincipal, "Ingrese el email:", 3);
        addLabelAndTextField(panelPrincipal, "Ingrese el telefono:", 4);
        addLabelAndTextField(panelPrincipal, "Ingrese su fecha de nacimiento:", 5);
        addLabelAndTextField(panelPrincipal, "Ingrese su nacionalidad:", 6);
        addLabelAndTextField(panelPrincipal, "Ingrese la foto de su cedula:", 7);
        addLabelAndTextField(panelPrincipal, "Ingrese la imagen de su licencia:", 8);
        addLabelAndTextField(panelPrincipal, "Ingrese su metodo de pago:", 9);
        addLabelAndTextField(panelPrincipal, "Ingrese su numero de tarjeta:", 10);
        addLabelAndTextField(panelPrincipal, "Ingrese la fecha de vencimiento de su tarjeta:", 11);

        JButton btnCrearUsuario = new JButton("Crear Usuario");

        btnCrearUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String[] valoresCampos = new String[12];
                for (int i = 0; i < valoresCampos.length; i++) {
                    valoresCampos[i] = camposTexto[i].getText();
                }

                empresa.crearCliente(
                    valoresCampos[0], valoresCampos[1], Roles.CLIENTE,
                    valoresCampos[2], valoresCampos[3], valoresCampos[4],
                    valoresCampos[5], valoresCampos[6], valoresCampos[7],
                    valoresCampos[8], valoresCampos[9], valoresCampos[10],
                    valoresCampos[11]);

                JOptionPane.showMessageDialog(
                    InterfazCrearUsuario.this, "Cliente creado exitosamente",
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);
            }
        });


        panelPrincipal.add(btnCrearUsuario);
        setContentPane(panelPrincipal);
        setSize(550, 550);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addLabelAndTextField(JPanel panel, String labelText, int index) {
        JLabel label = new JLabel(labelText);
        camposTexto[index] = new JTextField();
        panel.add(label);
        panel.add(camposTexto[index]);
    }

}