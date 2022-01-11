package com.example.petreceri.dto;

import com.sun.istack.NotNull;

import java.util.ArrayList;

public class EvenimenteleLocatieiDto {
    @NotNull
    Long id_loc;
    @NotNull
    ArrayList<Long> lista_id_evenimente=new ArrayList<>();

    public EvenimenteleLocatieiDto(Long id_loc, ArrayList<Long> lista_id_evenimente) {
        this.id_loc = id_loc;
        this.lista_id_evenimente = lista_id_evenimente;
    }

    public Long getId_loc() {
        return id_loc;
    }

    public void setId_loc(Long id_loc) {
        this.id_loc = id_loc;
    }

    public ArrayList<Long> getLista_id_evenimente() {
        return lista_id_evenimente;
    }

    public void setLista_id_evenimente(ArrayList<Long> lista_id_evenimente) {
        this.lista_id_evenimente = lista_id_evenimente;
    }
}
