package com.ao.projectoweb.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class MotaDTO {
    private String modelo;
    private String marca;
    private String ano;
    private int tempoEstimadoDeVida;
    private int tamanho;
    private String tipo;
    private int cilindro;
    private String guidao;
    private boolean partidaElectrica;
    private double capacidade;
    private int potencia;
}
