package UD01z01;

import java.io.File;
import java.io.IOException;

public class ej2 {
    public static void main(String[] args) {
        try {
            File ejercUno = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01\\ejercicios", "ejercicio1.txt");
            if (ejercUno.createNewFile()){
                System.out.println("Archivo creado");
            } else {
                System.out.println("Ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error ao crear o archivo");
        }
    }
}
