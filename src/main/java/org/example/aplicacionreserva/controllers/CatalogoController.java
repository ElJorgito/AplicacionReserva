package org.example.aplicacionreserva.controllers;

import org.example.aplicacionreserva.model.Videojuego;
import java.util.ArrayList;
import java.util.List;

public class CatalogoController {
    private List<Videojuego> catalogo;

    public CatalogoController() {
        this.catalogo = new ArrayList<>();
    }

    public List<Videojuego> listarJuegos() {
        return catalogo;
    }

    public List<Videojuego> filtrarPorCategoria(String categoria) {
        List<Videojuego> filtrados = new ArrayList<>();
        return filtrados;
    }

    public Videojuego buscarJuego(String titulo) {
        return null;
    }
}
