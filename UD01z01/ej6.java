package UD01z01;

import java.io.File;

public class ej6 {
    public static void main(String[] args) {

        File subejemcopy = new File ("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01\\ejercicios\\subdir\\subejemplo.txt");
        if (subejemcopy.exists()){
            if (subejemcopy.renameTo(new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01\\ejercicios\\subdir\\subejemplo_copia.txt"))){
                System.out.println("Archivo renombrado");
            } else {
                System.out.println("NO! Suka");
            }
        } else {
            System.out.println("NO! Suka");
        }
    }
}
