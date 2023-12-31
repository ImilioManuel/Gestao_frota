package com.ao.projectoweb.GestaoFrotas;

import com.ao.projectoweb.Veiculos.Bicicleta;
import com.ao.projectoweb.Veiculos.Carro;
import com.ao.projectoweb.Veiculos.Mota;
import com.ao.projectoweb.Veiculos.Veiculo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "TB_ROTAS")
@Getter
@Setter
public class RotasLogisticas implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String origem;
    private String destino;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "TB_RotasVeiculo", joinColumns = @JoinColumn(name = "id_frota"))
    @Column(name = "id_veiculo",length = 500)
    List<Veiculo> veiculo;
    public RotasLogisticas() {
    }
    public RotasLogisticas(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
    }

    public RotasLogisticas(String origem, String destino, List<Veiculo> veiculo) {
        this.origem = origem;
        this.destino = destino;
        this.veiculo = veiculo;
    }
}
