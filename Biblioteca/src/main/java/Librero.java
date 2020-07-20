import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class Librero {

    private List<Ejemplar> ejemplars;
    private String nombre;

    Librero(String nombre){
        this.nombre=nombre;
        ejemplars = new ArrayList<>();
    }

    void agregarEjemplares(String titulo, String autor, Clasificacion clasificacion, String editorial, int agno, int edicion, int nroEjemplares){
        for (int i=0; i<nroEjemplares;i++){
            Ejemplar ejemplar= new Ejemplar(titulo,autor,clasificacion,editorial,agno,edicion,i);
            ejemplars.add(ejemplar);
        }
    }

    /**itera por los Ejemplares en el librero buscando encontrar un ejemplar con el
     * mismo título, autor y que esté en disponible(en biblioteca es true)
     * @return un Ejemplar disponible con el autor y título indicado
     * @return null si no se encuentra un ejemplar con estas caracteríasticas
     * puede ser que el ejemplar no exista, hubo un error y no haya sido marcado como disponible cuando se ejecuto la devolució, o
     * pertenezca aun librero diferente
     * */
    Ejemplar buscarEjemplarDisponible(String tituloBuscado, String autorBuscado){
        Ejemplar ejemplarLibrero;
        for(int i = 0; i< ejemplars.size(); i++){
           ejemplarLibrero= ejemplars.get(i);
           if(ejemplarLibrero.getTitulo()==tituloBuscado && ejemplarLibrero.getAutor()==autorBuscado && ejemplarLibrero.isEnBiblioteca() ){
               return ejemplarLibrero;
           }
        }
        return null;
    }

    /**itera por los Ejemplares en el librero buscando encontrar un ejemplar con el
     * mismo título, autor y que esté en uso(en biblioteca es false)
     * @return un Ejemplar no disponible con el autor y título indicado
     * @return null si no se encuentra un ejemplar con estas caracteríasticas
     * puede ser que el ejemplar no exista, hubo un error y no haya sido marcado como no disponible cuando se ejecuto el prestamo, o
     * pertenesca aun librero diferente
     * este método es usado por el método devolverEjemplar para asegurar que se está devolviendo al librero correcto
     * */
    private Ejemplar buscarEjemplarEnUso(String tituloBuscado, String autorBuscado){
        Ejemplar ejemplarLibrero;
        for(int i = 0; i< ejemplars.size(); i++){
            ejemplarLibrero= ejemplars.get(i);
            if(ejemplarLibrero.getTitulo()==tituloBuscado && ejemplarLibrero.getAutor()==autorBuscado && !ejemplarLibrero.isEnBiblioteca()){
                return ejemplarLibrero;
            }
        }
        return null;
    }


    /**
     * si es así le asigna false al atributo enBiblioteca
     * @param ejemplar es el ejemplar que se desea retirar del librero
     *si es null envía un aviso
     * */
    void retirarEjemplar(Ejemplar ejemplar){
        if(ejemplar==null){
            System.out.println("El Ejemplar que intenta retirar no existe en este librero  ");
        }else{
                ejemplar.setEnBiblioteca(false);
                System.out.println("Retiro exitoso de "+ejemplar.getTitulo());
        }
    }


    /**Chekea si el ejemplar que se intenta devolver pertenesca al librero seleccionado y si esté fue pretado
     * si es así le asigna true al atributo enBiblioteca
     * sino muestra un aviso por consola que el ejemplar no figura en este librero o si no aparece en el sistema como prestado
     * @param ejemplar
     * */
    void devolverEjemplar(Ejemplar ejemplar){
        Ejemplar ej = buscarEjemplarEnUso(ejemplar.getTitulo(),ejemplar.getAutor());
        if(ej==null){
            System.out.println("El ejemplar que desea devolver no corresponde al Librero Seleccionado");
        }else{
            if(ejemplar.isEnBiblioteca()){
                System.out.println("Este ejemplar no aparece en el sistema como prestado");
            }else{
                ejemplar.setEnBiblioteca(true);
                System.out.println("Se ha devuelto exitosamento "+ej.getTitulo());
            }
        }

    }

    /**
     *Ordena los ejemplares en la lista ejemplars en aorden alfabético de acuerdo al atítulo
     * */
    void ordenarPorTitulo(){
        ejemplars.sort(Comparator.comparing(Ejemplar::getTitulo));
    }

    /**
     *Ordena los ejemplares en la lista ejemplars en aorden alfabético de acuerdo al autor
     * */
    void ordenarPorAutor(){
        ejemplars.sort(Comparator.comparing(Ejemplar::getAutor));
    }

    /**
     * Itera por los Ejemplares en el librero y los muestra por consola
     * */
    void MostrarEjemplares(){
        System.out.println("\n      Librero: "+getNombre());

        for(int i = 0; i< ejemplars.size(); i++){
            System.out.println((i+1)+")  "+ ejemplars.get(i).toString());
        }
    }

    String getNombre() {
        return nombre;
    }
}
