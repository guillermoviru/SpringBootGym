package com.gym.springbootgym.Controladores;

import com.gym.springbootgym.Clases.Genero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Genero")
public class GeneroControlador {
    @Autowired
    private com.gym.springbootgym.Repositorios.GeneroRepositorio generoRepositorio;
    //Metodo pra crear el Genero
    @PostMapping
    public Genero crearGenero (@RequestBody Genero Genero) {
        return generoRepositorio.save(Genero);
    }
}
