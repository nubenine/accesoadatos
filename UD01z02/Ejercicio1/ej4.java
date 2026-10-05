package UD01z02.Ejercicio1;

import java.io.*;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File archivo = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z02\\Ejercicio1\\origen.txt");
        int recurrencias = 0;
        String palabra;


        System.out.println("Dime una palabra para ver cuantas veces se repite: ");
        palabra = sc.nextLine();

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String liña = lector.readLine();
            String[] palabras;
            while (liña != null){
                liña = lector.readLine();
                if (liña!=null){
                    palabras = liña.split(" ");
                    for (String s : palabras) {
                        if (s.equals(palabra)) {
                            recurrencias++;
                        }
                    }
                }
            }
            System.out.println("Recurrencias: " + recurrencias);
        } catch (FileNotFoundException e) {
            System.out.println("Error nigga");
        }
    }
}
