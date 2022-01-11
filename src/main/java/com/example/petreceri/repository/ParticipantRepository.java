package com.example.petreceri.repository;

import com.example.petreceri.domain.Locatie;
import com.example.petreceri.domain.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long> {
    Participant findParticipantById(Long Id);
    @Query(value = "select * from participant p where p.varsta =:varsta", nativeQuery = true)
    List<Participant> arataParticipantiDupaVarsta(Integer varsta);
}
