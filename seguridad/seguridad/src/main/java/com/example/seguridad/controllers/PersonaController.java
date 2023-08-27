package com.example.seguridad.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonaController {

    @GetMapping("/")
    public String bienvenida(){
        //PersonaDtoResponse personaDTOResponse = new PersonaDtoResponse("Laura","Sanabria","Calle 70");
        return "index";
    }


    @GetMapping("/usuario")
    public String bienvenidaUser(){
        //PersonaDtoResponse personaDTOResponse = new PersonaDtoResponse("Laura","Sanabria","Calle 70");
        return "usuario";
    }

    @GetMapping("/admin")
    public String bienvenidaAdmin(){
        //PersonaDtoResponse personaDTOResponse = new PersonaDtoResponse("Laura","Sanabria","Calle 70");
        return "admin";
    }

}
