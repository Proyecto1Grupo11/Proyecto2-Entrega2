package interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class MenuAdminGeneral extends JFrame {

    public MenuAdminGeneral() {
        super("Menu Administrador General");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new PanelMenuAdminGeneral());
        setSize(400, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuAdminGeneral();
    }
}

class PanelMenuAdminGeneral extends JPanel {

    public PanelMenuAdminGeneral() {
        setLayout(new GridLayout(9, 1, 0, 10));

        JButton btn1 = new JButton("Crear nuevo administrador de sede");
        JButton btn2 = new JButton("Eliminar administrador de sede");
        JButton btn3 = new JButton("Añadir nuevo vehículo");
        JButton btn4 = new JButton("Eliminar vehículo");
        JButton btn5 = new JButton("Añadir nueva sede");
        JButton btn6 = new JButton("Eliminar sede");
        JButton btn7 = new JButton("Modificar Seguros");
        JButton btn8 = new JButton("Salir");

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazCrearAdministradorSede();
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazEliminarAdministradorSede();
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazAñadirVehiculo();
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazBorrarVehiculo();
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazAñadirSede();
            }
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazEliminarSede();
            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazModificarSeguro();
            }
        });

        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                //dispose(); // Cierra la ventana actual
            }
        });

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);

        setBorder(new EmptyBorder(10, 10, 10, 10));
    }

    private void abrirInterfazCrearAdministradorSede() {
        InterfazCrearAdministradorSede interfazCrearAdministradorSede = new InterfazCrearAdministradorSede();
        interfazCrearAdministradorSede.setVisible(true);
    }

    private void abrirInterfazEliminarAdministradorSede() {
        InterfazEliminarAdministradorSede interfazEliminarAdministradorSede = new InterfazEliminarAdministradorSede();
        interfazEliminarAdministradorSede.setVisible(true);
    }

    private void abrirInterfazAñadirVehiculo() {
        InterfazAñadirVehiculo interfazAñadirVehiculo = new InterfazAñadirVehiculo();
        interfazAñadirVehiculo.setVisible(true);
    }

    private void abrirInterfazBorrarVehiculo() {
        InterfazBorrarVehiculo interfazBorrarVehiculo = new InterfazBorrarVehiculo();
        interfazBorrarVehiculo.setVisible(true);
    }

    private void abrirInterfazAñadirSede() {
        InterfazAñadirSede interfazAñadirSede = new InterfazAñadirSede();
        interfazAñadirSede.setVisible(true);
    }

    private void abrirInterfazEliminarSede() {
        InterfazEliminarSede interfazEliminarSede = new InterfazEliminarSede();
        interfazEliminarSede.setVisible(true);
    }

    private void abrirInterfazModificarSeguro() {
        InterfazModificarSeguro interfazModificarSeguro = new InterfazModificarSeguro();
        interfazModificarSeguro.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setFont(new Font("Arial", Font.BOLD, 18));
        g2d.drawString("Menu Administrador General", 50, 30);
    }
}