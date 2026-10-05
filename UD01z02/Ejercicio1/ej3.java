package UD01z02.Ejercicio1;

import java.io.*;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome1, nome2;
        System.out.println("Dime la ruta absoluta del primer fichero: ");
        nome1 = sc.nextLine();
        System.out.println("Dime la ruta absoluta del segundo fichero: ");
        nome2 = sc.nextLine();


        File archivo1 = new File(nome1);
        File archivo2 = new File(nome2);

        if (!archivo2.exists()||!archivo1.exists()){
            System.out.println("Non existe");
        }


        try (BufferedWriter origen = new BufferedWriter(new FileWriter("origen.txt"));) {
            BufferedReader lector2 = new BufferedReader(new FileReader(archivo2));
            BufferedReader lector1 = new BufferedReader(new FileReader(archivo1));
            String liña = lector1.readLine();
            String liña2 = lector2.readLine();
            while (liña  != null || (liña2  != null)){
                if (liña != null){
                    origen.write(liña);
                    origen.newLine();
                    liña = lector1.readLine();
                }
                if (liña2 != null){
                    origen.write(liña2);
                    origen.newLine();
                    liña2 = lector2.readLine();
                }
            }
            origen.close();
            System.out.println("Ouushii");
        } catch (IOException e) {
            System.out.println("Error ao crear o archivo");
        }
    }
}
