package com.example.petreceri.dto;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.validation.constraints.Size;

public class ServiceDto {
    @NotNull
    private String tip;
    @Size(min = 10, max = 11234)
    private Integer pret;

    public ServiceDto(){

    }
    public ServiceDto(String tip, @Size(min = 10, max = 11234) Integer pret) {
        this.tip = tip;
        this.pret = pret;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Integer getPret() {
        return pret;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }
}
