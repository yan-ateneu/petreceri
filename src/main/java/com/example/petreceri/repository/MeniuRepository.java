package com.example.petreceri.repository;

import com.example.petreceri.domain.Locatie;
import com.example.petreceri.domain.Meniu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeniuRepository extends JpaRepository<Meniu, Long> {
    Meniu findMeniuById(Long Id);
}
