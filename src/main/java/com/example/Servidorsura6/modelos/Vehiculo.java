package com.example.Servidorsura6.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "vehiculos")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "placaVehiculo",nullable = false,length = 20)
    private String placa;
    private String modelo;
    private String marca;
    private String cilindraje;
    private String color;
    private String descripcion;
    private Integer numeroSiniestros;
}
