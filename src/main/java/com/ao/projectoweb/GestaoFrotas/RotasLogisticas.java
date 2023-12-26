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
    @OneToMany
    List<Mota> mota;
    @OneToMany
    List<Carro> carro;
    @OneToMany
    List<Bicicleta> bicicleta;
    public RotasLogisticas() {
    }
    public RotasLogisticas(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
    }
    public RotasLogisticas(String origem, String destino, List<Mota> mota, List<Carro> carro, List<Bicicleta> bicicleta) {
        this.origem = origem;
        this.destino = destino;
        this.mota = mota;
        this.carro = carro;
        this.bicicleta = bicicleta;
    }
}
