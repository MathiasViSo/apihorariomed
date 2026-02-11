package com.villazon.apihorariomed.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "schedules")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String dosis;

    @Column(nullable = false)
    private String hora;

    @Column(nullable = false)
    private String frecuencia;

    private String notas;

    @Column(nullable = false)
    private Boolean activo;
}
