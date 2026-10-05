package RepasoJava.PersoasYEmpleados;

public class App {
    public static void main(String[] args) throws Exception {
        calificacion(9.5);
        calificacion(8.5);
        calificacion(6.5);
        calificacion(4.5);
        calificacion(-1);
    }
    public static void calificacion(double nota) throws Exception {
//TO-DO
        if (nota >10 || nota<0){
            System.out.println("Error");
        } else {
            if (nota>=9){
                System.out.println("Sobresaliente");
            } else if (nota >= 7){
                System.out.println("Notable");
            } else if (nota >= 5){
                System.out.println("Aprobado");
            } else if (nota < 5){
                System.out.println("Suspenso");
            }
        }





    }
}
