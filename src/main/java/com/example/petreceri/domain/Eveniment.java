package com.example.petreceri.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Eveniment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "denumire")
    private String denumire;
    @Column(name = "buget")
    private Integer buget;

    @OneToMany(mappedBy = "eveniment")
    private List<Participant> listaparticipanti=new ArrayList<>();

    @OneToMany(mappedBy = "eveniment")
    private List<Meniu> listameniuri=new ArrayList<>();

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="id_locatie")
    private Locatie locatie;

    @ManyToMany
    @JoinTable(name="eveniment_muzica",joinColumns = @JoinColumn(name="id_even"),inverseJoinColumns = @JoinColumn(name="id_muzica"))
    private List<Muzica> listamuzica=new ArrayList<>();

    public Eveniment(){

    }
    public Eveniment(Long id, String denumire, Integer buget) {
        this.id = id;
        this.denumire = denumire;
        this.buget = buget;
    }

    public List<Meniu> getListameniuri() {
        return listameniuri;
    }

    public void setListameniuri(List<Meniu> listameniuri) {
        this.listameniuri = listameniuri;
    }

    public Eveniment(String denumire, Integer buget) {
        this.denumire = denumire;
        this.buget = buget;
    }

    public Locatie getLocatie() {
        return locatie;
    }

    public void setLocatie(Locatie locatie) {
        this.locatie = locatie;
    }

    public List<Muzica> getListamuzica() {
        return listamuzica;
    }

    public void setListamuzica(List<Muzica> listamuzica) {
        this.listamuzica = listamuzica;
    }

    public List<Participant> getListaparticipanti() {
        return listaparticipanti;
    }

    public void setListaparticipanti(List<Participant> listaparticipanti) {
        this.listaparticipanti = listaparticipanti;
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

    public Integer getBuget() {
        return buget;
    }

    public void setBuget(Integer buget) {
        this.buget = buget;
    }
}
