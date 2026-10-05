package RepasoJava.PersoasYEmpleados;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        System.out.println("Dime una palabra y te diré si es un palindromo o no");
        palabra = sc.nextLine();

        boolean esPalindromo = true;


        //radar, reconocer
        int j = palabra.length() -1 ;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.toLowerCase().charAt(i)!=palabra.toLowerCase().charAt(j)){
                esPalindromo = false;
            }
            j--;
        }



        if (esPalindromo) {
            System.out.println(palabra + " es un palíndromo.");
        } else {
            System.out.println(palabra + " no es un palíndromo.");
        }
    }
}
