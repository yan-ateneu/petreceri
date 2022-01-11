package com.example.petreceri.repository;

import com.example.petreceri.domain.Locatie;
import com.example.petreceri.domain.Muzica;
import com.example.petreceri.domain.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MuzicaRepository extends JpaRepository<Muzica, Long> {
    Muzica findMuzicaById(Long Id);
    @Query(value = "select * from muzica m where m.stil =:stil", nativeQuery = true)
    List<Muzica> arataMuzicaDupaGen(String stil);
}
