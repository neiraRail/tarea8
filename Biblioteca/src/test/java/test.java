import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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

       String mostrarejemplares = "      Librero: literatura\n" +
               "1)  Titulo: It | Autor: Stephen King | Clasificación: Literatura| Año: 2003\n" +
               "                   | Edición: 19 | Editorial: HH | Estado: DISPONIBLE\n" +
               "2)  Titulo: It | Autor: Stephen King | Clasificación: Literatura| Año: 2003\n" +
               "                   | Edición: 19 | Editorial: HH | Estado: DISPONIBLE\n" +
               "3)  Titulo: Cien años de soledad | Autor: Gabriel García Márquez | Clasificación: Literatura| Año: 1997\n" +
               "                   | Edición: 15 | Editorial: Sudamericana | Estado: DISPONIBLE\n" +
               "4)  Titulo: Cien años de soledad | Autor: Gabriel García Márquez | Clasificación: Literatura| Año: 1997\n" +
               "                   | Edición: 15 | Editorial: Sudamericana | Estado: DISPONIBLE\n" +
               "5)  Titulo: Cien años de soledad | Autor: Gabriel García Márquez | Clasificación: Literatura| Año: 1997\n" +
               "                   | Edición: 15 | Editorial: Sudamericana | Estado: DISPONIBLE\n" +
               "6)  Titulo: Un mundo feliz | Autor: Aldous Huxley | Clasificación: Literatura| Año: 2011\n" +
               "                   | Edición: 5 | Editorial: Tesoro de las letras | Estado: DISPONIBLE\n" +
               "7)  Titulo: La iliada | Autor: Homero | Clasificación: Literatura| Año: 2016\n" +
               "                   | Edición: 49 | Editorial: Zig Zag | Estado: DISPONIBLE\n" +
               "8)  Titulo: La iliada | Autor: Homero | Clasificación: Literatura| Año: 2016\n" +
               "                   | Edición: 49 | Editorial: Zig Zag | Estado: DISPONIBLE\n" +
               "9)  Titulo: La iliada | Autor: Homero | Clasificación: Literatura| Año: 2016\n" +
               "                   | Edición: 49 | Editorial: Zig Zag | Estado: DISPONIBLE\n" +
               "10)  Titulo: La iliada | Autor: Homero | Clasificación: Literatura| Año: 2016\n" +
               "                   | Edición: 49 | Editorial: Zig Zag | Estado: DISPONIBLE\n" +
               "11)  Titulo: La iliada | Autor: Homero | Clasificación: Literatura| Año: 2016\n" +
               "                   | Edición: 49 | Editorial: Zig Zag | Estado: DISPONIBLE\n" +
               "12)  Titulo: Romeo y Julieta | Autor: William Shakespeare | Clasificación: Literatura| Año: 2014\n" +
               "                   | Edición: 32 | Editorial: Tesoro de las letras | Estado: DISPONIBLE\n" +
               "13)  Titulo: Romeo y Julieta | Autor: William Shakespeare | Clasificación: Literatura| Año: 2014\n" +
               "                   | Edición: 32 | Editorial: Tesoro de las letras | Estado: DISPONIBLE\n" +
               "14)  Titulo: Romeo y Julieta | Autor: William Shakespeare | Clasificación: Literatura| Año: 2014\n" +
               "                   | Edición: 32 | Editorial: Tesoro de las letras | Estado: DISPONIBLE\n" +
               "15)  Titulo: Romeo y Julieta | Autor: William Shakespeare | Clasificación: Literatura| Año: 2014\n" +
               "                   | Edición: 32 | Editorial: Tesoro de las letras | Estado: DISPONIBLE\n";
       assertEquals(mostrarejemplares,librero.MostrarEjemplares());



       System.out.print("--------------Librero ordenado Por Titulo--------------");
       String porTitulo = "      Librero: literatura\n" +
               "1)  Titulo: Cien años de soledad | Autor: Gabriel García Márquez | Clasificación: Literatura| Año: 1997\n" +
               "                   | Edición: 15 | Editorial: Sudamericana | Estado: DISPONIBLE\n" +
               "2)  Titulo: Cien años de soledad | Autor: Gabriel García Márquez | Clasificación: Literatura| Año: 1997\n" +
               "                   | Edición: 15 | Editorial: Sudamericana | Estado: DISPONIBLE\n" +
               "3)  Titulo: Cien años de soledad | Autor: Gabriel García Márquez | Clasificación: Literatura| Año: 1997\n" +
               "                   | Edición: 15 | Editorial: Sudamericana | Estado: DISPONIBLE\n" +
               "4)  Titulo: It | Autor: Stephen King | Clasificación: Literatura| Año: 2003\n" +
               "                   | Edición: 19 | Editorial: HH | Estado: DISPONIBLE\n" +
               "5)  Titulo: It | Autor: Stephen King | Clasificación: Literatura| Año: 2003\n" +
               "                   | Edición: 19 | Editorial: HH | Estado: DISPONIBLE\n" +
               "6)  Titulo: La iliada | Autor: Homero | Clasificación: Literatura| Año: 2016\n" +
               "                   | Edición: 49 | Editorial: Zig Zag | Estado: DISPONIBLE\n" +
               "7)  Titulo: La iliada | Autor: Homero | Clasificación: Literatura| Año: 2016\n" +
               "                   | Edición: 49 | Editorial: Zig Zag | Estado: DISPONIBLE\n" +
               "8)  Titulo: La iliada | Autor: Homero | Clasificación: Literatura| Año: 2016\n" +
               "                   | Edición: 49 | Editorial: Zig Zag | Estado: DISPONIBLE\n" +
               "9)  Titulo: La iliada | Autor: Homero | Clasificación: Literatura| Año: 2016\n" +
               "                   | Edición: 49 | Editorial: Zig Zag | Estado: DISPONIBLE\n" +
               "10)  Titulo: La iliada | Autor: Homero | Clasificación: Literatura| Año: 2016\n" +
               "                   | Edición: 49 | Editorial: Zig Zag | Estado: DISPONIBLE\n" +
               "11)  Titulo: Romeo y Julieta | Autor: William Shakespeare | Clasificación: Literatura| Año: 2014\n" +
               "                   | Edición: 32 | Editorial: Tesoro de las letras | Estado: DISPONIBLE\n" +
               "12)  Titulo: Romeo y Julieta | Autor: William Shakespeare | Clasificación: Literatura| Año: 2014\n" +
               "                   | Edición: 32 | Editorial: Tesoro de las letras | Estado: DISPONIBLE\n" +
               "13)  Titulo: Romeo y Julieta | Autor: William Shakespeare | Clasificación: Literatura| Año: 2014\n" +
               "                   | Edición: 32 | Editorial: Tesoro de las letras | Estado: DISPONIBLE\n" +
               "14)  Titulo: Romeo y Julieta | Autor: William Shakespeare | Clasificación: Literatura| Año: 2014\n" +
               "                   | Edición: 32 | Editorial: Tesoro de las letras | Estado: DISPONIBLE\n" +
               "15)  Titulo: Un mundo feliz | Autor: Aldous Huxley | Clasificación: Literatura| Año: 2011\n" +
               "                   | Edición: 5 | Editorial: Tesoro de las letras | Estado: DISPONIBLE\n";
       librero.ordenarPorTitulo();
       assertEquals(porTitulo,librero.MostrarEjemplares());

       System.out.print("---------------Librero ordenado Por Autor----------------");
       String porAutor = "      Librero: literatura\n" +
               "1)  Titulo: Un mundo feliz | Autor: Aldous Huxley | Clasificación: Literatura| Año: 2011\n" +
               "                   | Edición: 5 | Editorial: Tesoro de las letras | Estado: DISPONIBLE\n" +
               "2)  Titulo: Cien años de soledad | Autor: Gabriel García Márquez | Clasificación: Literatura| Año: 1997\n" +
               "                   | Edición: 15 | Editorial: Sudamericana | Estado: DISPONIBLE\n" +
               "3)  Titulo: Cien años de soledad | Autor: Gabriel García Márquez | Clasificación: Literatura| Año: 1997\n" +
               "                   | Edición: 15 | Editorial: Sudamericana | Estado: DISPONIBLE\n" +
               "4)  Titulo: Cien años de soledad | Autor: Gabriel García Márquez | Clasificación: Literatura| Año: 1997\n" +
               "                   | Edición: 15 | Editorial: Sudamericana | Estado: DISPONIBLE\n" +
               "5)  Titulo: La iliada | Autor: Homero | Clasificación: Literatura| Año: 2016\n" +
               "                   | Edición: 49 | Editorial: Zig Zag | Estado: DISPONIBLE\n" +
               "6)  Titulo: La iliada | Autor: Homero | Clasificación: Literatura| Año: 2016\n" +
               "                   | Edición: 49 | Editorial: Zig Zag | Estado: DISPONIBLE\n" +
               "7)  Titulo: La iliada | Autor: Homero | Clasificación: Literatura| Año: 2016\n" +
               "                   | Edición: 49 | Editorial: Zig Zag | Estado: DISPONIBLE\n" +
               "8)  Titulo: La iliada | Autor: Homero | Clasificación: Literatura| Año: 2016\n" +
               "                   | Edición: 49 | Editorial: Zig Zag | Estado: DISPONIBLE\n" +
               "9)  Titulo: La iliada | Autor: Homero | Clasificación: Literatura| Año: 2016\n" +
               "                   | Edición: 49 | Editorial: Zig Zag | Estado: DISPONIBLE\n" +
               "10)  Titulo: It | Autor: Stephen King | Clasificación: Literatura| Año: 2003\n" +
               "                   | Edición: 19 | Editorial: HH | Estado: DISPONIBLE\n" +
               "11)  Titulo: It | Autor: Stephen King | Clasificación: Literatura| Año: 2003\n" +
               "                   | Edición: 19 | Editorial: HH | Estado: DISPONIBLE\n" +
               "12)  Titulo: Romeo y Julieta | Autor: William Shakespeare | Clasificación: Literatura| Año: 2014\n" +
               "                   | Edición: 32 | Editorial: Tesoro de las letras | Estado: DISPONIBLE\n" +
               "13)  Titulo: Romeo y Julieta | Autor: William Shakespeare | Clasificación: Literatura| Año: 2014\n" +
               "                   | Edición: 32 | Editorial: Tesoro de las letras | Estado: DISPONIBLE\n" +
               "14)  Titulo: Romeo y Julieta | Autor: William Shakespeare | Clasificación: Literatura| Año: 2014\n" +
               "                   | Edición: 32 | Editorial: Tesoro de las letras | Estado: DISPONIBLE\n" +
               "15)  Titulo: Romeo y Julieta | Autor: William Shakespeare | Clasificación: Literatura| Año: 2014\n" +
               "                   | Edición: 32 | Editorial: Tesoro de las letras | Estado: DISPONIBLE\n";
       librero.ordenarPorAutor();
       assertEquals(porAutor,librero.MostrarEjemplares());
   }

   @Test
   public void test2 (){
       Biblioteca biblioteca = new Biblioteca();
       biblioteca.agregarLibrero("Europeo");
       biblioteca.agregarLibrero("Latinoamericano");
       biblioteca.agregarLibrero("Librero Reserva");

       biblioteca.agregarLibro("It", "Stephen King", Clasificacion.LITERATURA, "HH",2003, 19,2,1);
       biblioteca.agregarLibro("Un mundo feliz", "Aldous Huxley", Clasificacion.LITERATURA, "Tesoro de las letras",2011, 5,1,1);
       biblioteca.agregarLibro("Cien años de soledad", "Gabriel García Márquez", Clasificacion.LITERATURA, "Sudamericana",1997, 15,3,2);
       biblioteca.agregarLibro("La iliada", "Homero", Clasificacion.LITERATURA, "Zig Zag",2016, 49,5,3);
       biblioteca.agregarLibro("Romeo y Julieta", "William Shakespeare", Clasificacion.LITERATURA, "Tesoro de las letras",2014, 32,4,3);


      System.out.print("Mostar todos los Ejemplares Por librero");
      String expected = "      Librero: Europeo\n" +
              "1)  Titulo: It | Autor: Stephen King | Clasificación: Literatura| Año: 2003\n" +
              "                   | Edición: 19 | Editorial: HH | Estado: DISPONIBLE\n" +
              "2)  Titulo: It | Autor: Stephen King | Clasificación: Literatura| Año: 2003\n" +
              "                   | Edición: 19 | Editorial: HH | Estado: DISPONIBLE\n" +
              "3)  Titulo: Un mundo feliz | Autor: Aldous Huxley | Clasificación: Literatura| Año: 2011\n" +
              "                   | Edición: 5 | Editorial: Tesoro de las letras | Estado: DISPONIBLE\n" +
              "      Librero: Latinoamericano\n" +
              "1)  Titulo: Cien años de soledad | Autor: Gabriel García Márquez | Clasificación: Literatura| Año: 1997\n" +
              "                   | Edición: 15 | Editorial: Sudamericana | Estado: DISPONIBLE\n" +
              "2)  Titulo: Cien años de soledad | Autor: Gabriel García Márquez | Clasificación: Literatura| Año: 1997\n" +
              "                   | Edición: 15 | Editorial: Sudamericana | Estado: DISPONIBLE\n" +
              "3)  Titulo: Cien años de soledad | Autor: Gabriel García Márquez | Clasificación: Literatura| Año: 1997\n" +
              "                   | Edición: 15 | Editorial: Sudamericana | Estado: DISPONIBLE\n" +
              "      Librero: Librero Reserva\n" +
              "1)  Titulo: La iliada | Autor: Homero | Clasificación: Literatura| Año: 2016\n" +
              "                   | Edición: 49 | Editorial: Zig Zag | Estado: DISPONIBLE\n" +
              "2)  Titulo: La iliada | Autor: Homero | Clasificación: Literatura| Año: 2016\n" +
              "                   | Edición: 49 | Editorial: Zig Zag | Estado: DISPONIBLE\n" +
              "3)  Titulo: La iliada | Autor: Homero | Clasificación: Literatura| Año: 2016\n" +
              "                   | Edición: 49 | Editorial: Zig Zag | Estado: DISPONIBLE\n" +
              "4)  Titulo: La iliada | Autor: Homero | Clasificación: Literatura| Año: 2016\n" +
              "                   | Edición: 49 | Editorial: Zig Zag | Estado: DISPONIBLE\n" +
              "5)  Titulo: La iliada | Autor: Homero | Clasificación: Literatura| Año: 2016\n" +
              "                   | Edición: 49 | Editorial: Zig Zag | Estado: DISPONIBLE\n" +
              "6)  Titulo: Romeo y Julieta | Autor: William Shakespeare | Clasificación: Literatura| Año: 2014\n" +
              "                   | Edición: 32 | Editorial: Tesoro de las letras | Estado: DISPONIBLE\n" +
              "7)  Titulo: Romeo y Julieta | Autor: William Shakespeare | Clasificación: Literatura| Año: 2014\n" +
              "                   | Edición: 32 | Editorial: Tesoro de las letras | Estado: DISPONIBLE\n" +
              "8)  Titulo: Romeo y Julieta | Autor: William Shakespeare | Clasificación: Literatura| Año: 2014\n" +
              "                   | Edición: 32 | Editorial: Tesoro de las letras | Estado: DISPONIBLE\n" +
              "9)  Titulo: Romeo y Julieta | Autor: William Shakespeare | Clasificación: Literatura| Año: 2014\n" +
              "                   | Edición: 32 | Editorial: Tesoro de las letras | Estado: DISPONIBLE\n";



        StringBuilder ejemplares = new StringBuilder();
      Iterator<Librero> iterador=biblioteca.libreros.iterator();
      while(iterador.hasNext()){
         ejemplares.append(iterador.next().MostrarEjemplares());
      }

      assertEquals(expected, ejemplares.toString());
   }

    @Test
    public void test3(){
        System.out.println("Test 3 Prestamo y devolución de un ejeplar \n");
        Biblioteca bibliotecaEscolar=new Biblioteca();
        bibliotecaEscolar.agregarLibrero("Europeo");
        bibliotecaEscolar.agregarLibro("It", "Stephen King", Clasificacion.LITERATURA, "HH",2003, 19,2,1);


        Estudiante Ernesto = new Estudiante("Ernesto Sepúlveda", Curso.PRIMEROB);
        Ficha f1=bibliotecaEscolar.pedirEjemplar(Ernesto,"It", "Stephen King");
        f1.print();
        bibliotecaEscolar.devolverEjemplar(f1);

    }

    @Test
    public void test4 (){
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        final PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        System.out.println("Varios Prestamos y devoluciones");
        Biblioteca bibliotecaLiceo = new Biblioteca();
        bibliotecaLiceo.crearLibreros();
        bibliotecaLiceo.llenarLibreros();
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

        String mensajes = "Varios Prestamos y devoluciones\n" +
                "Retiro exitoso de Egipto. El Mundo de los Faraones\n" +
                "Retiro exitoso de Romeo y Julieta\n" +
                "Retiro exitoso de Atlas Sistema Respiratorio\n" +
                "Retiro exitoso de Romeo y Julieta\n" +
                "-----------------------------------------Ficha------------------------------------------------\n" +
                "Número ficha:1\n" +
                "Estudiante: Ernesto Sepúlveda     Curso: 1°B\n" +
                "Detalles del Ejemplar:\n" +
                "   Titulo: Egipto. El Mundo de los Faraones | Autor: Regine Schultz | Clasificación: Historia y Geografía| Año: 2008\n" +
                "                   | Edición: 10 | Editorial: H.F. Ullman | Estado: NO DISPONIBLELibrero:Historia, Geografía y Ciencias Sociales\n" +
                "Fecha de Prestamo: 2020-07-23\n" +
                "Fecha de devolucion: 2020-07-30\n" +
                "---------------------------------------------------------------------------------------------------\n" +
                "-----------------------------------------Ficha------------------------------------------------\n" +
                "Número ficha:2\n" +
                "Estudiante: Camila Mora     Curso: 3°C\n" +
                "Detalles del Ejemplar:\n" +
                "   Titulo: Romeo y Julieta | Autor: William Shakespeare | Clasificación: Literatura| Año: 2014\n" +
                "                   | Edición: 32 | Editorial: Tesoro de las letras | Estado: NO DISPONIBLELibrero:Lengua y Literatura\n" +
                "Fecha de Prestamo: 2020-07-23\n" +
                "Fecha de devolucion: 2020-07-30\n" +
                "---------------------------------------------------------------------------------------------------\n" +
                "-----------------------------------------Ficha------------------------------------------------\n" +
                "Número ficha:3\n" +
                "Estudiante: Susana Ramirez     Curso: 4°A\n" +
                "Detalles del Ejemplar:\n" +
                "   Titulo: Atlas Sistema Respiratorio | Autor: Lepori | Clasificación: Ciencias Naturales| Año: 2003\n" +
                "                   | Edición: 15 | Editorial: Servicios Editoriales y Educativos | Estado: NO DISPONIBLELibrero:Matemática y Ciencias Naturales\n" +
                "Fecha de Prestamo: 2020-07-23\n" +
                "Fecha de devolucion: 2020-07-30\n" +
                "---------------------------------------------------------------------------------------------------\n" +
                "-----------------------------------------Ficha------------------------------------------------\n" +
                "Número ficha:4\n" +
                "Estudiante: Diego López     Curso: 3°C\n" +
                "Detalles del Ejemplar:\n" +
                "   Titulo: Romeo y Julieta | Autor: William Shakespeare | Clasificación: Literatura| Año: 2014\n" +
                "                   | Edición: 32 | Editorial: Tesoro de las letras | Estado: NO DISPONIBLELibrero:Lengua y Literatura\n" +
                "Fecha de Prestamo: 2020-07-23\n" +
                "Fecha de devolucion: 2020-07-30\n" +
                "---------------------------------------------------------------------------------------------------\n" +
                "Se ha devuelto exitosamento Atlas Sistema Respiratorio\n" +
                "Se ha devuelto exitosamento Romeo y Julieta\n" +
                "Se ha devuelto exitosamento Romeo y Julieta\n" +
                "Se ha devuelto exitosamento Egipto. El Mundo de los Faraones";

        assertEquals(mensajes, outContent.toString().trim().replace("\r",""));



    }
}
