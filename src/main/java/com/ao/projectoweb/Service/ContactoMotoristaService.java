package com.ao.projectoweb.Service;

import com.ao.projectoweb.ComponentesDaPessoa.Contacto;
import com.ao.projectoweb.Repository.ContactoMotoristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoMotoristaService {
    @Autowired
    ContactoMotoristaRepository contactoMotoristaRepository;
    public Object save(Contacto contacto) {
        return contactoMotoristaRepository.save(contacto);
    }
}
