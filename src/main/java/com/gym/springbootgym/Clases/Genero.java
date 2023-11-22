package com.gym.springbootgym.Clases;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;


@Entity
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombreGenero" )
    @ColumnDefault("null")
    private String nombreGenero;

    // Constructor, getters y setters

    // Constructor vacío requerido por JPA
    public Genero() {
    }

    public Genero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }


    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }
}