package RepasoJava.PersoasYEmpleados;

import java.time.LocalDate;


public class Empleado extends Persona{
    private double salario;

    public Empleado(String nom, String ap, LocalDate fec) {
        super(nom, ap, fec);
    }

    @Override
    public String toString() {
        return "Empleado: " +
                super.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Empleado empleado)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(salario, empleado.salario) == 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
