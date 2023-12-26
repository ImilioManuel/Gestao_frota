package com.ao.projectoweb.ComponentesDoVeiculo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_MOTOR")
@Getter
@Setter
public class Motor implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private double capacidade;
    private int potencia;
    public Motor() {
    }

    public Motor(double capacidade, int potencia) {
        this.capacidade = capacidade;
        this.potencia = potencia;
    }
}
