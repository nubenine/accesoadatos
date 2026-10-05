package UD01z01;

import java.io.File;


public class ej14 {
    public static void main(String[] args) {
        File ejercicio = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01\\ejercicios\\ejercicio2.txt");
        if (ejercicio.renameTo(new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01\\ejercicios\\ejercicioFinal.txt"))){
            System.out.println("Se ha cambiado");
        } else {
            System.out.println("NO! Suka");
        }


    }
}
