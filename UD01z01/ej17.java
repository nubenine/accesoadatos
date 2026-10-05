package UD01z01;

import java.io.File;
import java.util.Objects;

public class ej17 {

//NO LO ELIMINA TO-DO DE GOLPE. CORREGIDO ABAJO
    public static boolean eliminarContenido(File directorio) {
        boolean borradoExitoso = false;
        if (!directorio.delete()) {
            File[] archivo = directorio.listFiles();
            for (int i = 0; i < Objects.requireNonNull(archivo).length; i++) {
                if (archivo[i].delete()) {
                    System.out.println("Se ha eliminado el archivo " + archivo[i].getName());
                    borradoExitoso = true;
                } else {
                    if (archivo[i].isDirectory()) {
                        File[] directory = archivo[i].listFiles();
                        if (directory != null) {
                            for (int j = 0; j < directory.length; j++) {
                                if (directory[j].delete()) {
                                    System.out.println("Se ha eliminado el archivo " + directory[j].getName() + " del subsirectorio " + archivo[i].getName());
                                } else {
                                    eliminarContenido(directory[j]);
                                }
                            }
                        }
                    }
                    System.out.println("No se ha podido eliminar el archivo");
                    borradoExitoso = false;
                    break;
                }
            }
            return borradoExitoso;
        }
        return true;
    }

    public static void main(String[] args) {
        File ejercicios = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01\\ejercicios");
        if (ejercicios.exists()){
            if (eliminarContenido(ejercicios)){
                System.out.println("Se ha podido eliminar el directorio");
            } else {
                System.out.println("NO! Suka");
            }
        } else {
            System.out.println("Non existe xa che");
        }
    }
}

// funcion corregida:
//public static boolean eliminarContenido(File directorio) {
//
//    File[] archivos = directorio.listFiles();
//
//    if (archivos != null) {
//
//        for (int i = 0; i < archivos.length; i++) {
//
//            if (archivos[i].isDirectory()) {
//                eliminarContenido(archivos[i]);
//            } else {
//                if (archivos[i].delete()) {
//                    System.out.println("Se ha eliminado el archivo " + archivos[i].getName());
//                } else {
//                    return false;
//                }
//            }
//        }
//    }
//
//    return directorio.delete();
//}

//main corregido:
//public static void main(String[] args) {
//
//    File ejercicios = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z01\\ejercicios");
//
//    if (ejercicios.exists()) {
//
//        if (eliminarContenido(ejercicios)) {
//            System.out.println("Se ha podido eliminar el directorio");
//        } else {
//            System.out.println("NO! Suka");
//        }
//
//    } else {
//        System.out.println("Non existe xa che");
//    }
//}