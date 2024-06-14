package com.mareli.mareli.modulos.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mareli.mareli.bdconfig.services.PersonaService;
import com.mareli.mareli.bdconfig.Entitys.PersonaEntity;

@Controller
public class personaController {
    private final PersonaService personaService;

    @Autowired
    public personaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/verPersonas")
    public String verPersonas(Model model) {
        try {
            List<PersonaEntity> persona = this.personaService.getPersona();   
            model.addAttribute("personaC", persona);
            return "login/verUsuario";
        } catch (Exception e) {
            return "Fallo" + e.getMessage();
        }

    }
    
}
