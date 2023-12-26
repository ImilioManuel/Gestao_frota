package com.ao.projectoweb.Repository;

import com.ao.projectoweb.ComponentesDoCondutor.CartaDeConducao;
import com.ao.projectoweb.Condutor.Motorista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CartaConducaoMotoristaRepository extends JpaRepository<CartaDeConducao, UUID> {
}
