import java.util.*;

public class Biblioteca {
    List<Librero> libreros;
    private Set<Ficha> fichas;

    //número Id de la Proxima ficha
    private int nroF=1;

    Biblioteca(){
        libreros=new LinkedList<>();
        fichas=new HashSet<>();
        crearLibreros();
        llenarLibreros();
    }

    /**Crea los libreros estecificados en el problema
    * */
    private void crearLibreros(){
        Librero l0= new Librero("Lengua y Literatura");
        Librero l1= new Librero("Historia, Geografía y Ciencias Sociales");
        Librero l2= new Librero("Matemática y Ciencias Naturales");
        Librero l3= new Librero("Religión, Filosofía y Psicología");
        Librero l4= new Librero("Artes y Tecnología");
        libreros.add(l0);
        libreros.add(l1);
        libreros.add(l2);
        libreros.add(l3);
        libreros.add(l4);

    }

    /**Llena los libreros con ejemplares
     * */
    private void llenarLibreros(){
        libreros.get(0).agregarEjemplares("Cien años de soledad", "Gabriel García Márquez", Clasificacion.LITERATURA, "Sudamericana",1997, 57,3);
        libreros.get(0).agregarEjemplares("Un mundo feliz", "Aldous Huxley", Clasificacion.LITERATURA, "Tesoro de las letras",2011, 5,1);
        libreros.get(0).agregarEjemplares("La iliada", "Homero", Clasificacion.LITERATURA, "Zig Zag",2016, 49,5);
        libreros.get(0).agregarEjemplares("Romeo y Julieta", "William Shakespeare", Clasificacion.LITERATURA, "Tesoro de las letras",2014, 32,4);

        libreros.get(1).agregarEjemplares("Historia de Chile 1960-2010","Varios Autores",Clasificacion.HISTORIAGEOGRAFIA,"CEUSS",2018,2,3);
        libreros.get(1).agregarEjemplares("Egipto. El Mundo de los Faraones","Regine Schultz",Clasificacion.HISTORIAGEOGRAFIA,"H.F. Ullman",2008,10,2);
        libreros.get(1).agregarEjemplares("El Motín de la Naturaleza","Philipp Blom",Clasificacion.HISTORIAGEOGRAFIA,"Anagrama",2015,13,2);

        libreros.get(2).agregarEjemplares("Fisica para ciencias e ingeniería","Serway, Jewett",Clasificacion.MATEMATICA, "CENGAGE",2008, 7,5);
        libreros.get(2).agregarEjemplares("Atlas Sistema Respiratorio","Lepori",Clasificacion.CSNaturales, "Servicios Editoriales y Educativos",2003, 15,4);

        libreros.get(3).agregarEjemplares("La Biblia Latinoamericana","Hernan Rodas",Clasificacion.RELIGION,"Verbo Divino",2010,123,2);
        libreros.get(3).agregarEjemplares("Tu Cabeza Te Engaña","Pamela Nuñez",Clasificacion.FILOSOFIA,"Planeta",2016,3,1);
        libreros.get(3).agregarEjemplares("La Inteligencia Emocional","Daniel Goleman",Clasificacion.FILOSOFIA,"Vergara",2008,6,3);

        libreros.get(4).agregarEjemplares("CriptoPunks. La Libertad Y El Futuro de Internet", "Julian Assage",Clasificacion.TECNOLOGIA,"Lom",2014,4,2);
        libreros.get(4).agregarEjemplares("Código Limpio", "Robert Martin",Clasificacion.TECNOLOGIA,"Anaya",2012,4,2);
        libreros.get(4).agregarEjemplares("Miguel Angel. La Obra Completa: Pintur, Escultura Y Arquitectura", "Frank Zollner",Clasificacion.ARTE,"Benedikt Taschen Verlag",2010,9,1);
    }

    public void MostrarLibreros(){
        System.out.println("\n    Libreros: ");
        for(int i=0; i<libreros.size();i++){
            System.out.println((i+1)+")  "+libreros.get(i).getNombre());
        }
    }

    /**Itera por los libreros en busca de un ejemplar disponible del libro por el autor y el título,
     *retira el ejemplar del librero y crea una ficha con la información del prestamo y se guarda en fichas
     * @param  titulo corresponde a un String con el titulo del Libro que sebusca
     *  @param autor  corresponde a un String con el autor del Libro que sebusca
     * @return una ficha que se genera con los datos del prestamo(si se ha encontrado un ejemplar disponible);
     * @return null si no se ha encontrddo un ejemplar disponible y envía un mensaje por consola
     * */
    public Ficha pedirEjemplar(Estudiante estudiante, String titulo, String autor){
        Ejemplar ej= null;
        Librero lib;
        Iterator<Librero> iterador= libreros.iterator();
        while(ej==null && iterador.hasNext()){
            lib=iterador.next();
            ej=lib.buscarEjemplarDisponible(titulo,autor);
            if(ej!=null){
                lib.retirarEjemplar(ej);
                Ficha ficha =new Ficha(nroF,estudiante, ej,lib);
                nroF++;
                return ficha;
            }
        }
        System.out.print("El Libro solicitado no existe no está disponible");
        return null;
    }

    /**
     * a partir de los datos de la ficha, se retorna el ejemplar a la biblioteca(se cambia a true el estado enBiblioteca)
     * y se elimina la ficha
     * @param ficha es la ficha asociada al prestamo del ejemplar
     * */
    public void devolverEjemplar(Ficha ficha){
        Librero librero= ficha.getLibrero();
        Ejemplar ejemplar= ficha.getEjemplar();
        librero.devolverEjemplar(ejemplar);

        fichas.remove(ficha);
    }


}
