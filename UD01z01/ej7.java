package UD01z01;

import java.io.File;
import java.io.IOException;

public class ej7 {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i < 6; i++) {
            String nome = "ej";
            String extension = ".pdf";

            nome += i;
            File ejpdf = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01\\ejercicios", nome + extension);
            if (ejpdf.createNewFile()){
                System.out.println("Se ha creado el archivo " + nome + extension);
            }

        }
    }
}
