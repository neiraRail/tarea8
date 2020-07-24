public class Ejemplar extends Libro {

    private  boolean EnBiblioteca;
    private int nroEjemplar;

    Ejemplar(String titulo, String autor, Clasificacion clasificacion,String editorial,  int agno, int edicion, int nro) {
        super(titulo, autor, clasificacion, editorial, agno, edicion);
        this.EnBiblioteca =true;
        this.nroEjemplar=nro;
    }

    public String toString() {
        return "Titulo: "+getTitulo()+" | Autor: "+getAutor()+" | Clasificación: "+getClasificacion().toString()+"| Año: "+getAgno()+
               "\n                   | Edición: "+getEdicion()+" | Editorial: "+getEditorial()+" | Estado: "+Estado();
    }

    private String Estado(){
        if(isEnBiblioteca()) {
            return "DISPONIBLE";
        }
        else{
        return "NO DISPONIBLE";
        }
    }

    boolean isEnBiblioteca() {
        return EnBiblioteca;
    }

    void setEnBiblioteca(boolean enBiblioteca) {
        this.EnBiblioteca = enBiblioteca;
    }

    public boolean getEstado(){
        return EnBiblioteca;
    }
}
