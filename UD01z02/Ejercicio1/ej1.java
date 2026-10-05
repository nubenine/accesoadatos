package UD01z02.Ejercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ej1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Numeros primos del 1 al 500");
        BufferedWriter primos = new BufferedWriter(new FileWriter("primos.dat"));


        for (int i = 1; i < 500; i++) {
            boolean esPrimo = true;
            if (i>2){
                for (int j = 2; j < i && esPrimo; j++) {
                    if(i%j==0){
                        esPrimo = false;
                        j = i;
                    } else {
                        esPrimo = true;
                    }
                }
                if (esPrimo){
                    primos.write(String.valueOf(i));
                    primos.newLine();
                }
            } else {
                primos.write(String.valueOf(i));
                primos.newLine();
            }

        }
        primos.close();

    }
}
