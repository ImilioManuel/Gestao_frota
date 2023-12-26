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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TB_FROTAS_VEICULAR")
@Getter
@Setter
public class FrotasVeicular implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "TB_FrotasVeiculo", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "id_veiculo",length = 500000)
    List<Veiculo> veiculo;

    public FrotasVeicular() {
    }
    public FrotasVeicular(String nome) {
        this.nome = nome;
    }
    public void addVeiculo(Veiculo veiculo){
        this.veiculo.add(veiculo);
    }
}
