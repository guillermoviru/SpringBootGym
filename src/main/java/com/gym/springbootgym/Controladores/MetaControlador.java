package com.gym.springbootgym.Controladores;


import com.gym.springbootgym.Clases.Meta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Meta")
public class MetaControlador {
    @Autowired
    private com.gym.springbootgym.Repositorios.MetaRepositorio metaRepositorio;
    //Metodo pra crear la Meta
    @PostMapping
    public Meta crearMeta (@RequestBody Meta Meta) {
        return metaRepositorio.save(Meta);
    }
}
