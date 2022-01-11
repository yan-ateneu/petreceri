package com.example.petreceri.service;

import com.example.petreceri.domain.Locatie;
import com.example.petreceri.domain.Muzica;
import com.example.petreceri.repository.LocatieRepository;
import com.example.petreceri.repository.MuzicaRepository;
import com.example.petreceri.repository.ParticipantRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class LocatieServiceTest {
    @Mock
    private LocatieRepository locatieRepository;
    @Mock
    private EvenimentService evenimentService;
    @InjectMocks
    private LocatieService locatieService;

    @Test
    @DisplayName("Create locatie")
    void create(){

        Locatie locatie = new Locatie();
        locatie.setDenumire("Vila Bran");
        Locatie savedLocatie = new Locatie(1L,"Vila Bran","Bran",12);

        when(locatieRepository.save(locatie)).thenReturn(savedLocatie);

        Locatie result = locatieService.createLocatie(locatie);

        assertNotNull(result);
        assertEquals(savedLocatie.getId(), result.getId());

    }
}
