package com.example.petreceri.mapper;

import com.example.petreceri.domain.Locatie;
import com.example.petreceri.domain.Muzica;
import com.example.petreceri.dto.MuzicaDto;
import org.springframework.stereotype.Component;

@Component
public class MuzicaMapper {
    public Muzica muzicaRequestToMuzica(MuzicaDto muzicaDto){
        return new Muzica(muzicaDto.getTip(),muzicaDto.getForma(),muzicaDto.getNr());
    }
}
