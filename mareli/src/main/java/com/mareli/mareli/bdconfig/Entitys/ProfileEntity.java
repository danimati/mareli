package com.mareli.mareli.bdconfig.Entitys;

import java.util.UUID;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "profile")
public class ProfileEntity {
    
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "idpersona")
    private UUID idpersona;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "contrasenia")
    private String contrasenia;

    @Column(name = "salt")
    private String salt;


    

}
