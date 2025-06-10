import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private char genero;
    private double estatura;
    private double peso;

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento,
                   char genero, double estatura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.estatura = estatura;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido +
                " | Fecha Nac.: " + fechaNacimiento +
                " | Género: " + genero +
                " | Estatura: " + estatura +
                "m | Peso: " + peso + "kg";
    }
}
