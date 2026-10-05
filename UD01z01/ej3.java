package UD01z01;

import java.io.File;

public class ej3 {
    public static void main(String[] args) {
        File ejerUno = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01\\ejercicios\\ejercicio1.txt");
        if (ejerUno.exists()){
            System.out.println("Nombre: " + ejerUno.getName());
            System.out.println("Ruta: " + ejerUno.getPath());
            System.out.println("Ruta absoluta: " + ejerUno.getAbsolutePath());
            System.out.println("Ruta del directorio padre: " + ejerUno.getParentFile().getPath());
            if (ejerUno.canWrite()){
                System.out.println("Se puede escribir");
            } else {
                System.out.println("No se puede escribir");
            }
            if (ejerUno.canRead()){
                System.out.println("Se puede leer");
            } else {
                System.out.println("No se puede leer");
            }
            System.out.println("Tamaño en bytes: " + ejerUno.length());
        }

    }
}
