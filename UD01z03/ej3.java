package UD01z03;

import javax.xml.transform.Source;
import java.io.*;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int codigo, cont = 0;
        String nome;
        double precio, total = 0;

        System.out.println("Introduce el codigo de un producto (-1 para salir): ");
        codigo = sc.nextInt();

        if (codigo!=-1){
            try {
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z03\\sicseben.bin"));
                do {
                    cont++;
                    dos.writeUTF("-Producto " + cont + ": ");
                    dos.writeByte(codigo);
                    System.out.println("Introduce el nombre del producto: ");
                    sc.nextLine();
                    nome = sc.nextLine();
                    dos.writeUTF(nome);
                    System.out.println("Introduce el precio del producto: ");
                    precio = sc.nextDouble();
                    total +=precio;
                    dos.writeDouble(precio);
                    System.out.println("--------Producto almacenado--------");
                    System.out.println("Introduce el codigo de un producto (-1 para salir): ");
                    codigo = sc.nextInt();
                }while (codigo!=-1);
                dos.close();

                DataInputStream din = new DataInputStream(new FileInputStream("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\UD01z03\\sicseben.bin"));
                while (true){
                    try{
                        String indicador = din.readUTF();
                        int code = din.readByte();
                        String nombre = din.readUTF();
                        double prize = din.readDouble();

                        System.out.println("\t" + indicador);
                        System.out.println("\tCodigo: " + code);
                        System.out.println("\tNombre del producto: " + nombre);
                        System.out.println("\tPrecio del producto: " + prize);
                    } catch (EOFException e){
                        break;
                    }
                    System.out.println("Precio total acumulado: " + total);
                }

            } catch (FileNotFoundException e) {
                System.out.println("NO! Suka");
            } catch (IOException e) {
                System.out.println("NO! Suka (1)");
            }

        }



    }
}
