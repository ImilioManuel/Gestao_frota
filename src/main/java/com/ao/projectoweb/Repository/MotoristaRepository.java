package com.ao.projectoweb.Repository;

import com.ao.projectoweb.Pessoa.Motorista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MotoristaRepository extends JpaRepository<Motorista, UUID> {
}
