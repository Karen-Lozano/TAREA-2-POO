public class Main {
    public static void main(String[] args) {

        Estudiante e = new Estudiante("Juan", "Ingeniería", 20, 15);
        Curso c = new Curso("Programación", "CS101", 4, 25);
        Profesor p = new Profesor("Ana", "Matemática", 40, 2500);

        e.mostrar();
        System.out.println("Aprueba: " + e.aprobar());

        c.mostrar();
        System.out.println("Cupos: " + c.cuposDisponibles());

        p.mostrar();
    }
}
