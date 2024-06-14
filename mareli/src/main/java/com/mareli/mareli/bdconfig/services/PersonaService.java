package com.mareli.mareli.bdconfig.services;

import java.util.List;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mareli.mareli.bdconfig.Repositorys.PersonaRepository;
import com.mareli.mareli.bdconfig.Entitys.PersonaEntity;


@Service
public class PersonaService {
    private final PersonaRepository personaRepository;

    @Autowired
    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }


    //ESTE METODO SOLO LO DEBE TENER EL ADMINISTRADOR
    public List<PersonaEntity> getPersona() {
        return personaRepository.findAll();
    }
    //ESTE METODO SOLO LO DEBE TENER EL USUARIO
    public PersonaEntity getInfoPersonal(UUID idpersona){
        return personaRepository.findById(idpersona).get();
    }

}
