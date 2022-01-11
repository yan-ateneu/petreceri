package com.example.petreceri.dto;

import com.sun.istack.NotNull;

import java.util.ArrayList;

public class EvenimenteleMuziciiDto {
    @NotNull
    Long id_eveniment;
    @NotNull
    ArrayList<Long> lista_id_muzica=new ArrayList<>();

    public EvenimenteleMuziciiDto(Long id_eveniment, ArrayList<Long> lista_id_muzica) {
        this.id_eveniment = id_eveniment;
        this.lista_id_muzica = lista_id_muzica;
    }

    public Long getId_eveniment() {
        return id_eveniment;
    }

    public void setId_eveniment(Long id_eveniment) {
        this.id_eveniment = id_eveniment;
    }

    public ArrayList<Long> getLista_id_muzica() {
        return lista_id_muzica;
    }

    public void setLista_id_muzica(ArrayList<Long> lista_id_muzica) {
        this.lista_id_muzica = lista_id_muzica;
    }
}
