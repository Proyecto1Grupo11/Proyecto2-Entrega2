package interfaz;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import logica.Empleado;


public class MenuEmpleado extends JFrame {

    public MenuEmpleado() {
        super("Menu Empleado");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new PanelMenuEmpleado());
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuEmpleado();
    }
}

class PanelMenuEmpleado extends JPanel {

    public PanelMenuEmpleado() {
    	setLayout(new GridLayout(9, 1, 0, 10));

        JButton btn1 = new JButton("Mandar vehículo a mantenimiento");
        JButton btn2 = new JButton("Crear cliente");
        JButton btn3 = new JButton("Iniciar reserva");
        JButton btn4 = new JButton("Cerrar y guardar reserva");
        JButton btn5 = new JButton("Generar reporte vehículos en mantenimiento");
        JButton btn6 = new JButton("Generar entrega");
        JButton btn7 = new JButton("Añadir Conductor adicional");
        JButton btn8 = new JButton("Salir");

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazMandarVehiculoMantenimiento();
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazCrearCliente();
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazIniciarReserva();
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazCerrarGuardarReserva();
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazReporteVehículosMantenimiento();
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazGenerrarEntrega();
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazAñadirConductorAdicional();
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //dispose();
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
    private Empleado empleado;
    private void abrirInterfazMandarVehiculoMantenimiento() {
    	InterfazMandarVehiculoMantenimiento interfazMandarVehiculoMantenimiento = new InterfazMandarVehiculoMantenimiento(empleado);
    	interfazMandarVehiculoMantenimiento.setVisible(true);
    }

    private void abrirInterfazCrearCliente() {
    	InterfazCrearUsuario interfazCrearUsuario = new InterfazCrearUsuario();
    	interfazCrearUsuario.setVisible(true);
    }

    private void abrirInterfazIniciarReserva() {
    	InterfazIniciarReserva interfazIniciarReserva = new InterfazIniciarReserva(empleado);
    	interfazIniciarReserva.setVisible(true);
    }

    private void abrirInterfazCerrarGuardarReserva() {
    	//InterfazCerrarGuardarReserva interfazCerrarGuardarReserva = new InterfazCerrarGuardarReserva();
    	//interfazCerrarGuardarReserva.setVisible(true);
    }
    private void abrirInterfazReporteVehículosMantenimiento() {
    	InterfazReporteVehiculoMantenimiento interfazReporteVehiculoMantenimiento = new InterfazReporteVehiculoMantenimiento(empleado);
    	interfazReporteVehiculoMantenimiento.setVisible(true);
    }

    private void abrirInterfazGenerrarEntrega() {
    	InterfazGenerarEntrega interfazGenerarEntrega = new InterfazGenerarEntrega(null);
    	interfazGenerarEntrega.setVisible(true);
    }

    private void abrirInterfazAñadirConductorAdicional() {
    	InterfazAñadirConductorAdicional interfazAñadirConductorAdicional = new InterfazAñadirConductorAdicional(null);
    	interfazAñadirConductorAdicional.setVisible(true); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setFont(new Font("Arial", Font.BOLD, 18));
        g2d.drawString("Menu Empleado", 50, 30);
    }
}