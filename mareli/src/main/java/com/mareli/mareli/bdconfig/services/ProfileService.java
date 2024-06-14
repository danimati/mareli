package com.mareli.mareli.bdconfig.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mareli.mareli.bdconfig.Entitys.ProfileEntity;
import com.mareli.mareli.bdconfig.Repositorys.ProfileRepository;

@Service
public class ProfileService {
    private final ProfileRepository profileRepository;
    

    @Autowired
    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }


    
    public List<ProfileEntity> getPersonas() {
        return profileRepository.findAll();
    }
        
    
    
}
