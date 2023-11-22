package com.gym.springbootgym.Clases;

import jakarta.persistence.*;

@Entity
public class Alimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;



    @Column(name = "calorias", nullable = false)
    private int calorias;

    @Column(name = "proteinag", nullable = false)
    private double proteina;

    @Column(name = "grasasg", nullable = false)
    private double grasas;

    @Column(name = "chodg", nullable = false)
    private double chod;

    @Column(name = "chotg", nullable = false)
    private double chot;

    @Column(name = "fibratg", nullable = false)
    private double fibrat;

    @Column(name = "calciomg", nullable = false)
    private int calciomg;

    @Column(name = "fosforomg", nullable = false)
    private int fosforomg;
    @Column(name = "hierromg", nullable = false)
    private double hierromg;

    @Column(name = "magnesiomg", nullable = false)
    private int magnesiomg;

    @Column(name = "zincmg", nullable = false)
    private double zincmg;

    @Column(name = "cobremg", nullable = false)
    private double cobremg;

    @Column(name = "sodiomg", nullable = false)
    private int sodiomg;

    @Column(name = "potasiomg", nullable = false)
    private int potasiomg;

    @Column(name = "vitaminaaer", nullable = false)
    private int vitaminaaer;

    @Column(name = "bcarotenoet", nullable = false)
    private int bcarotenoet;

    @Column(name = "tiaminamg", nullable = false)
    private double tiaminamg;

    @Column(name = "riboflavinamg", nullable = false)
    private double riboflavinamg;

    @Column(name = "niacinamg", nullable = false)
    private double niacinamg;

    @Column(name = "vitaminab6mg", nullable = false)
    private double vitaminab6mg;

    @Column(name = "acidoascmg", nullable = false)
    private int acidoascmg;

    public Alimento() {

    }

    public Alimento(Long id, String nombre, int calorias, double proteina, double grasas, double chod, double chot, double fibrat, int calciomg, int fosforomg, double hierromg, int magnesiomg, double zincmg, double cobremg, int sodiomg, int potasiomg, int vitaminaaer, int bcarotenoet, double tiaminamg, double riboflavinamg, double niacinamg, double vitaminab6mg, int acidoascmg) {
        this.id = id;
        this.nombre = nombre;
        this.calorias = calorias;
        this.proteina = proteina;
        this.grasas = grasas;
        this.chod = chod;
        this.chot = chot;
        this.fibrat = fibrat;
        this.calciomg = calciomg;
        this.fosforomg = fosforomg;
        this.hierromg = hierromg;
        this.magnesiomg = magnesiomg;
        this.zincmg = zincmg;
        this.cobremg = cobremg;
        this.sodiomg = sodiomg;
        this.potasiomg = potasiomg;
        this.vitaminaaer = vitaminaaer;
        this.bcarotenoet = bcarotenoet;
        this.tiaminamg = tiaminamg;
        this.riboflavinamg = riboflavinamg;
        this.niacinamg = niacinamg;
        this.vitaminab6mg = vitaminab6mg;
        this.acidoascmg = acidoascmg;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public double getProteina() {
        return proteina;
    }

    public void setProteina(double proteina) {
        this.proteina = proteina;
    }

    public double getGrasas() {
        return grasas;
    }

    public void setGrasas(double grasas) {
        this.grasas = grasas;
    }

    public double getChod() {
        return chod;
    }

    public void setChod(double chod) {
        this.chod = chod;
    }

    public double getChot() {
        return chot;
    }

    public void setChot(double chot) {
        this.chot = chot;
    }

    public double getFibrat() {
        return fibrat;
    }

    public void setFibrat(double fibrat) {
        this.fibrat = fibrat;
    }

    public int getCalciomg() {
        return calciomg;
    }

    public void setCalciomg(int calciomg) {
        this.calciomg = calciomg;
    }

    public int getFosforomg() {
        return fosforomg;
    }

    public void setFosforomg(int fosforomg) {
        this.fosforomg = fosforomg;
    }

    public double getHierromg() {
        return hierromg;
    }

    public void setHierromg(double hierromg) {
        this.hierromg = hierromg;
    }

    public int getMagnesiomg() {
        return magnesiomg;
    }

    public void setMagnesiomg(int magnesiomg) {
        this.magnesiomg = magnesiomg;
    }

    public double getZincmg() {
        return zincmg;
    }

    public void setZincmg(double zincmg) {
        this.zincmg = zincmg;
    }

    public double getCobremg() {
        return cobremg;
    }

    public void setCobremg(double cobremg) {
        this.cobremg = cobremg;
    }

    public int getSodiomg() {
        return sodiomg;
    }

    public void setSodiomg(int sodiomg) {
        this.sodiomg = sodiomg;
    }

    public int getPotasiomg() {
        return potasiomg;
    }

    public void setPotasiomg(int potasiomg) {
        this.potasiomg = potasiomg;
    }

    public int getVitaminaaer() {
        return vitaminaaer;
    }

    public void setVitaminaaer(int vitaminaaer) {
        this.vitaminaaer = vitaminaaer;
    }

    public int getBcarotenoet() {
        return bcarotenoet;
    }

    public void setBcarotenoet(int bcarotenoet) {
        this.bcarotenoet = bcarotenoet;
    }

    public double getTiaminamg() {
        return tiaminamg;
    }

    public void setTiaminamg(double tiaminamg) {
        this.tiaminamg = tiaminamg;
    }

    public double getRiboflavinamg() {
        return riboflavinamg;
    }

    public void setRiboflavinamg(double riboflavinamg) {
        this.riboflavinamg = riboflavinamg;
    }

    public double getNiacinamg() {
        return niacinamg;
    }

    public void setNiacinamg(double niacinamg) {
        this.niacinamg = niacinamg;
    }

    public double getVitaminab6mg() {
        return vitaminab6mg;
    }

    public void setVitaminab6mg(double vitaminab6mg) {
        this.vitaminab6mg = vitaminab6mg;
    }

    public int getAcidoascmg() {
        return acidoascmg;
    }

    public void setAcidoascmg(int acidoascmg) {
        this.acidoascmg = acidoascmg;
    }

}

