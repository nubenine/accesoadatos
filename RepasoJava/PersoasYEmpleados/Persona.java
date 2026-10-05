package RepasoJava.PersoasYEmpleados;

import java.time.LocalDate;
import java.util.Objects;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fecNac;
    public Persona(String nom, String ap, LocalDate fec) {
        this.nombre=nom;
        this.apellido=ap;
        this.fecNac=fec;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFecNac() {
        return fecNac;
    }

    public void setFecNac(LocalDate fecNac) {
        this.fecNac = fecNac;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fecNac=" + fecNac +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Persona persona)) return false;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido) && Objects.equals(fecNac, persona.fecNac);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
