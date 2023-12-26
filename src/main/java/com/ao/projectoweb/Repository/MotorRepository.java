package com.ao.projectoweb.Repository;

import com.ao.projectoweb.ComponentesDoVeiculo.Motor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface MotorRepository extends JpaRepository<Motor, UUID> {
}
