import org.junit.Test;

import java.util.Iterator;

public class test {

   @Test
    public void test1(){
       System.out.println("Test 2 de ordenamiento de Ejemplares en un Librero \n");

       Librero librero=new Librero("literatura");
       librero.agregarEjemplares("It", "Stephen King", Clasificacion.LITERATURA, "HH",2003, 19,2);
       librero.agregarEjemplares("Cien años de soledad", "Gabriel García Márquez", Clasificacion.LITERATURA, "Sudamericana",1997, 15,3);
       librero.agregarEjemplares("Un mundo feliz", "Aldous Huxley", Clasificacion.LITERATURA, "Tesoro de las letras",2011, 5,1);
       librero.agregarEjemplares("La iliada", "Homero", Clasificacion.LITERATURA, "Zig Zag",2016, 49,5);
       librero.agregarEjemplares("Romeo y Julieta", "William Shakespeare", Clasificacion.LITERATURA, "Tesoro de las letras",2014, 32,4);

       librero.MostrarEjemplares();

       librero.ordenarPorTitulo();
       System.out.print("--------------Librero ordenado Por Titulo--------------");
       librero.MostrarEjemplares();
      System.out.print("---------------Librero ordenado Por Autor----------------");
       librero.ordenarPorAutor();
       librero.MostrarEjemplares();
   }

   @Test
   public void test2 (){
      System.out.print("Mostar todos los Ejemplares Por librero");
      Biblioteca biblioteca = new Biblioteca();
      Iterator<Librero> iterador=biblioteca.libreros.iterator();
      while(iterador.hasNext()){
         iterador.next().MostrarEjemplares();
      }
   }

    @Test
    public void test3(){
        System.out.println("Test 3 Prestamo y devolución de un ejeplar \n");
        Biblioteca bibliotecaEscolar=new Biblioteca();
        Estudiante Ernesto = new Estudiante("Ernesto Sepúlveda", Curso.PRIMEROB);
        Ficha f1=bibliotecaEscolar.pedirEjemplar(Ernesto,"Egipto. El Mundo de los Faraones","Regine Schultz");
        f1.print();
        bibliotecaEscolar.devolverEjemplar(f1);

    }

    @Test
    public void test4 (){
        System.out.println("Varios Prestamos y devoluciones");
        Biblioteca bibliotecaLiceo = new Biblioteca();
        Estudiante E1 = new Estudiante("Ernesto Sepúlveda", Curso.PRIMEROB);
        Estudiante E2 = new Estudiante("Camila Mora", Curso.TERCEROC);
        Estudiante E3 = new Estudiante("Susana Ramirez", Curso.CUARTOA);
        Estudiante E4 = new Estudiante("Diego López", Curso.TERCEROC);
        Ficha f1=bibliotecaLiceo.pedirEjemplar(E1,"Egipto. El Mundo de los Faraones","Regine Schultz");
        Ficha f2=bibliotecaLiceo.pedirEjemplar(E2,"Romeo y Julieta", "William Shakespeare");
        Ficha f3=bibliotecaLiceo.pedirEjemplar(E3,"Atlas Sistema Respiratorio","Lepori");
        Ficha f4=bibliotecaLiceo.pedirEjemplar(E4,"Romeo y Julieta", "William Shakespeare");
        f1.print();
        f2.print();
        f3.print();
        f4.print();
        bibliotecaLiceo.devolverEjemplar(f3);
        bibliotecaLiceo.devolverEjemplar(f4);
        bibliotecaLiceo.devolverEjemplar(f2);
        bibliotecaLiceo.devolverEjemplar(f1);



    }
}
