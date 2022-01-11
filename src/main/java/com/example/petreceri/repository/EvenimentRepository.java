package com.example.petreceri.repository;

import com.example.petreceri.domain.Eveniment;
import com.example.petreceri.domain.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvenimentRepository extends JpaRepository<Eveniment, Long> {
    Eveniment findEvenimentById(Long Id);
}
