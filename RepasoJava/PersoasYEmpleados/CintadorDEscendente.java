package RepasoJava.PersoasYEmpleados;

import java.util.Scanner;

public class CintadorDEscendente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Dime un numero desde el que se contará hacia atras: ");
        n1 = sc.nextInt();
        System.out.println("Dime otro numero del cual saltaremos sus multiplos: ");
        n2 = sc.nextInt();
        for (int i = n1; i > 0; i--){
            if (i % n2 == 0){
                System.out.println("Multiplo!");
                continue;
            }
            System.out.println("RepasoJava.PersoasYEmpleados.Contador: " + i);
        }
    }
}
