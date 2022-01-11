package com.example.petreceri.controller;

import com.example.petreceri.domain.*;
import com.example.petreceri.dto.EvenimentDto;
import com.example.petreceri.dto.EvenimenteleLocatieiDto;
import com.example.petreceri.dto.MeniuriEvenimentDto;
import com.example.petreceri.dto.ParticipantiiEvenimentuluiDto;
import com.example.petreceri.mapper.EvenimentMapper;
import com.example.petreceri.service.EvenimentService;
import com.example.petreceri.service.Eveniment_MuzicaService;
import com.example.petreceri.service.LocatieService;
import com.example.petreceri.service.MuzicaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/evenimente")
public class EvenimentController {
    private EvenimentService evenimentService;
    private EvenimentMapper evenimentMapper;
    private MuzicaService muzicaService;
    private Eveniment_MuzicaService eveniment_muzicaService;
    private LocatieService locatieService;

    public EvenimentController(LocatieService locatieService,EvenimentService evenimentService, EvenimentMapper evenimentMapper,Eveniment_MuzicaService eveniment_muzicaService, MuzicaService muzicaService) {
        this.locatieService=locatieService;
        this.evenimentService = evenimentService;
        this.evenimentMapper = evenimentMapper;
        this.eveniment_muzicaService=eveniment_muzicaService;
        this.muzicaService = muzicaService;
    }
    @PostMapping("/adauga")
    public ResponseEntity<Eveniment> createEveniment(@RequestBody EvenimentDto evenimentDto) {
        System.out.println(evenimentDto.getDenumire());
        Eveniment eveniment = evenimentMapper.evenimentRequestToEveniment(evenimentDto);
        Eveniment createdeveniment = evenimentService.createEveniment(eveniment);
        return ResponseEntity.created(URI.create("/eveniment/" + createdeveniment.getId())).body(createdeveniment);
    }
    @PostMapping("/ParticipantiiEvenimentului")
    public ResponseEntity<Eveniment> adaugaPaticipantiLaEveniment(@RequestBody ParticipantiiEvenimentuluiDto participantiiEvenimentuluiDto) {
        Eveniment editatedeveniment=evenimentService.adaugaParticipantiInEveniment(participantiiEvenimentuluiDto.getId_even(),participantiiEvenimentuluiDto.getLista_id_participanti());
        return ResponseEntity.created(URI.create("/eveniment/" + editatedeveniment.getId())).body(editatedeveniment);
    }
    @PostMapping("/MeniurileEvenimentului")
    public ResponseEntity<Eveniment> adaugaMeniuriLaEveniment(@RequestBody MeniuriEvenimentDto meniuriEvenimentDto) {
        Eveniment editatedeveniment=evenimentService.adaugaMeniuriInEveniment(meniuriEvenimentDto.getId_even(),meniuriEvenimentDto.getLista_id_meniuri());
        return ResponseEntity.created(URI.create("/eveniment/" + editatedeveniment.getId())).body(editatedeveniment);
    }
    @PostMapping("/AdaugaMuzica")
    public ResponseEntity<Eveniment>adaugaMuzicalaEveniment(@RequestBody Long id_eveniment, Long id_muzica){

        Eveniment eveniment = evenimentService.findEvenimentById(id_eveniment);
        Muzica muzica = muzicaService.findMuzicaById(id_muzica);

        Eveniment_Muzica eveniment_muzica=new Eveniment_Muzica(eveniment,muzica);

        eveniment_muzicaService.createE_M(eveniment_muzica);
        return ResponseEntity.created(URI.create("/eveniment/" + eveniment.getId())).body(eveniment);
    }


    @GetMapping("/{id}")
    public Eveniment eveniment(@PathVariable Long id) {
        return evenimentService.getEveniment(id);
    }

    @GetMapping
    public List<Eveniment> getAllEvenimente(){
        return evenimentService.getAllEvenimente();
    }

    @GetMapping("/IncadrareBuget")
    public Boolean buget( Long id_even) {
        Eveniment eveniment=evenimentService.getEveniment(id_even);
        Integer tarif_locatie=locatieService.getLocatie(eveniment.getId()).getTarif();
        Integer tarif_meniuri=0;
        for(Meniu meniu:eveniment.getListameniuri())
        {
             tarif_meniuri+=meniu.getPret();
        }
        if(tarif_locatie+tarif_meniuri<eveniment.getBuget())return Boolean.TRUE;
        else return Boolean.FALSE;
    }
}
