package UD01z01;

import java.io.File;

public class ej12 {
    public static void main(String[] args) {
        File ejercicio = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01\\ejercicios\\ejercicio1.txt");
        if (ejercicio.delete()){
            System.out.println("Borrado nigga");
        } else {
            System.out.println("NO! Suka");
        }
    }
}
