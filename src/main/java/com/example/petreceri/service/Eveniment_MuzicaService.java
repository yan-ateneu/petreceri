package com.example.petreceri.service;

import com.example.petreceri.domain.Eveniment;
import com.example.petreceri.domain.Eveniment_Muzica;
import com.example.petreceri.domain.Meniu;
import com.example.petreceri.repository.Eveniment_MuzicaRepository;
import com.example.petreceri.repository.MeniuRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Eveniment_MuzicaService {
    private Eveniment_MuzicaRepository eveniment_muzicaRepository;

    public Eveniment_MuzicaService(Eveniment_MuzicaRepository eveniment_muzicaRepository){
        this.eveniment_muzicaRepository=eveniment_muzicaRepository;
    }
    public Eveniment_Muzica createE_M(Eveniment_Muzica eveniment_muzica){
        return eveniment_muzicaRepository.save(eveniment_muzica);
    }
}
