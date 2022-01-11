package com.example.petreceri.mapper;

import com.example.petreceri.domain.Participant;
import com.example.petreceri.dto.ParticipantDto;
import org.springframework.stereotype.Component;

@Component
public class ParticipantMapper {
    public Participant participantRequestToParticipant(ParticipantDto participantDto){
        return new Participant(participantDto.getNume(), participantDto.getPrenume(), participantDto.getVarsta());
    }
}
