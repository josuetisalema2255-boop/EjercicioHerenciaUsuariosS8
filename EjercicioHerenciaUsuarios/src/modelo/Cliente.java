package modelo;

public class Cliente extends Usuario {
    private int comprasRealizadas;

    public Cliente(String username, String correo, int comprasRealizadas) {
        super(username, correo);
        if (comprasRealizadas >= 0) {
            this.comprasRealizadas = comprasRealizadas;
        } else {
            this.comprasRealizadas = 0;
        }
    }

    @Override
    public String obtenerPermisos() {
        return "Acceso al catálogo de productos y realización de compras.";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " | Compras realizadas: " + comprasRealizadas + " | Permisos: " + obtenerPermisos();
    }
}
