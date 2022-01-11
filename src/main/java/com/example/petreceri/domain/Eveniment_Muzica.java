package com.example.petreceri.domain;

import javax.persistence.*;


@Table(name = "eveniment_muzica")
@Entity
public class Eveniment_Muzica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @MapsId("evenimentId")
    @JoinColumn(name = "eveniment_id")
    Eveniment eveniment;

    @ManyToOne
    @MapsId("muzicaId")
    @JoinColumn(name = "muzica_id")
    Muzica muzica;

    public Eveniment_Muzica(Eveniment eveniment, Muzica muzica) {
        this.eveniment = eveniment;
        this.muzica = muzica;
    }

    public Eveniment getEveniment() {
        return eveniment;
    }

    public void setEveniment(Eveniment eveniment) {
        this.eveniment = eveniment;
    }

    public Muzica getMuzica() {
        return muzica;
    }

    public void setMuzica(Muzica muzica) {
        this.muzica = muzica;
    }
}
