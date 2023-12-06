package interfaz;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazFuncionario extends JFrame {
    public InterfazFuncionario() {
        super("Cliente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new GridLayout(3, 1));

        JPanel panelIniciarSesion = crearPanel("Click aquí si va a iniciar sesión", "Iniciar Sesión");
        JPanel panelSalir = crearPanel("Click aquí si quiere salir", "Salir");

        panelPrincipal.add(panelIniciarSesion);
        panelPrincipal.add(panelSalir);

        setContentPane(panelPrincipal);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel crearPanel(String labelTexto, String buttonTexto) {
        JLabel label = new JLabel(labelTexto);
        JButton button = new JButton(buttonTexto);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                if (buttonTexto.equals("Iniciar Sesión")) {
                    abrirInterfazIniciarSesion();
                } else if (buttonTexto.equals("Salir")) {
                    dispose(); 
                }
            }
        });

        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.add(label);
        panel.add(button);

        return panel;
    }

    private void abrirInterfazIniciarSesion() {
    	InterfazIniciarSesion interfazIniciarSesion = new InterfazIniciarSesion();
        interfazIniciarSesion.setVisible(true);
    }

}