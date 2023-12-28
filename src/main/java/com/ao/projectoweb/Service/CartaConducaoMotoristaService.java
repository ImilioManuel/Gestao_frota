package com.ao.projectoweb.Service;

import com.ao.projectoweb.ComponentesDaPessoa.Condutor.CartaDeConducao;
import com.ao.projectoweb.Repository.CartaConducaoMotoristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartaConducaoMotoristaService {
    @Autowired
    CartaConducaoMotoristaRepository cartaConducaoMotoristaRepository;

    public Object save(CartaDeConducao cartaDeConducao) {
        return cartaConducaoMotoristaRepository.save(cartaDeConducao);
    }

    public CartaDeConducao findBynumeroCarteira(String numeroCarteira) {
        return cartaConducaoMotoristaRepository.findByNumeroCarteira(numeroCarteira);
    }
}
