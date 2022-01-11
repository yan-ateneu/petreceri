package com.example.petreceri.controller;

import com.example.petreceri.domain.Locatie;
import com.example.petreceri.domain.Participant;
import com.example.petreceri.dto.ParticipantDto;
import com.example.petreceri.mapper.ParticipantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.petreceri.service.ParticipantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
@RestController
@RequestMapping("/participanti")
public class ParticipantController {
    private ParticipantService participantService;
    private ParticipantMapper participantMapper;

    public ParticipantController(ParticipantService participantService, ParticipantMapper participantMapper) {
        this.participantService = participantService;
        this.participantMapper = participantMapper;
    }

    @PostMapping("/adauga")
    public ResponseEntity<Participant> createParticipant(@RequestBody ParticipantDto participantDto) {
        System.out.println(participantDto.getNume());
        Participant participant = participantMapper.participantRequestToParticipant(participantDto);
        Participant createdParticipant = participantService.createParticipant(participant);
        return ResponseEntity.created(URI.create("/participant/" + createdParticipant.getId())).body(createdParticipant);
    }

    @GetMapping("/{id}")
    public Participant Participant(@PathVariable Long id) {
        return participantService.getParticipant(id);
    }

    @GetMapping
    public List<Participant> getListaParticipanti(){
        return participantService.getAllParticipanti();
    }

    @GetMapping("/VarstaParticipanti")
    public List<Participant> listaLocatiiDinOras(Integer varsta){return participantService.arataParticipantiDupaVarsta(varsta);}

}
