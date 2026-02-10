package org.example.aplicacionreserva.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private int id;
    private int usuarioId;
    private List<Videojuego> videojuegos;
    private LocalDateTime fechaReserva;
    private String estado;

    public Reserva(int id, int usuarioId) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.videojuegos = new ArrayList<>();
        this.fechaReserva = LocalDateTime.now();
        this.estado = "PENDIENTE";
    }

    public void agregarVideojuego(Videojuego juego) {
        this.videojuegos.add(juego);
    }
    public void removerVideojuego(Videojuego juego) {
        this.videojuegos.remove(juego);
    }
}
