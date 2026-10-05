package RepasoJava.PersoasYEmpleados;

import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Dime tres numeros (dale a enter para separar)");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        mayorMenor(n1, n2, n3);


    }

    public static void mayorMenor(int n1, int n2, int n3) throws Exception {
        if (n1 > n2 && n1 > n3) {
            System.out.println("El mayor es " + n1);
        } else if (n2 > n1 && n2 > n3){
            System.out.println("El mayor es " + n2);
        } else if (n3 > n1 && n3 > n2){
            System.out.println("El mayor es " + n3);
        } else if (n1 >n2 && n1 == n3){
            System.out.println("El mayor es: " + n1);
        } else if (n2 > n1 && n2 == n3){
            System.out.println("Los mayor son: " + n2);
        } else if (n1 > n3 && n2==n1){
            System.out.println("El mayor es: " + n1);
        } else {
            System.out.println("Son todos iguales");
        }
    }
}
