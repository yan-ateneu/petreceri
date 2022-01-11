package com.example.petreceri.repository;

import com.example.petreceri.domain.Eveniment;
import com.example.petreceri.domain.Eveniment_Muzica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Eveniment_MuzicaRepository extends JpaRepository<Eveniment_Muzica, Long> {
}
