package modelo;

import java.util.ArrayList;

public class SistemaUsuarios {
    private ArrayList<Usuario> usuarios;

    public SistemaUsuarios() {
        this.usuarios = new ArrayList<>();
    }

    public boolean agregarUsuario(Usuario usuario) {
        if (usuario != null) {
            usuarios.add(usuario);
            return true;
        }
        return false;
    }

    public Usuario buscarUsuario(String username) {
        for (Usuario u : usuarios) {
            if (u.getUsername().equalsIgnoreCase(username)) {
                return u;
            }
        }
        return null;
    }

    public boolean eliminarUsuario(String username) {
        Usuario usuario = buscarUsuario(username);
        if (usuario != null) {
            usuarios.remove(usuario);
            return true;
        }
        return false;
    }

    public String mostrarUsuarios() {
        if (usuarios.isEmpty()) {
            return "No hay usuarios registrados en el sistema.";
        }
        String resultado = "=== LISTA DE USUARIOS DEL SISTEMA ===\n";
        for (Usuario u : usuarios) {
            resultado += u.mostrarInformacion() + "\n";
        }
        return resultado;
    }
}
