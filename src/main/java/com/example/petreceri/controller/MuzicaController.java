package com.example.petreceri.controller;

import com.example.petreceri.domain.Locatie;
import com.example.petreceri.domain.Muzica;
import com.example.petreceri.dto.EvenimenteleLocatieiDto;
import com.example.petreceri.dto.LocatieDto;
import com.example.petreceri.dto.MuzicaDto;
import com.example.petreceri.mapper.LocatieMapper;
import com.example.petreceri.mapper.MuzicaMapper;
import com.example.petreceri.service.LocatieService;
import com.example.petreceri.service.MuzicaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
@RestController
@RequestMapping("/muzica")
public class MuzicaController {

    private MuzicaService muzicaService;
    private MuzicaMapper muzicaMapper;

    public MuzicaController(MuzicaService muzicaService, MuzicaMapper muzicaMapper) {
        this.muzicaService = muzicaService;
        this.muzicaMapper = muzicaMapper;
    }

    @PostMapping("/adauga")
    public ResponseEntity<Muzica> createMuzica(@RequestBody MuzicaDto muzicaDto) {
        Muzica muzica = muzicaMapper.muzicaRequestToMuzica(muzicaDto);
        Muzica createdmuzica = muzicaService.createMuzica(muzica);
        return ResponseEntity.created(URI.create("/muzica/" + createdmuzica.getId())).body(createdmuzica);
    }
    @GetMapping("/stilMuzica")
    public List<Muzica> listaMuzicadupaStil(String tip){return muzicaService.arataMuzicaDupaStil(tip);}
}
