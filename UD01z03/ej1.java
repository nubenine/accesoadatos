package UD01z03;

import java.io.*;

public class ej1 {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z03\\aaayy.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("nigga.bin"));

            long inicio = System.nanoTime();
            byte[] bloque = new byte[8192];
            int bytesLidos;

            while ((bytesLidos = bis.read(bloque)) != -1) {
                for (int i = 0; i < bytesLidos; i++) {
                    bos.write((char)bloque[i]);
                }

            }
            bos.close();
            long fin = System.nanoTime();
            System.out.println("Tiempo: " + (fin - inicio) / 1_000_000.0 + " ms");


        } catch (FileNotFoundException e) {
            System.out.println("NO! Suka");
        } catch (IOException e) {
            System.out.println("NO(2)! Suka");
        }

    }
}
