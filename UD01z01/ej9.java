package UD01z01;

import java.io.File;

public class ej9 {
    public static void main(String[] args) {
        File ejercicios = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01\\ejercicios");
        File[] ficheros =ejercicios.listFiles();

        for (int i = 0; i < ficheros.length; i++) {
            if (ficheros[i].getName().contains(".pdf")){
                System.out.println(ficheros[i].getName());
            }
        }
    }
}
