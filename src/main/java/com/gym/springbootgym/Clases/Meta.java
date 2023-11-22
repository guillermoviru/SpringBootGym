package com.gym.springbootgym.Clases;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
public class Meta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombremeta" )
    @ColumnDefault("null")
    private String nombreMeta;


    public Meta() {
    }



    public Meta(Long id, String nombreMeta) {
        this.id = id;
        this.nombreMeta = nombreMeta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreMeta() {
        return nombreMeta;
    }

    public void setNombreMeta(String nombreMeta) {
        this.nombreMeta = nombreMeta;
    }
}
