package modelo;

import utilitario.Validacion;

public class Desarrollador extends Usuario {
    private String lenguajePrincipal;

    public Desarrollador(String username, String correo, String lenguajePrincipal) {
        super(username, correo);
        if (Validacion.esTextoValido(lenguajePrincipal)) {
            this.lenguajePrincipal = lenguajePrincipal;
        } else {
            this.lenguajePrincipal = "Java";
        }
    }

    @Override
    public String obtenerPermisos() {
        return "Acceso a repositorios, bases de datos y despliegue de código.";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " | Lenguaje: " + lenguajePrincipal + " | Permisos: " + obtenerPermisos();
    }
}
