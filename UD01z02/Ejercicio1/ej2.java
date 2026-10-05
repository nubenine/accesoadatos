package UD01z02.Ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ej2 {
    public static void main(String[] args) {
        try {
            BufferedReader lector = new BufferedReader((new FileReader("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z02\\Ejercicio1\\primos.dat")));
            String liña;
            while   ((liña = lector.readLine()) !=null){
                System.out.println(liña);
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Erro ao leero o ficheiro");
        }

    }
}
