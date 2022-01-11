package com.example.petreceri.repository;

import com.example.petreceri.domain.Eveniment;
import com.example.petreceri.domain.Locatie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LocatieRepository extends JpaRepository<Locatie, Long> {
    Locatie findLocatieById(Long Id);
    @Query(value = "select * from locatie l where l.oras =:oras", nativeQuery = true)
    List<Locatie> arataToateLocatiileDinOras(String oras);
}
