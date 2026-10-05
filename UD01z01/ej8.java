package UD01z01;

import java.io.File;

public class ej8 {
    public static void main(String[] args) {
        File ejercicios = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01\\ejercicios");
        File[] ficheros =ejercicios.listFiles();

        for (int i = 0; i < ficheros.length; i++) {
            System.out.println("Nome do archivo: " + ficheros[i].getName());
            System.out.print("Tipo de archivo: ");
            if (ficheros[i].isDirectory()){
                System.out.println("Directorio");
            } else if (ficheros[i].isFile()){
                System.out.println("Archivo");
            }
            System.out.println("------------------------");
        }
    }
}
