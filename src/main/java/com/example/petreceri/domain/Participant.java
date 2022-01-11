package com.example.petreceri.domain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nume")
    private String nume;
    @Column(name = "prenume")
    private String prenume;
    @Column(name = "varsta")
    private Integer varsta;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="id_even")
    private Eveniment eveniment;

    @Override
    public String toString() {
        return "Participant{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", eveniment=" + eveniment +
                '}';
    }

    public Participant(){

    }
    public Participant(Long id, String nume, String prenume, Integer varsta) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public Participant(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
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

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}
