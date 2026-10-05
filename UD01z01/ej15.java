package UD01z01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ej15 {
    public static void main(String[] args) {
        File ejercicio = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01\\ejercicios\\ejercicioFinal.txt");
        File subdir = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01\\ejercicios\\subdir");
        try {
            FileUtils.copyFileToDirectory(ejercicio, subdir);
            System.out.println("Se ha copiado el archivo");
        } catch (IOException e) {
            System.out.println("NO! Suka");
        }

    }
}
