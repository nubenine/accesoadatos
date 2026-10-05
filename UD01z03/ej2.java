package UD01z03;

import java.io.*;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z03\\niggatwo.bin"));
            String num;

            System.out.println("Dime un numero por teclado: (-1 para salir)");
            num = String.valueOf(sc.nextInt());

            if (!num.equals("-1")){
                do {
                    bos.write(num.getBytes());
                    bos.write("\n".getBytes());
                    System.out.println("Dime un numero por teclado: (-1 para salir)");
                    num = String.valueOf(sc.nextInt());
                }while (!num.equals("-1"));
            }
            bos.close();

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z03\\niggatwo.bin"));
            String liña;
            int total = 0;
            double media;
            int contNumeros= 0;

            System.out.println("Numeros almacenados en el fichero: ");

            while ((liña = br.readLine())!=null){
                System.out.println(liña);
                contNumeros++;
                total+= Integer.parseInt(liña);
            }

            media =  (double) total /contNumeros;

            System.out.println("Media de los numeros introducidos: " + media);



        } catch (FileNotFoundException e) {
            System.out.println("NO! Suka");
        } catch (IOException e) {
            System.out.println("NO! Suka (2)");
        }


    }
}
