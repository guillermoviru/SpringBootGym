package com.gym.springbootgym.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Alimento")
public class AlimentoControlador {
    @Autowired
    private com.gym.springbootgym.Repositorios.AlimentoRpositorio alimentoRepositorio;

}
