package interfaz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logica.EmpresaAlquiler;
import logica.Roles;
import logica.Usuario;

public class InterfazIniciarSesion extends JFrame {
	private EmpresaAlquiler empresa;
    private JTextField campoUsuario;
    private JPasswordField campoContraseña;

    public InterfazIniciarSesion() {
        super("Iniciar Sesión");
        this.empresa = empresa;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new GridLayout(4, 1));

        JLabel labelUsuario = new JLabel("Ingrese su usuario");
        campoUsuario = new JTextField();

        JLabel labelContraseña = new JLabel("Ingrese su contraseña");
        campoContraseña = new JPasswordField();

        JButton botonIniciarSesion = new JButton("Iniciar Sesión");
        botonIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            	String usuario = campoUsuario.getText();
                char[] contraseña = campoContraseña.getPassword();
                String password = new String(contraseña);

                Usuario usuarioAutenticado = empresa.autenticarUsuario(usuario, password);

                if (usuarioAutenticado != null) {
                    abrirInterfazSegunRol(usuarioAutenticado.getRol());
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.", "Error de autenticación", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panelPrincipal.add(labelUsuario);
        panelPrincipal.add(campoUsuario);
        panelPrincipal.add(labelContraseña);
        panelPrincipal.add(campoContraseña);
        panelPrincipal.add(botonIniciarSesion);

        setContentPane(panelPrincipal);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
        }
        
    private void abrirInterfazSegunRol(Roles rol) {
        if (rol == Roles.EMPLEADO) {
            new MenuEmpleado().setVisible(true);
        } else if (rol == Roles.CLIENTE) {
            new InterfazCliente().setVisible(true);
        } else if (rol == Roles.ADMINISTRADORGENERAL) {
            new MenuAdminGeneral().setVisible(true);
        } else if (rol == Roles.ADMINISTRADORSEDE) {
            new MenuAdministradorSede().setVisible(true);
        } else {
            System.out.println("Rol no reconocido.");
        }
    }
}
