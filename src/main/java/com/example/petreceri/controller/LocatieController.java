package com.example.petreceri.controller;


import com.example.petreceri.domain.Locatie;
import com.example.petreceri.dto.EvenimenteleLocatieiDto;
import com.example.petreceri.dto.LocatieDto;
import com.example.petreceri.mapper.LocatieMapper;
import com.example.petreceri.service.LocatieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/locatii")
public class LocatieController {
    private LocatieService locatieService;
    private LocatieMapper locatieMapper;

    public LocatieController(LocatieService locatieService, LocatieMapper locatieMapper) {
        this.locatieService = locatieService;
        this.locatieMapper = locatieMapper;
    }

    @PostMapping("/adauga")
    public ResponseEntity<Locatie> createLocatie(@RequestBody LocatieDto locatieDto) {
        Locatie locatie = locatieMapper.locatieRequestToLocatie(locatieDto);
        Locatie createdlocatie = locatieService.createLocatie(locatie);
        return ResponseEntity.created(URI.create("/locatie/" + createdlocatie.getId())).body(createdlocatie);
    }
    @PostMapping("/EvenimenteleLocatiei")
    public ResponseEntity<Locatie> adaugaEvenimenteLaLocatie(@RequestBody EvenimenteleLocatieiDto evenimenteleLocatieiDto) {
        Locatie editatedlocatie=locatieService.adaugaEvenimenteInLocatie(evenimenteleLocatieiDto.getId_loc(),evenimenteleLocatieiDto.getLista_id_evenimente());
        return ResponseEntity.created(URI.create("/locatie/" + editatedlocatie.getId())).body(editatedlocatie);
    }
    @GetMapping("/{id}")
    public Locatie locatie(@PathVariable Long id) {
        return locatieService.getLocatie(id);
    }

    @GetMapping("/locatiiOras")
    public List<Locatie> listaLocatiiDinOras(String oras){return locatieService.arataToateLocatiileDinOras(oras);}
    @GetMapping
    public List<Locatie> getListalocatiei(){
        return locatieService.getAlllocatii();
    }
}
