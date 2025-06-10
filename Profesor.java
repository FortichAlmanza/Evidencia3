import java.time.LocalDate;
import java.util.Arrays;

public class Profesor extends Persona {
    private String departamento;
    private String nivel;

    private static final int MAX_PROFESORES = 50;
    private static Profesor[] listaProfesores = new Profesor[MAX_PROFESORES];
    private static int contador = 0;

    public Profesor(String nombre, String apellido, LocalDate fechaNacimiento,
                    char genero, double estatura, double peso,
                    String departamento, String nivel) {
        super(nombre, apellido, fechaNacimiento, genero, estatura, peso);
        this.departamento = departamento;
        this.nivel = nivel;

        if (contador < MAX_PROFESORES) {
            listaProfesores[contador++] = this;
        } else {
            System.out.println("¡Capacidad máxima alcanzada!");
        }
    }

    public static Profesor[] obtenerProfesores() {
        return Arrays.copyOf(listaProfesores, contador);
    }

    @Override
    public String toString() {
        return super.toString() + " | Departamento: " + departamento + " | Nivel: " + nivel;
    }
}
