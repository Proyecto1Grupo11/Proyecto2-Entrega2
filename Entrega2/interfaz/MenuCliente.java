package interfaz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class MenuCliente extends JFrame {

    public MenuCliente() {
        super("Menu Cliente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new PanelMenuCliente());
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }


class PanelMenuCliente extends JPanel {

    public PanelMenuCliente() {
        setLayout(new GridLayout(4, 1, 0, 10));

        JButton btn1 = new JButton("Iniciar reserva");
        JButton btn2 = new JButton("Cerrar y guardar reserva");
        JButton btn3 = new JButton("Ver método de pago");
        JButton btn4 = new JButton("Salir");

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazIniciarReserva();
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazGuardarReserva();
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazMetodoPago();
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);

        setBorder(new EmptyBorder(10, 10, 10, 10));
    }


    private void abrirInterfazIniciarReserva() {
        InterfazIniciarReserva interfazIniciarReserva = new InterfazIniciarReserva(null);
        interfazIniciarReserva.setVisible(true);
    }

    private void abrirInterfazGuardarReserva() {
        // Implementa la lógica para abrir la interfaz de guardar reserva
    }

    private void abrirInterfazMetodoPago() {
        // Implementa la lógica para abrir la interfaz de método de pago
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setFont(new Font("Arial", Font.BOLD, 18));
        g2d.drawString("Menu Cliente", 50, 30);
    	}
	}
}