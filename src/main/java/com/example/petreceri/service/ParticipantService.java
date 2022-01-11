package com.example.petreceri.service;

import com.example.petreceri.domain.Eveniment;
import com.example.petreceri.domain.Muzica;
import com.example.petreceri.domain.Participant;
import com.example.petreceri.exception.NoDataFoundException;
import org.springframework.stereotype.Service;
import com.example.petreceri.repository.ParticipantRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipantService {
    private ParticipantRepository participantRepository;

    public ParticipantService(ParticipantRepository participantRepository){
        this.participantRepository=participantRepository;
    }

    public Participant save(Participant participant){return participantRepository.save(participant);}

    public Participant createParticipant(Participant participant){
        return participantRepository.save(participant);
    }

    public Participant getParticipant(Long id){
        Optional<Participant> participantOptional = participantRepository.findById(id);
        if(participantOptional.isPresent()){
            return participantOptional.get();
        }
        else{
            throw new NoDataFoundException(":(");
        }
    }
    public List<Participant> arataParticipantiDupaVarsta(Integer varsta){
        return participantRepository.arataParticipantiDupaVarsta(varsta);
    }
    public List<Participant> getAllParticipanti(){
        return participantRepository.findAll();
    }
    public Participant findParticipantById(Long id){
        return participantRepository.findParticipantById(id);
    }
}
