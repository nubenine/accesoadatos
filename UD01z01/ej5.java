package UD01z01;

import java.io.File;
import java.io.IOException;

public class ej5 {
    public static void main(String[] args) throws IOException {
        File subdir = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01\\ejercicios", "subdir");
        if (subdir.mkdir()){
            File subejem = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01\\ejercicios\\subdir", "subejemplo.txt");
            if (subejem.createNewFile()){
                System.out.println("Archivo creado");
            } else {
                System.out.println("NO! Suka");
            }
        } else {
            System.out.println("NO! Suka");
        }

    }
}
