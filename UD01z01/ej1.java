package UD01z01;

import java.io.File;
import java.io.IOException;

public class ej1 {
    public static void main(String[] args) {
        File dirEjercicios = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01", "ejercicios");
        if (dirEjercicios.mkdir()){
            System.out.println("Archivo creado");
        } else {
            System.out.println("Ya existe");
        }
    }


}
