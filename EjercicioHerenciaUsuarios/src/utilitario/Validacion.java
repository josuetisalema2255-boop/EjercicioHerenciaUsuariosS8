package utilitario;

public class Validacion {

    public static boolean esTextoValido(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    public static boolean esCorreoValido(String correo) {
        return esTextoValido(correo) && correo.contains("@") && correo.contains(".");
    }
}
