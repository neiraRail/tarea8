import java.time.*;

public class Ficha {
    private  int id;
    private Estudiante estudiante;
    private Ejemplar ejemplar;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Librero librero;

    Ficha(int id,Estudiante estudiante, Ejemplar ejemplar, Librero librero){
        this.id=id;
        this.estudiante=estudiante;
        this.ejemplar=ejemplar;
        this.librero=librero;
        LocalDate hoy = LocalDate.now();
        fechaPrestamo =hoy;
        fechaDevolucion =hoy.plusDays(7);
    }

    void print(){
        String string="-----------------------------------------Ficha------------------------------------------------"+
                "\nNúmero ficha:"+id+
                "\nEstudiante: "+estudiante.getNombre()+"     Curso: "+estudiante.getCurso()+
                "\nDetalles del Ejemplar:\n   "+ejemplar.toString()+"Librero:"+librero.getNombre()+
                "\nFecha de Prestamo: "+fechaPrestamo+
                "\nFecha de devolucion: "+ fechaDevolucion+"\n-----------------------------------------------------------------------------------------------";
        System.out.println(string);

    }

    Ejemplar getEjemplar() {
        return ejemplar;
    }

    Librero getLibrero() {
        return librero;
    }

}
