package com.ao.projectoweb.ComponentesDaPessoa.Condutor;

import com.ao.projectoweb.Pessoa.Motorista;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;
@Entity
@Table(name = "TB_CARTA_CONDUCAO")
@Getter
@Setter
public class CartaDeConducao implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String numeroCarteira;
    private String categoriaCarteira;
    private String dataEmissaoCarteira;
    private String dataValidadeCarteira;
    private boolean habilitacaoAtiva;
    @OneToOne
    private Motorista motorista;
    public CartaDeConducao(){}
    public CartaDeConducao(String numeroCarteira, String categoriaCarteira, String dataEmissaoCarteira, String dataValidadeCarteira, boolean habilitacaoAtiva) {
        this.numeroCarteira = numeroCarteira;
        this.categoriaCarteira = categoriaCarteira;
        this.dataEmissaoCarteira = dataEmissaoCarteira;
        this.dataValidadeCarteira = dataValidadeCarteira;
        this.habilitacaoAtiva = habilitacaoAtiva;
    }
}
