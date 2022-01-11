package com.example.petreceri.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Locatie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "denumire")
    private String denumire;
    @Column(name = "oras")
    private String oras;
    @Column(name = "tarif")
    private Integer tarif;

    @OneToMany(mappedBy = "locatie")
    private List<Eveniment> listaevenimente=new ArrayList<>();

    @Override
    public String toString() {
        return "Locatie{" +
                "id=" + id +
                ", denumire='" + denumire + '\'' +
                ", oras='" + oras + '\'' +
                ", tarif=" + tarif +
                ", listaevenimente=" + listaevenimente +
                '}';
    }

    public Locatie(Long id, String denumire, String oras, Integer tarif) {
        this.id = id;
        this.denumire = denumire;
        this.oras = oras;
        this.tarif = tarif;
    }
    public Locatie(){

    }

    public Locatie(String denumire, String oras, Integer tarif) {
        this.denumire = denumire;
        this.oras = oras;
        this.tarif = tarif;
    }

    public List<Eveniment> getListaevenimente() {
        return listaevenimente;
    }

    public void setListaevenimente(List<Eveniment> listaevenimente) {
        this.listaevenimente = listaevenimente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public Integer getTarif() {
        return tarif;
    }

    public void setTarif(Integer tarif) {
        this.tarif = tarif;
    }
}
