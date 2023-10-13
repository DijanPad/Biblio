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
    boolean ask = false;

    while(on == true){
        System.out.println(menu);
        System.out.println("Ingresa una opcion: ");
        inputOption = scanner.nextLine();
        
        
        if (inputOption.equals("1")){
            ask = true;
            while (ask == true){
            System.out.println("Que tipo de documento deseas agregar?\n"+
            "1. Libro\n"+
            "2. Revista\n"+
            "3. Articulo\n"+
            "4. Ninguno\n");
            System.out.println("Ingresa una opcion: ");
            inputOption = scanner.nextLine();
                if (inputOption.equals("1")){
                    System.out.println("Ingrese el Titulo: "); 
                    String titulo = scanner.nextLine();
                    System.out.println("Ingrese el Autor: "); 
                    String autor = scanner.nextLine();
                    System.out.println("Ingrese el Id: "); 
                    int id = scanner.nextInt();
                    System.out.println("Ingrese la materia: "); 
                    String materia = scanner.nextLine();
                    materia = scanner.nextLine();
                    System.out.println("Ingrese la cantidad: "); 
                    int cantidad = scanner.nextInt();
                    System.out.println("Ingrese la editorial: "); 
                    String editorial = scanner.nextLine();

                    documentos.add(new Libro(true, titulo, autor, id, materia, cantidad, editorial));

                } else if(inputOption.equals("2")){

                    System.out.println("Ingrese el titulo: "); 
                    String titulo = scanner.nextLine();
                    System.out.println("Ingrese el Id: "); 
                    int nIdentif = scanner.nextInt();
                    System.out.println("Ingrese la materia: "); 
                    String materia = scanner.nextLine();
                    System.out.println("Ingrese la cantidad: "); 
                    int cantidad = scanner.nextInt();
                    System.out.println("Ingrese el anio de lanzmamiento: "); 
                    int anio = scanner.nextInt();
                    System.out.println("Ingrese el nuemro de edicion: "); 
                    int numero = scanner.nextInt();

                    documentos.add(new Revista(true, titulo, nIdentif, materia, cantidad, anio, numero));

                } else if(inputOption.equals("3")){

                    System.out.println("Ingrese el titulo: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Ingrese el autor: ");
                    String autor = scanner.nextLine();
                    System.out.println("Ingrese el ID: ");
                    int nIdentif = scanner.nextInt();
                    System.out.println("Ingrese la materia: ");
                    String materia = scanner.nextLine();
                    System.out.println("Ingrese la cantidad: ");
                    int cantidad = scanner.nextInt();

                    documentos.add(new Articulo(true, titulo, autor, nIdentif, materia, cantidad));
                } else if(inputOption.equals("4")){
                    ask = !ask;
                } else{
                    System.out.println("Ingresa una opcion valida\n");
        }}

        } else if(inputOption.equals("2")){

            System.out.println("Ingresa tu ID: ");
            int id = scanner.nextInt();


            System.out.println("Todos los documentos disponibles: ");
            int j;
            for(int i = 0; i < documentos.size(); i++) {
                j = i+1;
                if(documentos.get(i).getDisponible() == true){
                    System.out.println(j + ". " + documentos.get(i).toString());
                }
            }
            System.out.println("\n");

            System.out.println("Ingrese el indice del documento que desea rentar: ");
            int h = scanner.nextInt();
            h = h -1;
            
            System.out.println("Ingrese la fecha del dia de hoy: ");
                    String fsol = scanner.nextLine();
                    fsol = scanner.nextLine();
            System.out.println("Ingrese la fecha en la que lo devolvera: ");
                    String fdev = scanner.nextLine();


             
            for (int i = 0; i<clientes.size(); i++){
                if(clientes.get(i).getnIdentif() == id){
                    clientes.get(i).setPrestamos(documentos.get(h).getTitulo(), fsol, fdev);
                    documentos.get(h).setDisponible(false);
                }
            }

        } else if(inputOption.equals("3")){

            System.out.println("Ingresa tu ID: ");
            int id = scanner.nextInt();


            System.out.println("Todos los documentos prestados: ");
            int j;
            for(int i = 0; i < documentos.size(); i++) {
                j = i+1;
                if(documentos.get(i).getDisponible() == false){
                    System.out.println(j + ". " + documentos.get(i).toString());
                }
            }
            System.out.println("\n");

            System.out.println("Ingrese el indice del documento que desea devolver: ");
            int h = scanner.nextInt();
            h = h -1;

            
            for (int i = 0; i<clientes.size(); i++){
                if(clientes.get(i).getnIdentif() == id){
                    clientes.get(i).resetPrestamos(documentos.get(h).getTitulo());
                    documentos.get(h).setDisponible(true); 
                }
            }

        } else if(inputOption.equals("4")){

        } else if(inputOption.equals("5")){

        } else if(inputOption.equals("6")){
            for(int i = 0; i < documentos.size(); i++) {
                if(documentos.get(i) instanceof Libro){
                    System.out.println(documentos.get(i).getTitulo() + " / " + documentos.get(i).getAutor() + " / " + documentos.get(i).getMateria());
                }
                System.out.println("\n");
            }

        } else if(inputOption.equals("7")){
            on = false;

        } else{
            System.out.println("Ingresa una opcion valida\n");
        }

    }
    }
}
