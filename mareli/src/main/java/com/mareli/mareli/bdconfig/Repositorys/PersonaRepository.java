package com.mareli.mareli.bdconfig.Repositorys;

import java.util.UUID;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mareli.mareli.bdconfig.Entitys.PersonaEntity;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity, UUID>{
    
}
