package UD01z01;

import java.io.File;
import java.util.Date;

public class ej13 {
    public static void main(String[] args) {
        File ejercicio = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01\\ejercicios\\ejercicio2.txt");
        long fecha = ejercicio.lastModified();
        System.out.println("Ultima vez modificado: " + new Date(fecha));
    }
}
