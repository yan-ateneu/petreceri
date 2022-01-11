package com.example.petreceri.dto;

import com.sun.istack.NotNull;

import javax.validation.constraints.Size;

public class LocatieDto {
    @NotNull
    private String denumire;

    @NotNull
    private String oras;

    @Size(min = 100, max = 10000)
    private Integer tarif;

    public LocatieDto(){

    }
    public LocatieDto(String denumire, String oras, @Size(min = 100, max = 10000) Integer tarif) {
        this.denumire = denumire;
        this.oras = oras;
        this.tarif = tarif;
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
