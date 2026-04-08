public class Estudiante {
    String nombre;   // público
    String carrera;  // público
    int edad;        // privado (simplificado)
    double promedio; // privado

    public Estudiante(String n, String c, int e, double p) {
        nombre = n;
        carrera = c;
        edad = e;
        promedio = p;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
    }

    public boolean aprobar() {
        return promedio >= 11;
    }
}