package UD01z01;

import java.io.File;
import java.io.IOException;

public class ej4 {
    public static void main(String[] args) throws IOException {
        File ejerDos = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01\\ejercicios", "ejercicio2.txt");
        if (ejerDos.createNewFile()){
            System.out.println("Archivo creado");
        } else {
            System.out.println("Ya existe");
        }
    }
}
