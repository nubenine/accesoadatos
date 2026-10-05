package RepasoJava.PersoasYEmpleados.Vehiculos;

public class Coche extends Vehiculo{

    public Coche(String matricula, String color, int velocidad) {
        super(matricula, color, velocidad);
    }


    @Override
    public void acelerar(int incremento) {
        setVelocidad(velocidad + incremento);
        System.out.println("Aumento de velocidad: " + getVelocidad() + " km/h");
    }

    @Override
    public void reducir(int incremento) {
        setVelocidad(velocidad - incremento);
        System.out.println("Disminuicion de velocidad: " + getVelocidad() + " km/h");
    }

    @Override
    public void frenar() {
        System.out.println("Frena: ");
        for (int i = getVelocidad(); i > 0 ; i-=10) {
            setVelocidad(i);
            System.out.print(getVelocidad() + " km/h || ");
        }
        System.out.println();
    }

    @Override
    public int getVelocidad() {
        return super.getVelocidad();
    }
}
