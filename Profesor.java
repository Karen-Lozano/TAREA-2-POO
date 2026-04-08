public class Profesor {
    String nombre;
    String especialidad;
    int edad;
    double salario;

    public Profesor(String n, String esp, int e, double s) {
        nombre = n;
        especialidad = esp;
        edad = e;
        salario = s;
    }

    public void mostrar() {
        System.out.println("Profesor: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}
