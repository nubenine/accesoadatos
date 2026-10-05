package Actividad04SergioMorais;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("\n-------MENÚ PRINCIPAL-------");
        System.out.println("1: Insertar nuevo libro");
        System.out.println("2: Consultar libros guardados");
        System.out.println("3: Consultar libro");
        System.out.println("0: Salir");
        System.out.print("\n-Eleccion: ");
    }

    public static boolean checkearArchivo() throws IOException {
        boolean creado = false;
        File archivo = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\Actividad04SergioMorais\\libraria.dat");
        if (!archivo.exists()){
            if (archivo.createNewFile()){
                System.out.println("Se ha creado el archivo");
                creado = true;
            }
        } else {
            if (archivo.length()==0){
                creado = true;
            }
        }
        return creado;
    }



    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            do {
                menu();
                opcion = sc.nextInt();
                if (opcion <0||opcion>3){
                    System.out.println("Error, selecciona una opcion valida");
                }
            } while (opcion <0||opcion>3);

            switch (opcion){
                case 1:
                    File archivo = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\Actividad04SergioMorais\\libraria.dat");
                    if (!archivo.exists()){
                        if (archivo.createNewFile()){
                            System.out.println("Se ha creado el archivo");
                        }
                    }
                    FileOutputStream fos = new FileOutputStream(archivo, true);
                    ObjectOutputStream libreria;
                    if (archivo.length() == 0){
                        libreria = new ObjectOutputStream(fos);
                    } else {
                        libreria = new MiObjectOutputStreams(fos);
                    }

                    String titulo, autor, isbn;
                    double precio;
                    int stock;
                    sc.nextLine();
                    System.out.println("Dime el titulo del libro: ");
                    titulo = sc.nextLine();
                    System.out.println("Dime el autor del libro: ");
                    autor = sc.nextLine();
                    System.out.println("Dime el isbn del titulo: ");
                    isbn = sc.nextLine();
                    System.out.println("Dime el precio del libro: ");
                    precio = sc.nextDouble();
                    System.out.println("Dime el stock: ");
                    stock = sc.nextInt();
                    Libro libro = new Libro(titulo, autor,isbn, precio,stock);
                    libreria.writeObject(libro);
                    System.out.println("Libro insertado correctamente");
                    libreria.close();
                    break;
                case 2:
                    //Consultar libros guardados
                    if (checkearArchivo()){
                        System.out.println("El archivo esta vacio");
                        break;
                    } else {
                        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\Actividad04SergioMorais\\libraria.dat"));
                        while (true){
                            try{
                                Libro guardados= (Libro) ois.readObject();
                                System.out.println("-Libro: " + guardados);
                            } catch (EOFException e) {
                                break;
                            }
                        }
                    }
                    break;


                case 3:
                    //Consultar un libro
                    if (checkearArchivo()){
                        System.out.println("El archivo esta vacio");
                        break;
                    } else {
                        ObjectInputStream ai = new ObjectInputStream(new FileInputStream("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\Actividad04SergioMorais\\libraria.dat"));
                        boolean encontrado = false;
                        sc.nextLine();
                        System.out.print("Dime el isbn del libro el cual quieras consultar: ");
                        isbn = sc.nextLine();

                        while (true){
                            try{
                                Libro guardados = (Libro) ai.readObject();
                                if (guardados.getIsbn().equalsIgnoreCase(isbn)){
                                    System.out.println("-Libro: " + guardados);
                                    encontrado=true;
                                }
                            } catch (EOFException e) {
                                break;
                            }
                        }
                        if(!encontrado){
                            System.out.println("--No se ha encontrado ningun libro con ese ISBN--");
                        }
                    }
                    break;

            }
        } while (opcion!=0);

        System.out.println("Gracias por usar el programa");

    }
}
