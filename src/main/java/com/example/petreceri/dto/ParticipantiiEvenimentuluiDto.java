package com.example.petreceri.dto;

import com.sun.istack.NotNull;

import java.util.ArrayList;

public class ParticipantiiEvenimentuluiDto {
    @NotNull
    Long id_even;
    @NotNull
    ArrayList<Long> lista_id_participanti=new ArrayList<>();

    public ParticipantiiEvenimentuluiDto(Long id_even, ArrayList<Long> lista_id_participanti) {
        this.id_even = id_even;
        this.lista_id_participanti = lista_id_participanti;
    }

    public Long getId_even() {
        return id_even;
    }

    public void setId_even(Long id_even) {
        this.id_even = id_even;
    }

    public ArrayList<Long> getLista_id_participanti() {
        return lista_id_participanti;
    }

    public void setLista_id_participanti(ArrayList<Long> lista_id_participanti) {
        this.lista_id_participanti = lista_id_participanti;
    }
}
