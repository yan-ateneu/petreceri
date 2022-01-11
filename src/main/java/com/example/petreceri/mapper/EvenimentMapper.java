package com.example.petreceri.mapper;

import com.example.petreceri.domain.Eveniment;
import com.example.petreceri.dto.EvenimentDto;
import org.springframework.stereotype.Component;

@Component
public class EvenimentMapper {

    public Eveniment evenimentRequestToEveniment(EvenimentDto evenimentDto){
        return new Eveniment(evenimentDto.getDenumire(), evenimentDto.getBuget());
    }
}
