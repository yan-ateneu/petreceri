package com.example.petreceri.service;

import com.example.petreceri.domain.Eveniment;
import com.example.petreceri.domain.Locatie;
import com.example.petreceri.domain.Meniu;
import com.example.petreceri.exception.NoDataFoundException;
import com.example.petreceri.repository.LocatieRepository;
import com.example.petreceri.repository.MeniuRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MeniuService {
    private MeniuRepository meniuRepository;

    public MeniuService(MeniuRepository meniuRepository){
        this.meniuRepository=meniuRepository;
    }
    public Meniu createMeniu(Meniu meniu){
        return meniuRepository.save(meniu);
    }

    public List<Meniu> getAllmeniuri(){
        return meniuRepository.findAll();
    }
    public Meniu save(Meniu meniu){return meniuRepository.save(meniu);}

    public Meniu findMeniuById(Long id){
        return meniuRepository.findMeniuById(id);
    }

}
