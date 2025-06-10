import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "S";

        while (Profesor.obtenerProfesores().length < 50 && continuar.equalsIgnoreCase("S")) {
            System.out.println("=== Ingreso de nuevo profesor ===");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Año de nacimiento (YYYY): ");
            int anio = scanner.nextInt();
            System.out.print("Mes (MM): ");
            int mes = scanner.nextInt();
            System.out.print("Día (DD): ");
            int dia = scanner.nextInt();
            scanner.nextLine();  // limpiar buffer

            System.out.print("Género (M/F): ");
            char genero = scanner.nextLine().toUpperCase().charAt(0);

            System.out.print("Estatura (m): ");
            double estatura = scanner.nextDouble();
            System.out.print("Peso (kg): ");
            double peso = scanner.nextDouble();
            scanner.nextLine(); // limpiar buffer

            System.out.print("Departamento: ");
            String departamento = scanner.nextLine();

            System.out.print("Nivel: ");
            String nivel = scanner.nextLine();

            new Profesor(nombre, apellido, LocalDate.of(anio, mes, dia),
                    genero, estatura, peso,
                    departamento, nivel);

            System.out.print("¿Desea ingresar otro profesor? (S/N): ");
            continuar = scanner.nextLine();
        }

        System.out.println("\n=== Lista de Profesores ===");
        for (Profesor p : Profesor.obtenerProfesores()) {
            System.out.println(p);
        }

        scanner.close();
    }
}
