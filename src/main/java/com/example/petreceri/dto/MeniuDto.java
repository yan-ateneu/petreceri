package com.example.petreceri.dto;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.validation.constraints.Size;

public class MeniuDto {
    @NotNull
    private String tip;
    @NotNull
    private Boolean alchool;
    @Size(min = 10, max = 1000)
    private Integer pret;

    public MeniuDto(){

    }
    public MeniuDto(String tip, Boolean alchool, @Size(min = 10, max = 1000) Integer pret) {
        this.tip = tip;
        this.alchool = alchool;
        this.pret = pret;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Boolean getAlchool() {
        return alchool;
    }

    public void setAlchool(Boolean alchool) {
        this.alchool = alchool;
    }

    public Integer getPret() {
        return pret;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }
}
