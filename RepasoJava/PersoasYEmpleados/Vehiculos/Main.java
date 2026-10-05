package RepasoJava.PersoasYEmpleados.Vehiculos;

public class Main {
    public static void main(String[] args) throws Exception {
// TOD Auto-generated method stub
        Coche c = new Coche("336274N","Rojo", 200);
        System.out.println("************COCHE*****************");
        c.acelerar(15);
        c.acelerar(40);
        c.reducir(5);
        c.frenar();
        Moto m = new Moto("5216345J", "Naranja", 200);
        System.out.println("************MOTO*****************");
        m.acelerar(25);
        m.acelerar(60);
        m.reducir(20);
        m.frenar();
    }
}
