public class Curso {
    String nombre;
    String codigo;
    int creditos;
    int inscritos;

    public Curso(String n, String cod, int cred, int ins) {
        nombre = n;
        codigo = cod;
        creditos = cred;
        inscritos = ins;
    }

    public void mostrar() {
        System.out.println("Curso: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Créditos: " + creditos);
        System.out.println("Inscritos: " + inscritos);
    }

    public int cuposDisponibles() {
        return 30 - inscritos;
    }
}