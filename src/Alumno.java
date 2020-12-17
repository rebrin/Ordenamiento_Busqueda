public class Alumno implements Comparable<Alumno>{
    String nombre;
    Integer NC;

    public Alumno(String nombre, Integer NC) {

        this.nombre = nombre;
        this.NC = NC;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", NC=" + NC +
                '}';
    }

    @Override
    public int compareTo(Alumno o) {
        return this.NC-o.NC;
    }
}
