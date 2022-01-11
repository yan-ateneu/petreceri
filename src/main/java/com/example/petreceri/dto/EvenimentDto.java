package com.example.petreceri.dto;

import com.sun.istack.NotNull;

import javax.validation.constraints.Size;

public class EvenimentDto {
    @NotNull
    private String denumire;

    @Size(min = 1000, max = 1000000)
    private Integer buget;

    public EvenimentDto(){

    }
    public EvenimentDto(String denumire, @Size(min = 1000, max = 1000000) Integer buget) {
        this.denumire = denumire;
        this.buget = buget;
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
