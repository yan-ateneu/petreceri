package com.example.petreceri.dto;

import com.sun.istack.NotNull;

import java.util.ArrayList;

public class MeniuriEvenimentDto {
    @NotNull
    Long id_even;
    @NotNull
    ArrayList<Long> lista_id_meniuri=new ArrayList<>();

    public MeniuriEvenimentDto(Long id_even, ArrayList<Long> lista_id_meniuri) {
        this.id_even = id_even;
        this.lista_id_meniuri = lista_id_meniuri;
    }

    public Long getId_even() {
        return id_even;
    }

    public void setId_even(Long id_even) {
        this.id_even = id_even;
    }

    public ArrayList<Long> getLista_id_meniuri() {
        return lista_id_meniuri;
    }

    public void setLista_id_meniuri(ArrayList<Long> lista_id_meniuri) {
        this.lista_id_meniuri = lista_id_meniuri;
    }
}
