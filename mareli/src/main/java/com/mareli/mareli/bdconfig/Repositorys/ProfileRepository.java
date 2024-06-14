package com.mareli.mareli.bdconfig.Repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mareli.mareli.bdconfig.Entitys.ProfileEntity;

@Repository
public interface ProfileRepository extends JpaRepository<ProfileEntity, UUID>{
    
}
