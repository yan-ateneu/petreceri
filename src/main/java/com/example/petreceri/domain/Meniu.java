package com.example.petreceri.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Meniu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tip")
    private String tip;
    @Column(name = "alchool")
    private Boolean alchool;
    @Column(name = "pret")
    private Integer pret;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="id_even")
    private Eveniment eveniment;

    public Meniu(){

    }
    public Meniu(Long id, String tip, Boolean alchool, Integer pret) {
        this.id = id;
        this.tip = tip;
        this.alchool = alchool;
        this.pret = pret;
    }

    public Meniu(String tip, Boolean alchool, Integer pret) {
        this.tip = tip;
        this.alchool = alchool;
        this.pret = pret;
    }

    public Eveniment getEveniment() {
        return eveniment;
    }

    public void setEveniment(Eveniment eveniment) {
        this.eveniment = eveniment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Boolean getAlchool() {
        return alchool;
    }

    public void setAlchool(Boolean alchool) {
        this.alchool = alchool;
    }

    public Integer getPret() {
        return pret;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }
}
