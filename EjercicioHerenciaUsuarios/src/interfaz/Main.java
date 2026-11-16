package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        SistemaUsuarios sistema = new SistemaUsuarios();

        // Instanciación de cada subclase
        Usuario admin = new Administrador("admin_pinta", "admin@udla.edu.ec", "Superadmin");
        Usuario dev = new Desarrollador("dev_josue", "josue.tisalema@udla.edu.ec", "Java");
        Usuario cliente = new Cliente("cliente_pedro", "pedro@gmail.com", 5);

        // Agregar al sistema
        sistema.agregarUsuario(admin);
        sistema.agregarUsuario(dev);
        sistema.agregarUsuario(cliente);

        // Mostrar listado (Polimorfismo)
        System.out.println(sistema.mostrarUsuarios());

        // Prueba de búsqueda
        System.out.println("--- PRUEBA DE BÚSQUEDA ---");
        Usuario buscado = sistema.buscarUsuario("dev_josue");
        if (buscado != null) {
            System.out.println("Usuario encontrado:\n" + buscado.mostrarInformacion());
        } else {
            System.out.println("Usuario no encontrado.");
        }

        // Prueba de eliminación
        System.out.println("\n--- PRUEBA DE ELIMINACIÓN ---");
        if (sistema.eliminarUsuario("cliente_pedro")) {
            System.out.println("El cliente fue eliminado con éxito.");
        }

        System.out.println("\n" + sistema.mostrarUsuarios());
    }
}
