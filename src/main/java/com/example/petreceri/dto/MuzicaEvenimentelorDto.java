package com.example.petreceri.dto;

import com.sun.istack.NotNull;

import java.util.ArrayList;

public class MuzicaEvenimentelorDto {
    @NotNull
    Long id_muzica;
    @NotNull
    ArrayList<Long> lista_id_evenimente=new ArrayList<>();

    public MuzicaEvenimentelorDto(Long id_muzica, ArrayList<Long> lista_id_evenimente) {
        this.id_muzica = id_muzica;
        this.lista_id_evenimente = lista_id_evenimente;
    }

    public Long getId_muzica() {
        return id_muzica;
    }

    public void setId_muzica(Long id_muzica) {
        this.id_muzica = id_muzica;
    }

    public ArrayList<Long> getLista_id_evenimente() {
        return lista_id_evenimente;
    }

    public void setLista_id_evenimente(ArrayList<Long> lista_id_evenimente) {
        this.lista_id_evenimente = lista_id_evenimente;
    }
}
