package com.ao.projectoweb.Service;

import com.ao.projectoweb.ComponentesDaPessoa.Endereco;
import com.ao.projectoweb.Repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoMotoristaService {
    @Autowired
    EnderecoRepository enderecoRepository;

    public Object save(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }
}
