package com.gym.springbootgym.Repositorios;

import com.gym.springbootgym.Clases.Alimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlimentoRpositorio extends JpaRepository<Alimento, Long> {

}
