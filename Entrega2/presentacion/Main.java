package presentacion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.SwingUtilities;

import interfaz.InterfazCrearUsuario;
import interfaz.InterfazInicio;
import logica.AdminGeneral;
import logica.AdminSede;
import logica.Cliente;
import logica.Empleado;
import logica.EmpresaAlquiler;
import logica.Estados;
import logica.Roles;
import logica.Usuario;
import persistencia.PersistenciaEmpresaAlquiler;

public class Main {
	
    private EmpresaAlquiler empresa;

    public Main() {
        this.empresa = PersistenciaEmpresaAlquiler.cargarEmpresaAlquiler();
        
        try {
            if (empresa.getMapaUsuarios().isEmpty()) {
                this.empresa.leerArchivos();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                InterfazInicio interfazInicio = new InterfazInicio();
                interfazInicio.setVisible(true);
            }
        });
    }
	
    public void autenticarUsuario(String usuario, String contraseña) {
        empresa.autenticarUsuario(usuario, contraseña);
        
    }
    public static void main(String[] args) {
        new Main();
    }
}

