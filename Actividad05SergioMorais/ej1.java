package Actividad05SergioMorais;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ej1 {
    private static final int TITULO_LONG = 30;
    private static final int AUTOR_LONG = 50;
    public static void alta() throws IOException {
        String[] titulos = {"Big Dick Randy", "Sus didy", "Siseben", "Aaayyy"};
        String[] autores = {"Nigga", "Diddy ahh foid", "Sixevenaldo Da Silva Junior", "Ay que miedo yo me void::eyes:"};
        double[] precios = {69.420, 33.33, 67.67, 1};
        int[] stock = {69, 4, 67, 2};

        try {
            RandomAccessFile raf = new RandomAccessFile("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\Actividad05SergioMorais\\libros.dat", "rw");
            for (int i = 0; i < titulos.length; i++) {
                raf.writeInt(i +1);
                StringBuffer titulossb = new StringBuffer(titulos[i]);
                titulossb.setLength(TITULO_LONG);
                raf.writeChars(titulossb.toString());
                StringBuffer autoressb = new StringBuffer(autores[i]);
                autoressb.setLength(AUTOR_LONG);
                raf.writeChars(autoressb.toString());
                raf.writeDouble(precios[i]);
                raf.writeInt(stock[i]);
            }
            System.out.println("\nLibros dado de alta con exito\uD83D\uDC40\n");
        } catch (FileNotFoundException e) {
            System.out.println("Ouuu\uD83D\uDC40");
            File libros = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\Actividad05SergioMorais\\libros.dat");
            if (libros.createNewFile()){
                System.out.println("Archivo creado");
            }
        } catch (IOException e) {
            System.out.println("Aaaay\uD83D\uDC40"); //Emoji de ojos
        }

    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);


        int opcion, opcionConsultas;
        String menu = "---MENU PRINCIPAL---" +
                "\n\t-1: Altas" +
                "\n\t-2: Listado del fichero completo con la valoracion total del inventario" +
                "\n\t-3: Consultas" +
                "\n\t-4: Modificaciones" +
                "\n\t-5: Salir" +
                "\n\n-Eleccion: ";
        String consultas = "\n\t-Consultas: " +
                "\n\t\t-3.1: De un registro determinado (por codigo)" +
                "\n\t\t-3.2: Buscar los libros de un autor determinado" +
                "\n\t\t-3.3: Volver" +
                "\n\n\t-Eleccion (1, 2 o 3): ";
        do {
            //codigo  (randomfiles y all the rollo y etc nigga nigga)
            System.out.print(menu);
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    alta();
                    break;
                case 2:
                    //codigo nigga
                    System.out.println();
                    break;
                case 3:
                    //codigo nigga 67 george floyd
                    System.out.print(consultas);
                    opcionConsultas = sc.nextInt();
                    switch (opcionConsultas){
                        case 1:
                            //codigo sicseben foid nigga aaayfatfuck
                            System.out.println();
                            break;
                        case 2:
                            //fuck nigga codigo
                            System.out.println();
                            break;
                        case 3:
                            System.out.println("\t<--Volver");
                            break;
                    }
                case 4:
                    //sus didy codigo siseben
                    System.out.println();
                    break;
                case 5:
                    System.out.println("acabouse");
                    break;
            }
        } while (opcion != 5);
    }
}
