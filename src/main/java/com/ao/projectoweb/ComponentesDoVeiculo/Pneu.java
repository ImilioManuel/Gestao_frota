package com.ao.projectoweb.ComponentesDoVeiculo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_PNEU")
@Getter
@Setter
public class Pneu implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private int tempoEstimadoDeVida;
    private int tamanho;
    private String tipo;

    public Pneu() {
    }

    public Pneu(int tempoEstimadoDeVida, int tamanho, String tipo) {
        this.tempoEstimadoDeVida = tempoEstimadoDeVida;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }
}
