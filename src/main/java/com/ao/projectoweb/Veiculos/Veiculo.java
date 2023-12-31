package com.ao.projectoweb.Veiculos;


import com.ao.projectoweb.ComponentesDoVeiculo.Pneu;
import com.ao.projectoweb.Pessoa.Mecanico;
import com.ao.projectoweb.Pessoa.Motorista;
import com.ao.projectoweb.GestaoFrotas.FrotasVeicular;
import com.ao.projectoweb.GestaoFrotas.RotasLogisticas;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@MappedSuperclass
@Data
@EqualsAndHashCode(of = {"id"})
public abstract class Veiculo implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String modelo;
    private String marca;
    private String ano;
    @OneToOne
    private Pneu pneu;
    LocalDateTime dataCadastro;
    @ManyToOne
    private RotasLogisticas rotasLogisticas;
    @ManyToOne
    private FrotasVeicular frotasVeicular;
    @ManyToOne
    private Motorista motorista;

    public Veiculo() {
    }
    public Veiculo(String modelo, String marca, String ano, Pneu pneu,LocalDateTime dataCadastro) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.pneu = pneu;
        this.dataCadastro = dataCadastro;
    }
}
