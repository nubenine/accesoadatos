package UD01z02.Ejercicio1;

import java.io.*;

public class ej5 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z02\\Ejercicio1\\hola.java");
        try {
            BufferedReader lector = new BufferedReader(new FileReader(f));
            BufferedWriter escritor = new BufferedWriter(new FileWriter("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z02\\Ejercicio1\\hola2.java"));
            String liña ="";
            String[] palabras;
            boolean comentario = false;
            while (liña != null){
                liña = lector.readLine();
                if (liña!=null){

                    for (int i = 0; i < liña.length(); i++) {
                        if (liña.charAt(i)=='/'){
                            if (liña.charAt(i+1)=='/'){
                                liña = liña.substring(0, i);
                            }
                        }
                    }
                    escritor.write(liña);
                    escritor.newLine();
                }
            }
            escritor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nigga");
        } catch (IOException e) {
            System.out.println("Nigga two");
        }


    }
}
