package UD01z01;

import java.io.File;

public class ej11 {
    public static void main(String[] args) {
        File ejercicios = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01\\ejercicios");
        File[] ficheros =ejercicios.listFiles();

        for (File fichero : ficheros) {
            System.out.println(fichero.getName());
        }
    }
}
