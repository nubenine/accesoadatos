package RepasoJava.PersoasYEmpleados.Vehiculos;

public abstract class Vehiculo {
    public String matricula;
    public String color;
    public int velocidad;

    public Vehiculo(String matricula, String color, int velocidad) {
        this.matricula = matricula;
        this.color = color;
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public abstract void acelerar(int incremento);
    public abstract void reducir(int incremento);
    public abstract void frenar();


}
