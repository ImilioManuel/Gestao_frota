package com.ao.projectoweb.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CarroDTO {
    private String modelo;
    private String marca;
    private String ano;
    private int tempoEstimadoDeVida;
    private int tamanho;
    private String tipo;
    private int nPortas;
    private String combustivel;
    private boolean arCondicionado;
    private double capacidade;
    private int potencia;
}
