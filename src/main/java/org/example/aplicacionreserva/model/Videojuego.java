package org.example.aplicacionreserva.model;

public class Videojuego {
    private int id;
    private String titulo;
    private String categoria;
    private String sinopsis;
    private double precio;
    private String imagenUrl;
    private boolean reservado;

    public Videojuego(int id, String titulo, String categoria, String sinopsis, double precio, String imagenUrl) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.sinopsis = sinopsis;
        this.precio = precio;
        this.imagenUrl = imagenUrl;
        this.reservado = false;
    }
}
