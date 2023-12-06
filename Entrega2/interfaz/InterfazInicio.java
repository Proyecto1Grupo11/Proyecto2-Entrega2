package interfaz;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazInicio extends JFrame {
    public InterfazInicio() {
        super("Alquiler de Autos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton clienteButton = new JButton("Cliente");
        JButton funcionarioButton = new JButton("Funcionario Empresa");

        clienteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirInterfazCliente();
            }
        });

        funcionarioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirInterfazFuncionario();
            }
        });

        JPanel panel = new JPanel();
        panel.add(clienteButton);
        panel.add(funcionarioButton);

        setContentPane(panel);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void abrirInterfazCliente() {
    	InterfazCliente interfazCliente = new InterfazCliente();
        interfazCliente.setVisible(true);
        dispose();
       
    }

    private void abrirInterfazFuncionario() {
        InterfazFuncionario interfazFuncionario = new InterfazFuncionario();
        interfazFuncionario.setVisible(true);
        dispose();
    }
    public static void main(String[] args) {
        InterfazInicio interfazInicio = new InterfazInicio();
        interfazInicio.setVisible(true);
    }
}