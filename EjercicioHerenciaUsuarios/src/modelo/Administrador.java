package modelo;

import utilitario.Validacion;

public class Administrador extends Usuario {
    private String nivelAcceso;

    public Administrador(String username, String correo, String nivelAcceso) {
        super(username, correo);
        if (Validacion.esTextoValido(nivelAcceso)) {
            this.nivelAcceso = nivelAcceso;
        } else {
            this.nivelAcceso = "Total";
        }
    }

    @Override
    public String obtenerPermisos() {
        return "Acceso total al sistema y gestión de usuarios.";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " | Nivel de Acceso: " + nivelAcceso + " | Permisos: " + obtenerPermisos();
    }
}
