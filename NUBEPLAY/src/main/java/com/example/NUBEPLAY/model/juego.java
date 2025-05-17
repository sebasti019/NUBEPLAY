package com.example.NUBEPLAY.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor


public class juego {
    //datos de los juegos
    private String TituloJuego;
    private int IdJuego;
    private String autor;
    private int RatingContenido; 

    
}
