package Actividad04SergioMorais;

import java.io.Serial;
import java.io.Serializable;

public class Libro implements Serializable {
    @Serial
    private static  final long serialVersionUID = 1L;
    private String titulo;
    private String autor;
    private String isbn;
    private double precio;
    private transient int stock;

    public Libro(String titulo, String autor, String isbn, double precio, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.stock = stock;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "\n\t-Titulo: " + titulo +
                "\n\t-Autor: " + autor +
                "\n\t-ISBN: " + isbn +
                "\n\t-Precio: " + precio;
    }
}
