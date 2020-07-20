import java.util.*;

public class Estudiante {
    private String nombre;
    private Curso curso;

    Estudiante(String nombre, Curso curso){
        this.curso=curso;
        this.nombre=nombre;
    }

    String getNombre() {
        return nombre;
    }

    String getCurso() {
        return curso.toString();
    }
}
