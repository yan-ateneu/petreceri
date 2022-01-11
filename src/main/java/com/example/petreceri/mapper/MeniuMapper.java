package com.example.petreceri.mapper;

import com.example.petreceri.domain.Meniu;
import com.example.petreceri.domain.Muzica;
import com.example.petreceri.dto.MeniuDto;
import com.example.petreceri.dto.MuzicaDto;
import org.springframework.stereotype.Component;

@Component
public class MeniuMapper {
    public Meniu meniuRequestToMeniu(MeniuDto meniuDto){
        return new Meniu(meniuDto.getTip(),meniuDto.getAlchool(),meniuDto.getPret());
    }
}
