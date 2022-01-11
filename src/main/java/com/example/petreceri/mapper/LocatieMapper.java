package com.example.petreceri.mapper;

import com.example.petreceri.domain.Locatie;
import com.example.petreceri.dto.LocatieDto;
import org.springframework.stereotype.Component;

@Component
public class LocatieMapper {
    public Locatie locatieRequestToLocatie(LocatieDto locatieDto){
        return new Locatie(locatieDto.getDenumire(), locatieDto.getOras(),locatieDto.getTarif());
    }
}
