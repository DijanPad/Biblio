import java.util.ArrayList;
import java.util.Scanner;

public class Biblio {
    
    public static void main(String[] args){

    String menu = "=== Bienvenidos a la Biblio === \n" +
    "1.	Agregar un Documento\n"+
    "2.	Prestar un Documento\n"+
    "3.	Devolución de Documentos\n"+
    "4.	Numero de Documentos por materia\n"+
    "5.	Cantidad de revistas por materia\n"+
    "6.	Ver todos los libros\n"+
    "7.	Salir\n";

    ArrayList<Texto> documentos = new ArrayList<Texto>();
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    documentos.add(new Libro(true, "Fisica", "Tippens", 123456, "Fisica", 5, "Pearson"));
    documentos.add(new Libro(true, "Química Orgánica", "Solomons", 987123, "Química", 4, "Wiley"));
    documentos.add(new Libro(true, "Historia del Arte", "Gombrich", 543210, "Arte", 7, "Phaidon"));
    documentos.add(new Libro(true, "Economía Mundial", "Samuelson", 123789, "Economía", 6, "McGraw-Hill"));

    documentos.add(new Revista(true, "NatGeo Wild", 321654, "Biologia", 2, 2023, 4));
    documentos.add(new Revista(true, "National Geographic", 111111, "Geografía", 3, 2023, 10));
    documentos.add(new Revista(true, "Science", 555555, "Ciencias", 1, 2023, 7));

    documentos.add(new Articulo(true, "Inteligencia Artificial", "Andrea López", 456789, "Informática", 5));
    documentos.add(new Articulo(true, "Espacios Vectoriales", "Mario Castillo", 987065, "Algebra Lienal", 1));
    documentos.add(new Articulo(true, "Cambio Climático", "Carlos Pérez", 987654, "Medio Ambiente", 2));
   
    
    clientes.add(new Cliente(1234, "Bran", "Su casa"));
    clientes.add(new Cliente(3452, "Iris", "Z14"));
    clientes.add(new Cliente(4123, "Jonathan", "Villa Nueva"));
    clientes.add(new Cliente(9688, "Anggie", "Naranjo"));
    clientes.add(new Cliente(5567, "David", "San Cristobal"));

    boolean on = true;
    Scanner scanner = new Scanner(System.in);
    String inputOption;

    while(on == true){
        System.out.println(menu);
        inputOption = scanner.nextLine();
        if (inputOption.equals("1")){

        } else if(inputOption.equals("2")){

        } else if(inputOption.equals("3")){

        } else if(inputOption.equals("4")){

        } else if(inputOption.equals("5")){

        } else if(inputOption.equals("6")){

        } else if(inputOption.equals("7")){
            on = false;
        } else{
            System.out.println("Ingresa una opcion valida\n");
        }

    }
    

    }

}
