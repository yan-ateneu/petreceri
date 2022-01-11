package com.example.petreceri.service;

import com.example.petreceri.domain.Eveniment;
import com.example.petreceri.domain.Locatie;
import com.example.petreceri.exception.NoDataFoundException;
import com.example.petreceri.repository.LocatieRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class LocatieService {
    private EvenimentService evenimentService;
    private LocatieRepository locatieRepository;

    public LocatieService(LocatieRepository locatieRepository,EvenimentService evenimentService){
        this.locatieRepository=locatieRepository;
        this.evenimentService=evenimentService;
    }

    public Locatie createLocatie(Locatie locatie){
        return locatieRepository.save(locatie);
    }

    public Locatie getLocatie(Long id){
        Optional<Locatie> locatieOptional = locatieRepository.findById(id);
        if(locatieOptional.isPresent()){
            return locatieOptional.get();
        }
        else{
            throw new NoDataFoundException(":(");
        }
    }

    public List<Locatie> getAlllocatii(){
        return locatieRepository.findAll();
    }

    public Locatie findLocatieById(Long id){
        return locatieRepository.findLocatieById(id);
    }
    public Locatie adaugaEvenimenteInLocatie(Long id_locatie,List<Long> lista_id_evenimente){
        Locatie locatie=findLocatieById(id_locatie);
        for(Long id : lista_id_evenimente){
            Eveniment eveniment=evenimentService.findEvenimentById(id);
            eveniment.setLocatie(locatie);
            evenimentService.save(eveniment);
        }
        return findLocatieById(id_locatie);
    }
    public List<Locatie> arataToateLocatiileDinOras(String oras){
        return locatieRepository.arataToateLocatiileDinOras(oras);
    }
}
