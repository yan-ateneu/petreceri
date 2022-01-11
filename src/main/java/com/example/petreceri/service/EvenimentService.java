package com.example.petreceri.service;

import com.example.petreceri.domain.Eveniment;
import com.example.petreceri.domain.Locatie;
import com.example.petreceri.domain.Meniu;
import com.example.petreceri.domain.Participant;
import com.example.petreceri.exception.NoDataFoundException;
import com.example.petreceri.repository.EvenimentRepository;
import com.example.petreceri.repository.ParticipantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvenimentService {
    private EvenimentRepository evenimentRepository;
    private ParticipantService participantService;
    private MeniuService meniuService;

    public EvenimentService(EvenimentRepository evenimentRepository,ParticipantService participantService,MeniuService meniuService){
        this.evenimentRepository=evenimentRepository;
        this.participantService=participantService;
        this.meniuService=meniuService;
    }

    public Eveniment createEveniment(Eveniment eveniment){
        return evenimentRepository.save(eveniment);
    }

    public Eveniment getEveniment(Long id){
        Optional<Eveniment> evenimentOptional = evenimentRepository.findById(id);
        if(evenimentOptional.isPresent()){
            return evenimentOptional.get();
        }
        else{
            throw new NoDataFoundException(":(");
        }
    }

    public Eveniment save(Eveniment eveniment){return evenimentRepository.save(eveniment);}

    public List<Eveniment> getAllEvenimente(){
        return evenimentRepository.findAll();
    }

    public Eveniment findEvenimentById(Long id){
        return evenimentRepository.findEvenimentById(id);
    }

    public Eveniment adaugaParticipantiInEveniment(Long id_eveniment,List<Long> lista_id_participanti){
        Eveniment eveniment=findEvenimentById(id_eveniment);
        for(Long id : lista_id_participanti){
            Participant particiant=participantService.findParticipantById(id);
            particiant.setEveniment(eveniment);
            participantService.save(particiant);
        }
        return findEvenimentById(id_eveniment);
    }

    public Eveniment adaugaMeniuriInEveniment(Long id_eveniment,List<Long> lista_id_meniuri){
        Eveniment eveniment=findEvenimentById(id_eveniment);
        for(Long id : lista_id_meniuri){
            Meniu meniu=meniuService.findMeniuById(id);
            meniu.setEveniment(eveniment);
            meniuService.save(meniu);
        }
        return findEvenimentById(id_eveniment);
    }
//    public Eveniment adaugaMuzicaInEvenimente(Long id_eveniment,List<Long> lista_id_muzica){
//        Eveniment eveniment=findEvenimentById(id_eveniment);
//        for(Long id : lista_id_muzica){
//            eveniment.getListamuzica().add(muzicaService.findMuzicaById(id));
//        }
//        evenimentRepository.save(eveniment);
//        return eveniment;
//    }


}
