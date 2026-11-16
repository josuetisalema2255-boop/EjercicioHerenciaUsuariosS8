package modelo;

import utilitario.Validacion;

public class Usuario {
    private String username;
    private String correo;

    public Usuario(String username, String correo) {
        if (Validacion.esTextoValido(username)) {
            this.username = username;
        } else {
            this.username = "Sin Username";
        }

        if (Validacion.esCorreoValido(correo)) {
            this.correo = correo;
        } else {
            this.correo = "correo@invalido.com";
        }
    }

    public String getUsername() {
        return username;
    }

    public String getCorreo() {
        return correo;
    }

    public String obtenerPermisos() {
        return "Permisos básicos de usuario registrado.";
    }

    public String mostrarInformacion() {
        return "Username: " + username + " | Correo: " + correo;
    }
}
