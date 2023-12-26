package com.ao.projectoweb.Repository;

import com.ao.projectoweb.Veiculos.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CarroRepository extends JpaRepository<Carro, UUID> {
}
