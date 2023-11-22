package com.gym.springbootgym.Clases;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import com.fasterxml.jackson.annotation.JsonInclude;
//Clase Usuario


@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "contrasena", nullable = false)
    private String contrasena;

    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "inscrito")
    @ColumnDefault("null") // Esto establece el valor predeterminado en null
    private Boolean inscrito;



    @Column(name = "altura")
    @ColumnDefault("null") // Esto establece el valor predeterminado en null
    private Double altura;

    @Column(name = "peso")
    @ColumnDefault("null") // Esto establece el valor predeterminado en null
    private Double peso;

    @Column(name = "edad", columnDefinition = "int default 0")
    private Integer edad;

    // Relación con la clase Genero
    @ManyToOne
    @JoinColumn(name = "genero_id")
    @ColumnDefault("null")
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "meta_id")
    @ColumnDefault("null")
    private Meta meta;

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }


    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public Boolean getInscrito() {
        return inscrito;
    }

    public void setInscrito(Boolean inscrito) {
        this.inscrito = inscrito;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    // Otros campos y métodos

    // Constructor sin argumentos
    public Usuario() {
    }

    // Constructor con todos los campos
    public Usuario(Long id, String nombre, String contrasena, String correo , Boolean inscrito) {
        this.id = id;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.correo = correo;
        this.inscrito = inscrito;
    }

    // Getters y setters para todos los campos
}