package com.example.petreceri.controller;

import com.example.petreceri.domain.Meniu;
import com.example.petreceri.domain.Muzica;
import com.example.petreceri.dto.MeniuDto;
import com.example.petreceri.dto.MuzicaDto;
import com.example.petreceri.mapper.MeniuMapper;
import com.example.petreceri.mapper.MuzicaMapper;
import com.example.petreceri.service.MeniuService;
import com.example.petreceri.service.MuzicaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/meniu")
public class MeniuController {
    private MeniuService meniuService;
    private MeniuMapper meniuMapper;

    public MeniuController(MeniuService meniuService, MeniuMapper meniuMapper) {
        this.meniuService = meniuService;
        this.meniuMapper = meniuMapper;
    }

    @PostMapping("/adauga")
    public ResponseEntity<Meniu> createMeniu(@RequestBody MeniuDto meniuDto) {
        Meniu meniu = meniuMapper.meniuRequestToMeniu(meniuDto);
        Meniu createmeniu = meniuService.createMeniu(meniu);
        return ResponseEntity.created(URI.create("/meniu/" + createmeniu.getId())).body(createmeniu);
    }
}
