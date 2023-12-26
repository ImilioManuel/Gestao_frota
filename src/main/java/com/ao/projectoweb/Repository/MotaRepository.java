package com.ao.projectoweb.Repository;

import com.ao.projectoweb.Veiculos.Carro;
import com.ao.projectoweb.Veiculos.Mota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MotaRepository extends JpaRepository<Mota, UUID> {
}
