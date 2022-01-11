package com.example.petreceri.dto;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.validation.constraints.Size;

public class MuzicaDto {
    @NotNull
    private String tip;
    @NotNull
    private String forma;
    @Size(min = 1, max = 50)
    private Integer nr;

    public MuzicaDto(){

    }

    public MuzicaDto(String tip, String forma, @Size(min = 1, max = 50) Integer nr) {
        this.tip = tip;
        this.forma = forma;
        this.nr = nr;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String froma) {
        this.forma = froma;
    }

    public Integer getNr() {
        return nr;
    }

    public void setNr(Integer nr) {
        this.nr = nr;
    }
}
