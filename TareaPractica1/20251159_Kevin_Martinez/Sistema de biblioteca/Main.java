import java.util.List;

public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro("La sangre del elegido","Julio César Hichez Victorino","978-9945-663-70-9");
        Libro libro2 = new Libro("Palestinos en Santa Cruz de El Seibo","Roberto B. Jiménez Chalas","978-9945-13-230-4");
        Libro libro3 = new Libro("The continent of ascension, storms and revolutions","Layonel Díaz","978-9945-30-236-3");
        Libro libro4 = new Libro("La Historia de la Iglesia Episcopal Dominicana en tiempo real","Bienvenido López T.","978-9945-663-69-3");

        Usuario usuario1 = new Usuario("Kevin Martinez", "U001");

        Prestamo prestamo1 = new Prestamo(usuario1, libro1);
        Prestamo prestamo2 = new Prestamo(usuario1, libro2);

        System.out.println("=== Prestando libros ===");
        prestamo1.prestarLibro();
        prestamo2.prestarLibro();

        System.out.println("=== Intentando prestar libro ya prestado ===");
        Prestamo prestamoRepetido = new Prestamo(usuario1, libro1);
        prestamoRepetido.prestarLibro();

        System.out.println();

        System.out.println("Disponibilidad libro1: " + libro1.consultarDisponibilidad());
        System.out.println("Disponibilidad libro2: " + libro2.consultarDisponibilidad());
        System.out.println();

        System.out.println("=== Libros prestados al usuario ===");
        List<Libro> librosUsuario = usuario1.getLibrosPrestados();
        for (Libro libro : librosUsuario) {
            System.out.println(libro.imprimirDatos());
        }
        System.out.println();

        System.out.println("=== Devolviendo libro1 ===");
        prestamo1.devolverLibro();

        System.out.println("Disponibilidad libro1: " + libro1.consultarDisponibilidad());
        System.out.println();

        System.out.println("=== Libros actuales del usuario ===");
        for (Libro libro : usuario1.getLibrosPrestados()) {
            System.out.println(libro.imprimirDatos());
        }

        System.out.println();
        System.out.println("=== Información del préstamo ===");
        System.out.println(prestamo2.imprimirDatos());
    }
}