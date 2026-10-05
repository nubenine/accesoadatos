package RepasoJava.PersoasYEmpleados;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // primeros 10 números
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        int n1 = 0;
        int n2 = 1;
        int secuencia;

        for (int i = 2; i < fibonacci.length; i++) {
            secuencia = n1 + n2;
            fibonacci[i] = secuencia;
            n1  = n2;
            n2 = secuencia;
        }

        for (int j : fibonacci) {
            System.out.print(j + " ");
        }

// TOD: genera la secuencia de RepasoJava.PersoasYEmpleados.Fibonacci
// salida esperada: 0 1 1 2 3 5 8 13 21 34
    }
}
