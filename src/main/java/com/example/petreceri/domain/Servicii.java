package com.example.petreceri.domain;

import javax.persistence.*;

@Entity
public class Servicii {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tip")
    private String tip;
    @Column(name = "pret")
    private Integer pret;

    public Servicii() {
    }
    public Servicii(Long id, String tip, Integer pret) {
        this.id = id;
        this.tip = tip;
        this.pret = pret;
    }
    public Servicii(String tip, Integer pret) {
        this.tip = tip;
        this.pret = pret;
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

    public Integer getPret() {
        return pret;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }
}
