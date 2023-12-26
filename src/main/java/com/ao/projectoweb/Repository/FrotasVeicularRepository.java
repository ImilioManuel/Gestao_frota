package com.ao.projectoweb.Repository;

import com.ao.projectoweb.GestaoFrotas.FrotasVeicular;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FrotasVeicularRepository extends JpaRepository<FrotasVeicular, UUID> {
}
