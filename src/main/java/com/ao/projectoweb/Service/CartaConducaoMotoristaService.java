package com.ao.projectoweb.Service;

import com.ao.projectoweb.ComponentesDoCondutor.CartaDeConducao;
import com.ao.projectoweb.Repository.CartaConducaoMotoristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartaConducaoMotoristaService {
    @Autowired
    CartaConducaoMotoristaRepository cartaConducaoMotoristaRepository;

    public Object save(CartaDeConducao cartaDeConducao) {
        return cartaConducaoMotoristaRepository.save(cartaDeConducao);
    }
}
