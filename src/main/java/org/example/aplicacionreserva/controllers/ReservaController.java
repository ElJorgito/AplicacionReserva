package org.example.aplicacionreserva.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.aplicacionreserva.model.Reserva;
import org.example.aplicacionreserva.model.Usuario;
import org.example.aplicacionreserva.model.Videojuego;

import java.util.ArrayList;
import java.util.List;

public class ReservaController {
    private List<Reserva> reservas;

    public ReservaController() {
        this.reservas = new ArrayList<>();
    }

    public Reserva crearReserva(Usuario usuario, List<Videojuego> juegos) {
        Reserva nuevaReserva = null;
        return nuevaReserva;
    }

    public List<Reserva> listarReservasUsuario(Usuario usuario) {
        return reservas;
    }

    public void quitarJuegoDeReserva(Reserva reserva, Videojuego juego) {
        reserva.removerVideojuego(juego);
    }
}
