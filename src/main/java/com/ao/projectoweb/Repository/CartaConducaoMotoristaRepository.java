package com.ao.projectoweb.Repository;

import com.ao.projectoweb.ComponentesDaPessoa.Condutor.CartaDeConducao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CartaConducaoMotoristaRepository extends JpaRepository<CartaDeConducao, UUID> {
    public CartaDeConducao findByNumeroCarteira(String numeroCarteita);
}
