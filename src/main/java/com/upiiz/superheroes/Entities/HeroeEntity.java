package com.upiiz.superheroes.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="heroe")

public class HeroeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String poder;
    private String universo;
    private String debilidad;

    @Column(name = "url_imagen")
    private String urlImagen;
}
