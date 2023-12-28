package com.ao.projectoweb.Repository;

import com.ao.projectoweb.ComponentesDaPessoa.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ContactoMotoristaRepository extends JpaRepository<Contacto, UUID> {
}
