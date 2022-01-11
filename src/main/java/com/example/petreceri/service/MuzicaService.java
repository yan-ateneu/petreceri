package com.example.petreceri.service;

import com.example.petreceri.domain.Locatie;
import com.example.petreceri.domain.Muzica;
import com.example.petreceri.exception.NoDataFoundException;
import com.example.petreceri.repository.MuzicaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MuzicaService {
    private MuzicaRepository muzicaRepository;
    private EvenimentService evenimentService;

    public MuzicaService(MuzicaRepository muzicaRepository,EvenimentService evenimentService){
        this.evenimentService=evenimentService;
        this.muzicaRepository=muzicaRepository;
    }

    public Muzica save(Muzica muzica){return muzicaRepository.save(muzica);}

    public Muzica createMuzica(Muzica muzica){
        return muzicaRepository.save(muzica);
    }

    public Muzica getMuzica(Long id){
        Optional<Muzica> muzicaOptional = muzicaRepository.findById(id);
        if(muzicaOptional.isPresent()){
            return muzicaOptional.get();
        }
        else{
            throw new NoDataFoundException(":(");
        }
    }

    public List<Muzica> getAllMuzica(){
        return muzicaRepository.findAll();
    }
    public Muzica findMuzicaById(Long id){
        return muzicaRepository.findMuzicaById(id);
    }
    public List<Muzica> arataMuzicaDupaStil(String tip){
        return muzicaRepository.arataMuzicaDupaGen(tip);
    }

//    public Muzica adaugaEvenimenteInMuzica(Long id_muzica, List<Long> lista_id_evenimente){
//        Muzica muzica=findMuzicaById(id_muzica);
//        for(Long id : lista_id_evenimente){
//            muzica.getEvenimente().add(evenimentService.findEvenimentById(id));
//        }
//        muzicaRepository.save(muzica);
//        return muzica;
//    }
}
