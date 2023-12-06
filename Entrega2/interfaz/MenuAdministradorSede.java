package interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class MenuAdministradorSede extends JFrame {

    public MenuAdministradorSede() {
        super("Menu Administrador de Sede");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new PanelMenuAdministradorSede());
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuAdministradorSede();
    }
}

class PanelMenuAdministradorSede extends JPanel {

    public PanelMenuAdministradorSede() {
        setLayout(new GridLayout(3, 1, 0, 10));

        JButton btn1 = new JButton("Crear nuevo empleado");
        JButton btn2 = new JButton("Eliminar empleado");
        JButton btn3 = new JButton("Salir");

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazCrearNuevoEmpleado();
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazEliminarEmpleado();
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	System.exit(0);
            }
        });

        add(btn1);
        add(btn2);
        add(btn3);

        setBorder(new EmptyBorder(10, 10, 10, 10)); // Añade un espacio alrededor del panel
    }

    private void abrirInterfazCrearNuevoEmpleado() {
        InterfazCrearNuevoEmpleado interfazCrearNuevoEmpleado = new InterfazCrearNuevoEmpleado(null);
        interfazCrearNuevoEmpleado.setVisible(true);
    }

    private void abrirInterfazEliminarEmpleado() {
        InterfazEliminarEmpleado interfazEliminarEmpleado = new InterfazEliminarEmpleado(null);
        interfazEliminarEmpleado.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setFont(new Font("Arial", Font.BOLD, 18));
        g2d.drawString("Menu Administrador de Sede", 50, 30);
    }
}