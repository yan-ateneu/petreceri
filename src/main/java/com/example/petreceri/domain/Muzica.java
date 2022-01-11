package com.example.petreceri.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Muzica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "stil")
    private String tip;
    @Column(name = "forma_interpretare")
    private String forma;
    @Column(name = "nr_artisti")
    private Integer nr;

    @JsonIgnore
    @ManyToMany(mappedBy = "listamuzica")
    private List<Eveniment> evenimente=new ArrayList<>();

    public Muzica(){

    }

    public List<Eveniment> getEvenimente() {
        return evenimente;
    }

    public void setEvenimente(List<Eveniment> evenimente) {
        this.evenimente = evenimente;
    }

    public Muzica(Long id, String tip, String forma, Integer nr) {
        this.id = id;
        this.tip = tip;
        this.forma = forma;
        this.nr = nr;
    }
    public Muzica( String tip, String forma, Integer nr) {
        this.tip = tip;
        this.forma = forma;
        this.nr = nr;
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

    public String getForma() {
        return forma;
    }

    public void setForma(String froma) {
        this.forma = froma;
    }

    public Integer getNr() {
        return nr;
    }

    public void setNr(Integer nr) {
        this.nr = nr;
    }
}
