public abstract class Libro {

    Clasificacion clasificacion;
    String titulo;
    String autor;
    int edicion;
    String editorial;
    int agno;

    Libro(String titulo, String autor, Clasificacion clasificacion, String editorial, int agno, int edicion){
        this.agno=agno;
        this.autor=autor;
        this.clasificacion=clasificacion;
        this.edicion=edicion;
        this.titulo=titulo;
        this.editorial=editorial;


    }

    Clasificacion getClasificacion() {
        return clasificacion;
    }

    String getTitulo() {
        return titulo;
    }

    String getAutor() {
        return autor;
    }

    int getEdicion() {
        return edicion;
    }

    String getEditorial() {
        return editorial;
    }

    int getAgno() {
        return agno;
    }

}
