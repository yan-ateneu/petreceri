package com.example.petreceri.mapper;

import com.example.petreceri.domain.Eveniment;
import com.example.petreceri.domain.Eveniment_Muzica;
import com.example.petreceri.dto.EvenimentDto;

public class Eveniment_MuzicaMapper {
    public Eveniment_Muzica eveniment_mRequestToEveniment_m(Eveniment_Muzica eveniment_muzica){
        return new Eveniment_Muzica(eveniment_muzica.getEveniment(), eveniment_muzica.getMuzica());
    }
}
