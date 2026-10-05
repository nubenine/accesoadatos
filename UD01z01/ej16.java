package UD01z01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ej16 {
    public static void main(String[] args) {
        File ejercicio = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01\\ejercicios");
        File subdir = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01\\ejercicios\\subdir");
        File[] pdfs = ejercicio.listFiles();
        String archivoMovido = "";


        for (int i = 0; i < ejercicio.length(); i++) {
            if (pdfs[i].getName().contains(".pdf")){
                try {
                    archivoMovido += pdfs[i].getName();
                    FileUtils.moveFileToDirectory(pdfs[i],subdir, true);
                    System.out.println("Se ha movido el archivo");
                    break;
                } catch (IOException e) {
                    System.out.println("NO! Suka");
                }
            }
        }

        if (!Arrays.stream(pdfs).toList().contains(archivoMovido)){
            System.out.println("El archivo se ha movido correctamente");
        } else {
            System.out.println("NO! Suka");
        }


    }
}
