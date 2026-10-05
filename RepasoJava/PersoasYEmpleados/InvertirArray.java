package RepasoJava.PersoasYEmpleados;

public class InvertirArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int[] numerosInvertidos = new int[numeros.length];
        int j = 0;
        for (int i = numeros.length - 1; i >=0 ;i--){
            numerosInvertidos[j] = numeros[i];
            j++;
        }
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=numerosInvertidos[i];
        }

// TOO: invierte el array
// al final debería imprimirse: 5 4 3 2 1
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
